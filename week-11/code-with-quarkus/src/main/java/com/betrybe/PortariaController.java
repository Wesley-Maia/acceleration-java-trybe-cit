package com.betrybe;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.betrybe.service.HelloService;

@Path("/identificacao")
public class PortariaController {
	
	@Inject
    private HelloService service;
	
	@GET
	public String ola(@QueryParam(value = "nome") String nome){
		return service.digaOi(nome);

    }
}
