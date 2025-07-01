package co.proyect.pruebas.back.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Operador {
	
	private Integer id;
	private BigDecimal recarga;
	private String operador;
	private boolean estado;
	

}
