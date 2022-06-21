package com.betrybe.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
	
	public String digaOi(String nome){
        return "Bem vindo, " + nome;
    }

}
