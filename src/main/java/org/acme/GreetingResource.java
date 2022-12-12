package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.core.multipart.MultipartFormDataOutput;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.MULTIPART_FORM_DATA)
    public RestResponse<MultipartFormDataOutput> hello() {
        var res = new MultipartFormDataOutput();
        res.addFormData("key", "entity", MediaType.TEXT_PLAIN_TYPE);
        return RestResponse.ok(res);
    }
}
