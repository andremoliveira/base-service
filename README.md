# Base-service

This service is used as a validator for the Bill-Management project. It'll receive the 
requests from the frontend, perform necessary validations, then call database-service
to run the operations required on the database.

To run service, first you need to create the database. 
Use the following commands to create billmanagement database:

```text
docker run -d -p 5432:5432 --name billmanagement -e POSTGRES_PASSWORD=password postgres
docker exec -it billmanagement bash
    psql -U postgres
        CREATE DATABASE billmanagement;
        \l
```

Next, create a image of the database-service. Execute the following commands on base 
repository of the database-service:

```text
gw clean build
docker build --build-arg JAR_FILE=build/libs/*.jar -t database-service-01 .
```

Next, create a image of the base-service. Execute the following commands on base 
repository of the base-service:

```text
gw clean build
docker build --build-arg JAR_FILE=build/libs/*.jar -t base-service-01 .
```

Then, execute docker from the base repository:

```text
docker-compose up
```

After that, the service is ready to receive requests.




