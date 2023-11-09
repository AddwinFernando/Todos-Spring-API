Details of TodoSpringboot
 
I have created rest api called todospringboot
    First I have created model package,controller package,repository package.  
 
    I have todo pojo(Plain Old Java Object) class.  
 
    In Controller Class,I have created endpoints for GET and POST.  
 
    I have created Todorepository in which i have done dependency injection of Jdbc template for connecting to database and used that jdbcTemplate for querying purpose.  
 
    All database related details i have kept in application.properties file.  
 
  
 
 
    GET:-For getting all todos from database.  
 
    POST:-For adding todos into database.  
         -For updating the todos which are in the database.  
         -For Deleting the todods from the database.  
    For all POST methods The Respective Todo Object should be passed
  
 
-------------BELOW ARE MY API'S WHICH HAVE TODO'S---------------------
 
 
    GET:-http://localhost:8080/todo/all
 
 
    POST:-http://localhost:8080/todo/add 
         -http://localhost:8080/todo/delete  
         -http://localhost:8080/todo/edit  
