package entities;

public class Tarifa {
	private String horario_max;
	private double precio_entrada;
	private double porcentaje;
	private String descripcion;
	
	public String getHorario_max() {
		return horario_max;
	}
	public void setHorario_max(String horario_max) {
		this.horario_max = horario_max;
	}
	public double getPrecio_entrada() {
		return precio_entrada;
	}
	public void setPrecio_entrada(double precio_entrada) {
		this.precio_entrada = precio_entrada;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}