package fachim.raphael;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationPath("/api")
public class MainResource extends Application {
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        try {
            return Response.ok().entity("API v1.0.0").build();
        } catch (Exception ex) {
            return Response
                    .serverError()
                    .entity(ex.getMessage())
                    .build();
        }
    }
}