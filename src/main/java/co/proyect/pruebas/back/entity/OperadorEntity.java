package co.proyect.pruebas.back.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="OPERADOR")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OperadorEntity {

	
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_recarga") 
    private Integer id;

    @Column(name = "monto_recarga", precision = 10, scale = 2, nullable = false)
    private BigDecimal recarga;//Mapear a una entidad

    @Column(name = "nombre_operador", length = 50, nullable = false)
    private String operador; //Mapear a una entidad
   
    @Column(name = "estado")
 	private boolean estado;
	
	
}
