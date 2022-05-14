package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.Address;
import com.delivery.repo.AddressRepo;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AddressService {
	
	// Declare a repository interface variable
	private final AddressRepo addressRepo;

	@Autowired
	public AddressService(AddressRepo addressRepo) {
		this.addressRepo = addressRepo;
	}

	// Implementation of add new address to database
	public Address saveAddress(Address address) {		
		return addressRepo.save(address);
	}

	// Implementation of get all address
	public List<Address> getAll() {
		return  addressRepo.findAll();
	}

	// Implementation of get address by id
	public Address getById(String id) {
		return addressRepo.findById(id).get();
	}

	// Implementation of delete address by id
	public String deleteById(String id) {
		Address address = null;

		try {
			address = addressRepo.findById(id).get();
			if (address != null) {
				addressRepo.deleteById(id);
				return "Item delete success";
			} else {
				return "Item Does not exist";
			}
		} catch (NoSuchElementException e) {
			return "Item delete ERROR";
		}
	}

	// Implementation of update address
	public String updateAddress(Address address) {
		Address local = null;

		try {
			local = addressRepo.findById(address.getId()).get();
			if (local != null) {
				addressRepo.save(address);
				return "Item update success";
			} else {
				return "Item Does not exist";
			}
		} catch (NoSuchElementException e) {
			return "Item update ERROR";
		}
	}

	// Implementation of get calculated delivery value
	public double calDeliveryCost(Address address) {
		String dist = address.getDistrict();
		double result = calculateDeliveryCharge(dist);
		return result;
	}
	
	// Implementation of Delivery cost checker
	public double calculateDeliveryCharge(String district) {
		
		double price = 100;
		
		if (district.equals("Ampara")) {
			return price + 350.00;
		} else if (district.equals("Anuradhapura")) {
			return price + 290.00;
		} else if (district.equals("Badulla")) {
			return price + 400.00;
		} else if (district.equals("Colombo")) {
			return price + 100.00;
		} else if (district.equals("Galle")) {
			return price + 200.00;
		} else if (district.equals("Gampaha")) {
			return price + 150.00;
		} else if (district.equals("Hambantota")) {
			return price + 250.00;
		} else if (district.equals("Jaffna")) {
			return price + 500.00;
		} else if (district.equals("Kalutara")) {
			return price + 180.00;
		} else if (district.equals("Kandy")) {
			return price + 220.00;
		} else if (district.equals("Kegalle")) {
			return price + 180.00;
		} else if (district.equals("Kilinochchi")) {
			return price + 420.00;
		} else if (district.equals("Kurunegala")) {
			return price + 210.00;
		} else if (district.equals("Mannar")) {
			return price + 450.00;
		} else if (district.equals("Matale")) {
			return price + 180.00;
		} else if (district.equals("Matara")) {
			return price + 280.00;
		} else if (district.equals("Moneragala")) {
			return price + 270.00;
		} else if (district.equals("Mullaitivu")) {
			return price + 470.00;
		} else if (district.equals("Nuwara Eliya")) {
			return price + 340.00;
		} else if (district.equals("Polonnaruwa")) {
			return price + 300.00;
		} else if (district.equals("Puttalam")) {
			return price + 410.00;
		} else if (district.equals("Ratnapura")) {
			return price + 210.00;
		} else if (district.equals("Trincomalee")) {
			return price + 340.00;
		} else if (district.equals("Vavuniya")) {
			return price + 390.00;
		} else {
			return price;
		}
	}
}
