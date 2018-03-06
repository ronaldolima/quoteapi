# !/bin/bash
# Setup quote api

# Java
sudo apt-get update
sudo apt-get install default-jre
sudo apt-get install default-jdk

# Maven
sudo apt-get install maven

# Git
apt-get install git

# Project
cd /opt
git clone .....

# Docker
sudo apt-get update
sudo apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D
sudo apt-add-repository 'deb https://apt.dockerproject.org/repo ubuntu-xenial main'
sudo apt-get update
sudo apt-cache policy docker-engine
sudo apt-get install -y docker-engine

# RabbitMQ
docker pull rabbitmq
docker run -it --hostname my-rabbit-management --name rabbit-management -e RABBITMQ_DEFAULT_USER=rabbitusr -e RABBITMQ_DEFAULT_PASS=rabbitpass -p 8181:15672 rabbitmq:3-management


# PostGres
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | \
sudo apt-key add -
sudo apt-get update
apt-get install postgresql-9.6
sudo -i -u postgres
sudo -u postgres createdb carinsurance
sudo -u postgres psql
ALTER USER postgres PASSWORD 'root';