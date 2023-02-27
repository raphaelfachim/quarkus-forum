package fachim.raphael.api.controller;

import fachim.raphael.api.infra.dto.question.NewQuestionDTO;
import fachim.raphael.api.service.question.QuestionService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/question")
public class QuestionController {

    @Inject
    QuestionService questionService;

    @POST
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(NewQuestionDTO newQuestionDTO) {
        try {
            return Response.ok().entity(questionService.create(newQuestionDTO)).build();
        } catch (Exception ex) {
            return Response.serverError().entity(ex.getMessage()).build();
        }
    }
}
