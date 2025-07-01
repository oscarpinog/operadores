package co.proyect.pruebas.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.proyect.pruebas.back.entity.OperadorEntity;

@Repository
public interface OperadorRepository extends JpaRepository<OperadorEntity, Integer>{

	

	
}
