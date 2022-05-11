# DeliveryGateway API

# Docker Compose Build
```
docker-compose build
```

# Docker Compose Run
```
docker-compose up
```

# Kubernetes Apply
```
kubectl apply -f k8s/mongo-deploy.yml
kubectl apply -f k8s/deployment.yml
kubectl apply -f k8s/service.yml
```

# Kubernetes Delete Deployments
````
kubectl delete deployment mongo-deployment
kubectl delete deployment delivery-gateway-api-deployment
````

# Kubernetes Port-Forward
```
kubectl port-forward svc/delivery-gateway-api-service 8080:8080
```
