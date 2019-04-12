package com.jersy.greetings;

import javax.ws.rs.Path;

@Path("/greetings")
public class greetings {
	
	public String getGreeting() {
		return "Hi";
	}

}
