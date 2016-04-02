To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.




 TAG, PUSH AND PULL YOUR IMAGE IN DOCKER HUB:

 PUSH:
 1* create a Dockerfile locally

 2* build docker image
 eg: docker build -t <image_name> .

 3* run the image
 eg: docker run <image_name_inlocal>

 TAG:
 4* tag the Dockerfile to dockerhub account
 eg: docker tag e9e640817f7f anntomie/docker-whale:latest
 docker tag <image_id> <accountname>/<image_name>:latest

 5* login to docker hub
 eg: docker login --username=anntomie --email=666ann@gmail.com

 6* push image to the docker hub
 eg: docker push anntomie/docker-whale

 PULL:
 7* remove the image from local ( if there is an identical image in your local)
 eg: docker rmi -f <ID/<image_name>

 8* push and load the image into your local with docker run
 eg: docker run <account>/image
     docker run anntomie/docker-whale
