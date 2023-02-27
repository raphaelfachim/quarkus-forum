package fachim.raphael.api.controller;

import fachim.raphael.api.infra.dto.user.NewUserDTO;
import fachim.raphael.api.service.user.UserService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        try {
            return Response.ok().entity(this.userService.findAll()).build();

        } catch (Exception ex) {
            return Response
                    .serverError()
                    .entity(ex.getMessage())
                    .build();
        }
    }

    @POST
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(NewUserDTO newUser) {
        try {
            return Response.ok().entity(this.userService.create(newUser)).build();

        } catch (Exception ex) {
            return Response
                    .serverError()
                    .entity(ex.getMessage())
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") Long id) {
        try {
            return Response.ok().entity(this.userService.findById(id)).build();

        } catch (Exception ex) {
            return Response
                    .serverError()
                    .entity(ex.getMessage())
                    .build();
        }
    }

}
