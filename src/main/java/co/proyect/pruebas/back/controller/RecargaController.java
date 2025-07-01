package co.proyect.pruebas.back.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.proyect.pruebas.back.dto.Operador;
import co.proyect.pruebas.back.service.OperadorService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RecargaController {


	private final OperadorService operadorService;
	
	@PostMapping("/recarga")
	public ResponseEntity<Void> recargaOperador(@RequestBody  Operador recarga ) throws IOException {
		operadorService.recargaOperador(recarga);
		return new ResponseEntity<>(HttpStatus.CREATED); 
	}

	@GetMapping("/operadores")
	public ResponseEntity<List<Operador>> getAllOperador() throws IOException {

		return new ResponseEntity<>(operadorService.getAllOperador(),HttpStatus.OK); 
	}
	
	@GetMapping("/comision/{idRecarga}")
	public ResponseEntity<String> getComision(Integer idRecarga) throws IOException {
		return new ResponseEntity<>(operadorService.getComision(idRecarga),HttpStatus.OK); 
	}
	
	
}
