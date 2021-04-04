A Restful CRUD API for book management using Spring Boot 2.x , Spring Data JPA,Hibernate,H2-database and Swagger documentation with containerization using Docker.

Steps for executing :

1.	Download the repository.

2.	Open the project in the IDE (Netbeans/Intellij Idea/Eclipse) and open the mvnw.cmd in terminal.Execute the below command to build the image.

   mvnw.cmd spring-boot:build-image

3. Execute the below command to run the container.

   docker run -p 8080:8080 bookservice:0.0.1-SNAPSHOT

4.	Run the below command to get the list of running containers.

   docker ps

5.	Open the browser and navigate to below url to get the info about the available endpoints.
   
   http://localhost:8080/swagger-ui/index.html


![image](https://user-images.githubusercontent.com/62092482/113513360-a6f34e80-9569-11eb-9066-7ab0c921491e.png)




