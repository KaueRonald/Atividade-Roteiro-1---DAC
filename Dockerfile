FROM ubuntu:22.04
RUN apt-get update && apt-get install nginx -y
COPY container_docker_novo /tmp/container_docker_novo
EXPOSE 8080
CMD bash