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

check version
```
mvn -v (Apache Maven)
java --version
```

### **Dependencies**
* Spring Web
* Postgresql
* Spring Data JPA
* SpringDoc Swagger UI
* Spring Boot DevTools


### **How to use** 

1. Install Project
2. You create a database and create a table as below (table_name=sso_user_test) (databasename=ssotest)
```
create table sso_user_test
(
    request_date          timestamp not null
        constraint pk_sso_user_test
            primary key,
    ssotype               varchar(50),
    systemid              varchar(50),
    systemname            varchar(250),
    systemtransactions    varchar(250),
    systemprivileges      varchar(250),
    systemusergroup       varchar(50),
    systemlocationgroup   varchar(50),
    userid                varchar(200),
    userfullname          varchar(500),
    userrdofficecode      varchar(250),
    userofficecode        varchar(250),
    clientlocation        varchar(250),
    locationmachinenumber varchar(500),
    tokenid               varchar(1000)
);
```
3. next step open this project in **IntellJ** and click button run
4. finally you can use swagger in this link (http://localhost:8080/apitest/swagger-ui/index.html)

**mark**

if you see swagger you click /apitest/gettoken and you push data like this
```
{
  "requestDate": "2025-07-23T04:33:47.601Z",
  "ssoType": "string",
  "systemId": "string",
  "systemName": "string",
  "systemTransactions": "string",
  "systemPrivileges": "string",
  "systemUserGroup": "string",
  "systemLocationGroup": "string",
  "userId": "string",
  "userFullName": "string",
  "userRdOfficeCode": "string",
  "userOfficeCode": "string",
  "clientLocation": "string",
  "locationMachineNumber": "string",
  "tokenId": "string"
}
```
if it work response like this
```
{
  "responseCode": "string",
  "responseMessage": "string",
  "responseData": {
    "userId": "string",
    "token": "string"
  }
}
```
But if there is an error: response status is 400, it means that you have not provided the complete information as specified in the feature, 
and if it shows 500 it means that it could not be saved to the database.



