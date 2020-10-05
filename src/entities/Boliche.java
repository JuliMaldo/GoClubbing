package entities;

public class Boliche {
	private String nombre;
	private String direccion;
	private String descripcion;
	private double puntuacion;
	private int edad_minima;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEdad_minima() {
		return edad_minima;
	}
	public void setEdad_minima(int edad_minima) {
		this.edad_minima = edad_minima;
	}
}