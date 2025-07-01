package co.proyect.pruebas.back.dto;

import java.math.BigDecimal;

import co.proyect.pruebas.back.service.ComisionInterface;

public class Movistar extends Operador implements ComisionInterface{

	@Override
	public void calcularComision(BigDecimal recargaValor) {
		System.out.println("Calcular comision 3%");
	}

}
