# springboot-ecr-eks-deploy
# This project demonstrates deploying a Spring Boot application to AWS Elastic Kubernetes Service (EKS) using a container image hosted on Amazon Elastic Container Registry (ECR).


<img width="1215" height="632" alt="image" src="https://github.com/user-attachments/assets/0fd3d2e6-ed83-4c67-8538-fcfdb9ccbc93" />

## 📦 ECR Image

```
516611517801.dkr.ecr.us-east-1.amazonaws.com/spring-boot:latest

```
## 🚀 EKS Cluster Setup

Create an EKS cluster using `eksctl`:

```
eksctl create cluster \
  --name springboot \
  --version 1.32 \
  --nodes 1 \
  --node-type t2.small \
  --region us-east-1
```

# Update your local kubeconfig:

```
aws eks --region us-east-1 update-kubeconfig --name springboot

```
🛠️ Deploy to Kubernetes

```
kubectl apply -f application.yml
```
```
kubectl get pods

```
# Check service status:

```
kubectl get svc

```
🌐 Application URL

# Once the service is up, access your application at:

```
http://a13892705a5b44922a527b24763031d6-1261853838.us-east-1.elb.amazonaws.com/hello
```




