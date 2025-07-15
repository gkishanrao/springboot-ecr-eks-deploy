# springboot-ecr-eks-deploy
# This project demonstrates deploying a Spring Boot application to AWS Elastic Kubernetes Service (EKS) using a container image hosted on Amazon Elastic Container Registry (ECR).


<img width="1215" height="632" alt="image" src="https://github.com/user-attachments/assets/0fd3d2e6-ed83-4c67-8538-fcfdb9ccbc93" />

1. AWS Account
2. AWS ClI
3. Docker

# Run the Docker
           Docker Desktop Installer.exe

       docker build -t <JAR_FILENAME> .


## 📦 ECR Image
Create ECR Private registry then select repository
View push commands<img width="1821" height="582" alt="image" src="https://github.com/user-attachments/assets/02a6e127-037d-4fc9-b93a-a08b13e2a6ba" />

 1 Retrieve an authentication token and authenticate your Docker client to your registry. Use the AWS CLI:

              aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 516611517801.dkr.ecr.us-east-1.amazonaws.com
              
 Note: If you receive an error using the AWS CLI, make sure that you have the latest version of the AWS CLI and Docker installed.

 2.  Build your Docker image using the following command. For information on building a Docker file from scratch see the instructions here . You can skip this step if your image is already built:
    
          docker build -t springboot-eks .
          
 3. After the build completes, tag your image so you can push the image to this repository:

            docker tag springboot-eks:latest 516611517801.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest
            
 4. Run the following command to push this image to your newly created AWS repository:

          docker push 516611517801.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest



<img width="1821" height="623" alt="image" src="https://github.com/user-attachments/assets/22bf970a-59bb-4d16-9ad0-6afc97612492" />


```
516611517801.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest


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




