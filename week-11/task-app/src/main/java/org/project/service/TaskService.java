package org.project.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import org.project.dto.TaskDTO;
import org.project.entity.TaskEntity;

@ApplicationScoped
public class TaskService {

	@Transactional
	public void salvar(TaskDTO taskDTO) {
		TaskEntity entity = new TaskEntity();
		entity.setDescricao(taskDTO.getDescricao());
		entity.persist();
	}
	
	@Transactional
	public void atualizar(Long id, TaskDTO taskDTO) {
		TaskEntity entity = TaskEntity.findById(id);
		entity.setDescricao(taskDTO.getDescricao());
		entity.persist();
	}
	
	@Transactional
	public void deletar(Long id) {
		TaskEntity.deleteById(id);
	}
	
	public List<TaskEntity> listar(){
		return TaskEntity.listAll();		
	}
	
	public TaskEntity buscarPorId(Long id) {
		return TaskEntity.findById(id);
	}
}
