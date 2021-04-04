A Restful CRUD API for book management using Spring Boot 2.x , Spring Data JPA,Hibernate,H2-database and Swagger documentation with containerization using Docker.

Steps for executing :

1.	Clone/Download the repository.

$ git clone https://github.com/papicella/spring-book-service.git

2.	Open the project in the IDE (Netbeans/Intellij Idea/Eclipse) and open the mvnw.cmd in terminal.Execute the below command to build the image.

   mvnw.cmd spring-boot:build-image

3. 	Execute the below command to run the container

   docker run -p 8080:8080 bookservice:0.0.1-SNAPSHOT

4.	Run the below command to get the list of running containers :

   docker ps

5.	After executing above steps without any errors and docker containers are up and running, open the browser and navigate to below url which provides the info about the endpoints:
   
   http://localhost:8080/swagger-ui/index.html

Troubleshooting

Any errors related to "connection link failure" is seen while starting/running containers then it might be due to the MySQL hostname use in the application database connection. Run the below command to get the hostname of the MySQL and replace it

   docker inspect {CONTAINER-ID}



![image](https://user-images.githubusercontent.com/62092482/113513360-a6f34e80-9569-11eb-9066-7ab0c921491e.png)




