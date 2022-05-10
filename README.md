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
kubectl apply -f k8s/mongo-config.yaml
kubectl apply -f k8s/mongo-secret.yaml
kubectl apply -f k8s/mongo-deploy.yaml
kubectl apply -f k8s/mongo-service.yaml

kubectl apply -f k8s/deploy.yaml
kubectl apply -f k8s/service.yaml
```

# Kubernetes Delete Deployments
````
kubectl delete deployment delivery-gateway-api-deployment
kubectl delete deployment mongo-deployment
````

# Kubernetes Port-Forward
```
kubectl port-forward svc/delivery-gateway-api-service 8080:8080
```
