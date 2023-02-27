package fachim.raphael.api.controller;

import fachim.raphael.api.infra.dto.shared.ServerResponseDTO;
import fachim.raphael.api.infra.repository.impl.UserRepository;
import fachim.raphael.api.service.user.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserController {

    @Inject
    UserRepository userRepo;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        try {
            System.out.println("GET - all");
            return Response.ok().entity(new UserService(userRepo).findAll()).build();
//            return Response.ok().entity("Ok").build();

        } catch (Exception ex) {
            return Response
                    .serverError()
                    .entity(ServerResponseDTO.getError(500, ex.getMessage()))
                    .build();
        }
    }

}
