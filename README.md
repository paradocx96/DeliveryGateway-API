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

# Delete Kubernetes Deployments
````
kubectl delete deployment delivery-gateway-api-deployment
kubectl delete deployment mongo-deployment
````