package controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/user")
public class UserController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataProfile(){
        return "Hello World";
    }
}
