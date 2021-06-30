package org.Theis;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class RestController {

    @GET
    @Path("/generateNumber")
    @Produces(MediaType.TEXT_PLAIN)
    public String generateRandomNumber() {
        int min = 500, max = 600;
        int randomValue = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return String.valueOf(randomValue);
    }

}
