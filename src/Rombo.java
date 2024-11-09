
public class Rombo  implements FigurasGeometricas {
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;
	private String nombre;
	
	public Rombo(double diagonalMayor, double diagonalMenor, double lado, String nombre) {
		super();
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
		this.nombre = nombre;
	}
	
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Rombo [diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + ", lado=" + lado
				+ ", nombre=" + nombre + "]";
	}

	@Override
	public double calcularARea() {
		// TODO Auto-generated method stub
		return (diagonalMayor*diagonalMenor)/2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	

}
