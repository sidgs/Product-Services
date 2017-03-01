#Product-Services
Import as a maven project.

Change version of java according to the system in pom.xml.

Change the jdbc password in application.properties

Create 4 tables in Mysql:
Member,Product,Services,Provider

CREATE TABLE product (
id int(11) NOT NULL PRIMARY KEY auto_increment,
description varchar(255)
product_brand varchar(255)
product_id int(11)
product_image varchar(255)
product_name varchar(255)
product_style varchar(255)
)

CREATE TABLE member(
id int(11) NOT NULL PRIMARY KEY auto_increment
first_name varchar(45)
last_name varchar(45)
email varchar(45)
gender varchar(45)
tele_phone varchar(45)
userid varchar(45)
)

CREATE TABLE service (
service_id int(11) NOT NULL PRIMARY KEY auto_increment,
service_name varchar(255)
)

CREATE TABLE provider (
provider_id int(11) NOT NULL PRIMARY KEY auto_increment,
provider_name varchar(255)
)

####Do a maven clean build and deploy the war file onto tomcat and run the URL: https://localhost:8080/Product-Services
