
public class Rectagulo implements FigurasGeometricas {
	private double base;
	private double altura;
	private String nombre;
	///el rectangulo se puede usar para el  romboide
	
	public Rectagulo(double base, double altura, String nombre) {
		super();
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Rectagulo [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
	}
	@Override
	public double calcularARea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (base*2)+ (altura*2);
	}
	
	
	
	
	
	
	

}
