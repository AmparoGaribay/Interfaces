
public class Trapecio implements FigurasGeometricas {
	private double ladoI;
	private double ladoM;
	private double ladoN;
	private double ladoO;
	
	private double baseMayor;
	private double baseMenor;
	private double altura;
	private String nombre;

	
	

	public Trapecio(double ladoI, double ladoM, double ladoN, double ladoO, double baseMayor, double baseMenor,
			double altura, String nombre) {
		super();
		this.ladoI = ladoI;
		this.ladoM = ladoM;
		this.ladoN = ladoN;
		this.ladoO = ladoO;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.nombre = nombre;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
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
	public double getLadoI() {
		return ladoI;
	}

	public void setLadoI(double ladoI) {
		this.ladoI = ladoI;
	}

	public double getLadoM() {
		return ladoM;
	}

	public void setLadoM(double ladoM) {
		this.ladoM = ladoM;
	}

	public double getLadoN() {
		return ladoN;
	}

	public void setLadoN(double ladoN) {
		this.ladoN = ladoN;
	}

	public double getLadoO() {
		return ladoO;
	}

	public void setLadoO(double ladoO) {
		this.ladoO = ladoO;
	}

	
	
	@Override
	public String toString() {
		return "Trapecio [ladoI=" + ladoI + ", ladoM=" + ladoM + ", ladoN=" + ladoN + ", ladoO=" + ladoO
				+ ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura + ", nombre=" + nombre
				+ "]";
	}

	@Override
	public double calcularARea() {
		// TODO Auto-generated method stub
		return( (baseMayor+baseMenor)*altura)/2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return ladoI+ladoM+ladoN+ladoO ;
	}
	
	
	

}
