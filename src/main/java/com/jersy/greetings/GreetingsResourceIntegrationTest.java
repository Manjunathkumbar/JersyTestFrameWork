package com.jersy.greetings;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;

import org.junit.Test;

public class GreetingsResourceIntegrationTest {/* extends JerseyTest {	*/
 
   /* @Override
    protected Application configure() {
        return new ResourceConfig(greetings.class);
    }*/
    
    
    /*@Test
    public void greetingsTest() {
        target("/greetings/hi")
     
        assertEquals("Http Response should be 200: ", Status.OK.getStatusCode(), response.getStatus());
        assertEquals("Http Content-Type should be: ", MediaType.TEXT_HTML, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
     
        String content = response.readEntity(String.class);
        assertEquals("Content of ressponse is: ", "hi", content);
    }*/
}