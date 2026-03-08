// controller > dto > service > entity > repository
package com.example.RestAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}













/*
controller > dto > service > entity > repository

DTO - Public version of your data (exposed to users as json)
Entity - Private version of your data (to interact with database)

request --> CONTROLLER <------- dto -------> SERVICE (model) <----- entity ----> Repository/DAO ---->> Database
                          json serialization
	                      (json <> java obj)

DTO: Data Transfer Object (transfer data between the Controller and the Service)
DAO: Data Access Object   (used to access data from the Database)
*/