import java.awt.font.TextAttribute;

public class Main {

	public static void main(String[] args) {
		// las interfaces son como un apartado que te ermite homogenizar todas las clases si crear metodos especificos para cada una 
		//se debe crea getters y setter, constructor y to string para cada uno de ven incluir la palabra implements para traerlos
		
		Triangulo bermudas = new Triangulo("Bermudas",20, 10, 15);
		Triangulo t = new Triangulo("TrianguloT", 25, 12.5,17);
		Cuadrado bob = new Cuadrado("Boob", 20);
		Rectagulo rect = new  Rectagulo(20, 10, "Un rectangulo");
		Rombo rombo = new Rombo(30, 15, 10, "un Rombo comun");
		Rectagulo Romboide = new  Rectagulo(25, 10, "Un romboide");
		Trapecio trapecio = new Trapecio(33, 33, 25, 50, 50, 25, 30, "un tapecio comun");

		
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(bob); 
		imprimirCalculo(rect);
		imprimirCalculo(rombo);
		imprimirCalculo(Romboide);
		imprimirCalculo(trapecio);

	}
	
	public static void imprimirCalculo(FigurasGeometricas figurasGeo ) {
		System.out.println(figurasGeo);
		System.out.println("+===============================================+");
		System.out.println("| el area de [+"+ figurasGeo.getNombre()+"] es:"+ figurasGeo.calcularARea());
		System.out.println("| El perimetro de ["+figurasGeo.getNombre()+
				"] es:" + figurasGeo.calcularPerimetro());
		System.out.println("+===============================================+");
	}

}
