# Employee Meal Tracking Assistant




[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)  
[![DOI](https://zenodo.org/badge/409424195.svg)](https://zenodo.org/badge/latestdoi/409424195)

[![Manual Action](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant/actions/workflows/release.yml/badge.svg)](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant/actions/workflows/release.yml)
![GitHub language count](https://img.shields.io/github/languages/count/HarshBathija/Employee-Meal-Tracking-Assistant)
[![GitHub commits](https://badgen.net/github/last-commit/HarshBathija/Employee-Meal-Tracking-Assistant)](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant)
[![GitHub pull-requests](https://img.shields.io/github/issues-pr/HarshBathija/Employee-Meal-Tracking-Assistant)](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant)
[![GitHub-size](https://img.shields.io/github/languages/code-size/HarshBathija/Employee-Meal-Tracking-Assistant)](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant)
[![GitHub issues](https://img.shields.io/github/issues/HarshBathija/Employee-Meal-Tracking-Assistant)](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant)
[![GitHub-closed-issues](https://img.shields.io/github/issues-closed-raw/HarshBathija/Employee-Meal-Tracking-Assistant)](https://github.com/HarshBathija/Employee-Meal-Tracking-Assistant)


<img src="docs/images/cover_image.jpg" height="300" width="600"/> 

---

# Description

This project is an automated system designed for the University’s Dining Department to keep track of the employee’s meals, through a check on their clock-in time, clock-out time and number of working hours per week.

This system provides the administrator with the list of employees who did not follow their respective dining meal rules.


---

The below video will give a walkthrough of our application.






---


## TechStack
<img src="https://brandslogos.com/wp-content/uploads/images/large/spring-logo.png" width="50"/> <img src="docs/images/postgre.png" width="50"/> <img src="docs/images/AngularJS-Shield.svg" width="50"/> <img src="https://cdn.pixabay.com/photo/2017/08/05/11/16/logo-2582748_1280.png" width = "50"/> <img src="https://cdn.pixabay.com/photo/2017/08/05/11/16/logo-2582747_1280.png" width = "50"/> <img src="https://cdn.freelogovectors.net/wp-content/uploads/2020/11/javascript_logo-768x873.png" width = "50"/>

<br>

<p> Java Spring </p>
<p> PostGreSql </p>
<p> Angular </p>
<p> HTML </p>
<p> CSS </p>
<p> JavaScript </p>

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
git clone https://github.com/HarshBathija/EmTa.git
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
git clone https://github.com/HarshBathija/EmTa.git
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

# Future Roadmap

Phase 2
 - Adding other resturants along with their respective menus, and integrating it with our system.
 - User Interface for fetching student's clock-in and clock-out time at the respective work location.
 - Sending auto generated report to respective employer's supervisor.

Phase 3
 - Configuring card scanning functionality to get student details.
 - Extending this system to various Student Employee Services in different universities.

---

# Authors

1. Aditya Ravikant Jadhav (ajadhav3@ncsu.edu)
2. Harsh Vijay Bathija (hbathij@ncsu.edu)
3. Ashritha Bommagani (abommag@ncsu.edu)
4. Abhishek Arvindkumar Upadhyay (aaupadhy@ncsu.edu)
5. Akash Mukesh Sanghani (amsangha@ncsu.edu)

---

# Contribution
Please see our CONTRIBUTING.md for instructions on how to contribute to the repository and assist us in improving the tracking system.

---

# License

This project is licensed under the MIT License



