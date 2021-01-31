package app.multicapa.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "quesos")
public class Queso implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Basic(optional = false)
	private String nombre;
	
	private String origen;
	
	private String descripcion;
	
	private int maduracion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getMaduracion() {
		return maduracion;
	}

	public void setMaduracion(int maduracion) {
		this.maduracion = maduracion;
	}

	public int getId() {
		return id;
	}

	public Queso() {
		
	}

	public Queso(String nombre, String origen, String descripcion, int maduracion) {
		this.nombre = nombre;
		this.origen = origen;
		this.descripcion = descripcion;
		this.maduracion = maduracion;
	}

	public Queso(String nombre) {
		this.nombre = nombre;
	}
}
