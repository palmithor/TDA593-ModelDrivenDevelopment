[![Build Status](https://travis-ci.org/palmithor/TDA593-ModelDrivenDevelopment.svg?branch=impl2)](https://travis-ci.org/palmithor/TDA593-ModelDrivenDevelopment)

TDA593-ModelDrivenDevelopment
=============================

Chalmers class of Model Driven Development

Erik Tholén 920928-0537 tholene@student.chalmers.se

Caroline Kabat 891016-4881 kabat@student.chalmers.se

Simon Persson 920417-1293 simpers@student.chalmers.se

Pálmi Þór Valgeirsson 880712-4493 palmi@student.chalmers.se

Carl Jansson 911108-4878 carlja@student.chalmers.se


# Getting started
## Introduction
The repository really includes different components. First of all there are some model components creted using Papyrus, second of all a Java REST web application built using Ninja Framework. Last but not least there is a gulp, angular component with a webapp that consumes the REST service.

## Prerequisites
* npm
* bower
* maven
* java8
* gulp


## REST Java Web App
To start the REST service simple maven commands are sufficient
```
mvn clean package
mvn jetty:run
```

## Angular Web App
The Angular WebApp is located in a folder under the root called 'webapp'. To get started with it you need to install the dependencies and run it with gulp. The gulp build does create a build inside the assets folder of the REST web app. So it will be a single deployment for botht the REST service and the Angular web app.
```
cd webapp
npm install
bower install
gulp
```