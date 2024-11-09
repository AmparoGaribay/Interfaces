
public class Cuadrado implements FigurasGeometricas {
	private String nombre;
	private double lado;
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	//constructor
	public String getNombre() {
		return nombre;
	}//get
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//set
	public double getLado() {
		return lado;
	}//gett
	public void setLado(double lado) {
		this.lado = lado;
	}//set
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}//tostring
	@Override
	public double calcularARea() {
		
		return lado*lado;
	}//calcular area
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}//perimetro
	
	
	
	
	

}
