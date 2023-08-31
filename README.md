# Grails 4.0.1 CRUD Operations Project ( # Grails 4.0.1-framework-JAVA )

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Setup and Configuration](#setup-and-configuration)
- [CRUD Operations](#crud-operations)
- [Database Interaction](#database-interaction)
- [Build and Execution](#build-and-execution)
- [Conclusion](#conclusion)
- [Future Improvements](#future-improvements)
- [References](#references)

## Introduction
This project showcases the implementation of CRUD (Create, Read, Update, Delete) operations using the Grails framework, MySQL database, and related technologies.


## Technologies Used
- Grails
- Groovy
- Spring
- SQLYog
- Gradle
- xampp

  
## Setup and Configuration
1. Install Grails- 4.0.1, Groovy-3.0.19 and SQLYog.
2. Configure the `application.yml` for database connection details.
3. follow some basic tutorial to create domain. use generate-all command to generate controllers, services and views.  

## CRUD Operations
- Basic crud by clicking action related buttons. 

## Database Interaction with SQLYog
- In this case you have to remove evrything related to MySql workbench /Mysql from your pc/laptop's program files { not program files(X86) } and Program Data. find
- find promgram data folder from hidden files. Then install sqlog as basic. I havent use any password for creating my db connection. 

## Build and Execution
1. Use Gradle to manage dependencies. this part is crutial. In this phase you have to use correct MySQL Connector Java from this link (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28). If this not working for you then change the version. it will works. Now we need to know where should we use this code,right? It is in build.gradle file under dependencies portion and try to paste the command/code after this line  runtime "org.glassfish.web:el-impl:2.1.2-b03".   though it set hibernate by default you can comment this line--  //runtime "com.h2database:h2". Mind it always start apache, tomcat,Mysql. If you can not start Mysql .then open task manager find mysqlid then right click on it and click on end task option. Now try again to start mysql in xampp it will work.

2. Now come to conf folder/directory. create a nw folder under this folder name config / whatever you want. then copy create a file named application.yml. i know this file already exists in spring folder. But do again some how it does not load driverclass properly. Then check my code paste it there. and change environment portions url which is actually jdbc url for java. this is the Url--->  url: "jdbc:mysql://localhost/mafuz?useUnicode=yes&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" . here u have to change the name "mafuz" according to you database name. Obiously u have create you database first in sqlyog.
  
3. now go to the spring folder and open the application.yml file. and configure it according to given code.

4. now things are all set for you.  

   

## Conclusion
In this project, successful CRUD operations using Grails, Groovy, and Spring were implemented. The project demonstrates effective use of these technologies.

## Future Improvements
- Now i will try to do migration and apply relationship among database. 

## References
- https://github.com/hmtmcse-com/grails-tutorial-contacts-book
- https://www.djamware.com/post/5dee230f730254515e53f7df/grails-4-tutorial-easy-to-build-crud-web-application
