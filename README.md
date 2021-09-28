# Employee Meal Tracking Assistant




[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)   ![GitHub language count](https://img.shields.io/github/languages/count/HarshBathija/Employee-Meal-Tracking-Assistant)




<img src="docs/images/cover_image.jpg" height="300" width="600"/> 

---

# Description

This is a automative system made for University's Dining department to keep track of the employee meals through a check on their clock in, clock out time and no of hours worked.
The system provides administrators with a list of employees who didn't follow their meal rules.

---

The below video will give a walkthrough of our application.






---


## TechStack
<img src="docs/images/AngularJS-Shield.svg" width="50"/> 
<img src="https://brandslogos.com/wp-content/uploads/images/large/spring-logo.png" width="50"/>
<img src="docs/images/postgre.png" width="50"/> 

<br>

---

## Backend Local Installation
To run this project locally, you need to follow the below steps:<br>
NOTE: Make sure you have git, any IDE(VScode or Eclipse) and Gradle wrapper installed.
  * [Git Installation Guide](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
  * [VSCode Installation Guide](https://code.visualstudio.com/docs/setup/setup-overview)
  * [Eclipse Installation Guide](https://www.eclipse.org/downloads/packages/installer)
  * [Gradle Installation Guide](https://docs.gradle.org/current/userguide/installation.html)

1. Clone the repository
```
git clone https://github.com/HarshBathija/Meal-Tracking-Assistant.git
```
2. Go the the repository
```
cd Meal-Tracking-Assistant
```
3. Run the gradle build command to make sure you have all the dependencies installed.
```
./gradlew build
```
4. On a Command Prompt/Terminal, run ```generated jar```.
```
java -jar /build/libs/demo-0.0.1-SNAPSHOT.jar
```

## Run locally using Docker
Our application is docker-compatible configured and you have to follow below steps to run the docker on local:<br>
Note : Make sure you have a docker desktop or docker client installed on your system
  * [Docker Desktop Installation Guide](https://docs.docker.com/get-docker/)

1. Clone the repository
```
git clone https://github.com/HarshBathija/Meal-Tracking-Assistant.git
```
2. Go the the repository
```
cd Meal-Tracking-Assistant
```
3. Run the docker build command
```
docker build --tag employee-meal-tracking-assistant:1.0 .
```
4. Run the built docker image on local Container
```
docker run -dp 8080:8080 employee-meal-tracking-assistant:1.0
```

5. Test the backend application using below api
```
GET localhost:8080/healthCheck
Response :- "App is Running"
```



---

# Contribution

---

# License





