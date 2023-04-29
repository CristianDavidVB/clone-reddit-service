
<div align="center">
    <h1>Clone Reddit Service</h1>
    <img src="pictures/reddit.png" width="200" height="200">
</div>

## Purpose

The purpose of this project is to demonstrate my knowledge in the spring framework with microservices among other technologies that will be implemented in the following project

## Description
This project is a clone of the most famous blogging platform "Reddit" replicating some aspects of it and developing it in microservices.

## Installation

### Clone the repository
    
```shell
git clone git@github.com:CristianDavidVB/clone-reddit-service.git

cd clone-reddit-service
```

## Requirements

- [JDK 17](https://adoptium.net/temurin/releases/)
- Maven
- Postgresql
- Mysql
- MongoDB

## Docker
[Docker](https://www.docker.com/) you must modify the words between <>

Container Posgresql

- Write in bash
```shell
docker run --name <Here is the container name> -e POSTGRES_USER=<Your_User> -e POSTGRES_PASSWORD=<Your_Password> -p <other number>:5432 -d postgres:14
```
Container MySQL
- Write in bash
```shell
docker run --name <Here_is_the_container_name> -e MYSQL_ROOT_PASSWORD=<Your_Password> -p <Other_number>:3306 -d mysql:8
```
## MongoDB
[MongoDB](https://www.mongodb.com/)

### Steps to connect to mongoDB
- Click here

<img src="pictures/createbd.png">

- This option that is free

<img src="pictures/2do.png">

- Any of these 3 options

<img src="pictures/3ro.png" width="400" height="100">

- Choose the one with the lowest latency

<img src="pictures/4to.png" width="500" height="300">

- Click Create Cluster

<img src="pictures/5to.png" width="500" height="200">

Click to Browse Collections

<img src="pictures/6to1.png" width="500" height="100">

- Click Collections and Create Database

<img src="pictures/7mo.png" width="300" height="50">

- Name database

<img src="pictures/8vo.png">

- Click Conection

<img src="pictures/inicio.png" width="500" height="100">

- Click Shell

<img src="pictures/9no.png" width="500" height="100">

- Copy the connection

<img src="pictures/10t.png">

- Added file service-posts.yml

<img src="pictures/urimongo.png">

## Running the application locally

Order to execute the services

- ConfigApplication
- EurekaApplication
- Any service except gateway
- GatewayApplication

<img src="pictures/serviciosrun.png">