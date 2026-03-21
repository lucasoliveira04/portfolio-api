package controller;

import dto.ProfileFullDataDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.ProfileService;

import java.util.UUID;

@Path("/api/profiler")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    ProfileService profileService;

    @GET
    @Path("/{id}/all")
    public Response getAllData(@PathParam("id")UUID id) {
        if (id == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("ID is required")
                    .build();
        }
        try {
            ProfileFullDataDTO data = profileService.getAllData(id);
            return Response.ok(data).build();
        } catch (NotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(e.getMessage())
                    .build();
        }
    }
}