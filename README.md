# person-rest-api


|name|version|
|:---:|:---:|
|Java| 11|
|Spring Boot||
|HikariCP|datasource|
|Postgresql|db|
|FlyWay|migrations|
|Repository Pattern||

https://www.youtube.com/watch?v=vtPkZShrvXQ&t=339s

Errors

1. SELECT uuid_generate_v4();

Solution 

 ```
  db=#  CREATE EXTENSION "uuid-ossp";
  ```


