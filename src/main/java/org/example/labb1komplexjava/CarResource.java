package org.example.labb1komplexjava;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("cars")
public class CarResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response fisrtTest(){

     return Response
             .ok()
             .type(MediaType.APPLICATION_JSON)
             .entity("Hello bitch")
             .build();
    }


}
