package co.proyect.pruebas.back.service;

import java.util.List;

import co.proyect.pruebas.back.dto.Operador;

public interface OperadorService {

	void validarMetodo(Operador operador);

	List<Operador> getAllOperador();

	String getComision(Integer idRecarga);

	
}
