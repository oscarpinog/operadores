package co.proyect.pruebas.back.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import co.proyect.pruebas.back.dto.Claro;
import co.proyect.pruebas.back.dto.Movistar;
import co.proyect.pruebas.back.dto.Operador;
import co.proyect.pruebas.back.dto.Tigo;
import co.proyect.pruebas.back.entity.OperadorEntity;
import co.proyect.pruebas.back.repository.OperadorRepository;
import co.proyect.pruebas.back.service.OperadorService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperadorServiceImpl implements OperadorService{
	
	private final OperadorRepository operadorRepository;
	
	@Override
	public void recargaOperador(Operador operador) {
		
		OperadorEntity operadorEntity = new OperadorEntity();
        BeanUtils.copyProperties(operador, operadorEntity);
		operadorRepository.save(operadorEntity);
		
	}

	@Override
	public List<Operador> getAllOperador() {
		List<Operador> operadoresList=operadorRepository.findAll().stream()
        .map(operadorEntity -> {
            Operador operador = new Operador(); 
            
            BeanUtils.copyProperties(operadorEntity, operador);
            
            return operador; 
        })
        .collect(Collectors.toList());
		
		return operadoresList; 
			
	}

	@Override
	public String getComision(Integer idComision) {
	
		Optional<OperadorEntity> operadorEntity =operadorRepository.findById(idComision);
	
		String operador=operadorEntity.get().getOperador().toLowerCase();
		String comision = "";
		
		if(operador.equals("movistar")) {
			Operador movistar = new Movistar();
			//comision=movistar.calcularComision();
		}else if(operador.equals("claro")) {
			Operador claro = new Claro();
			//comision=claro.calcularComision();
		}else {
			Operador tigo = new Tigo();
			//comision=claro.calcularComision();
		}
		
		return comision;
	}
	

}
