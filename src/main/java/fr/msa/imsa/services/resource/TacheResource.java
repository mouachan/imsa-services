package src.main.java.fr.msa.imsa.services.resource;

import java.util.UUID;


import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import io.vertx.kafka.client.serialization.JsonObjectSerializer;
import io.vertx.core.json.JsonObject;

import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.ce.CloudEventMetadata;

import io.smallrye.reactive.messaging.ce.IncomingCloudEventMetadata;
import org.jboss.logging.Logger;

import org.eclipse.microprofile.reactive.messaging.Message;
import javax.ws.rs.core.Response;


@Path("/api")
public class TacheResource {
    private static final Logger LOGGER = Logger.getLogger(TacheResource.class);

    // @Channel("order")
    // Emitter<String> orderRequestEmitter;

   
    @GET
    @Path("/t1/{numsecu}/init")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response initt1(@PathParam("numsecu") String  numsecu) {
        LOGGER.infof("num secu recu %s", numsecu);
        return Response.ok(numsecu+"-t1").build();
    }

       
    @GET
    @Path("/t2/{numsecu}/init")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response initt2(@PathParam("numsecu") String  numsecu) {
        LOGGER.infof("num secu recu %s", numsecu);
        return Response.ok(numsecu+"-t2").build();
    }

       
    @GET
    @Path("/t3/{numsecu}/init")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response initt3(@PathParam("numsecu") String  numsecu) {
        LOGGER.infof("num secu recu %s", numsecu);
        return Response.ok(numsecu+"-t1").build();
    }
}
