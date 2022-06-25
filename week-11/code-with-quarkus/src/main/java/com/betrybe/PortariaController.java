package com.betrybe;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.betrybe.service.HelloService;

@Path("/identificacao")
public class PortariaController {
	
	@Inject
    private HelloService service;
	
	@GET
	public String ola(@QueryParam(value = "nome") String nome){
		return service.digaOi(nome);
    }
	
	// localhost:8080/identificacao/dividir?numerador=6&denominador=2
	@Path("/dividir")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public int divide (@QueryParam(value = "numerador") int numerador, @QueryParam(value = "denominador") int denominador) {
		return numerador/denominador;
	}
}
