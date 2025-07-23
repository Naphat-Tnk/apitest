### **Description**

This project is an experiment using an API to add data 
through the back-end system in JSON format and the response is in JSON format 
according to the specified format. In addition, swagger is used to check the correctness of the work.

### **Features**

You can add data according to the specified steps and detect errors when the data is not complete. 
The system will only check **UserId** and **TokenId** because these two data are very necessary for saving data. And finally, 
the database is not found. If the save is successful, the system will respond in json  format as follows: Message, Code, UserId and Tokenid

### **Install**
* SpringBoot 3.3.0
* Java 21.0.6
* Apache Maven 3.9.11
* Postgre 15.13
* SpringDoc 2.3.0

### **Dependencies**
* Spring Web
* Postgresql
* Spring Data JPA
* SpringDoc Swagger UI
* Spring Boot DevTools
