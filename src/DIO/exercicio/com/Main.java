package DIO.exercicio.com;

public class Main {

    public static void main(String[] args) {
	    double lado = 2.0;
	    double lado1 = 5.0;

        double lado2 = Quadrilatero.lado;

        // Quadrilatero
        System.out.println("Exercicio quadrilatero");
        Quadrilatero.area(Quadrilatero.lado);
        Quadrilatero.area(lado1,lado1);
        Quadrilatero.area(9.0, 8.0, 9.0);

    }
}
