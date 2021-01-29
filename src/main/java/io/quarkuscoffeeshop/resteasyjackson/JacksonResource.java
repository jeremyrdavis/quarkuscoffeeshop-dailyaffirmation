package io.quarkuscoffeeshop.resteasyjackson;

import io.quarkuscoffeeshop.domain.DailyAffirmation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/dailyaffirmation")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JacksonResource {

    @GET
    public Response getDailyAffirmation(){

        return Response.ok(DailyAffirmation.listAll()).build();
    }

}
