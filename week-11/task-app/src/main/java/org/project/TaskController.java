package org.project;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.project.dto.TaskDTO;
import org.project.service.TaskService;

@Path("/task")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TaskController {
	
	@Inject
	private TaskService service;

	@GET
	public Response listar() {
		return Response.ok(service.listar()).build();
	}
	
	@GET
	@Path("/{id}")
	public Response obterPorId(@PathParam("id") Long id) {
		return Response.ok(service.buscarPorId(id)).build();
	}
	
	@POST
	public Response criar(TaskDTO dto) {
		service.salvar(dto);
		return Response.status(201).build();
	}
}
