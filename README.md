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


Supporting screenshorts of the working API:

1. GET - http://localhost:8080/bookservice/books

![image](https://user-images.githubusercontent.com/62092482/113515796-ed9b7580-9576-11eb-88ed-ef76b5413fa8.png)

2. GET - http://localhost:8080/bookservice/books/{id}

![image](https://user-images.githubusercontent.com/62092482/113515832-14f24280-9577-11eb-8f65-357a9d613bc5.png)

3. POST- http://localhost:8080/bookservice/books

![image](https://user-images.githubusercontent.com/62092482/113515880-6a2e5400-9577-11eb-9383-1c71aa66ad6e.png)

![image](https://user-images.githubusercontent.com/62092482/113515888-7f0ae780-9577-11eb-84a6-ed8a207eca48.png)

4. PUT - http://localhost:8080/bookservice/books/{id}

![image](https://user-images.githubusercontent.com/62092482/113515929-b24d7680-9577-11eb-8374-de0666583d03.png)

![image](https://user-images.githubusercontent.com/62092482/113515939-c3968300-9577-11eb-9135-c7c0abcd03a0.png)

5. DELETE - http://localhost:8080/bookservice/books/{id}

![image](https://user-images.githubusercontent.com/62092482/113515952-e6c13280-9577-11eb-99f4-4c3051498ee8.png)
