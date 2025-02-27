package org.example.labb1komplexjava;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("cars")
public class CarResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String fisrtTest(){

     return "First Test";
    }


}
