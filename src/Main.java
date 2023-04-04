import one.digital.innovation.bootcamp.Quadrilatero;

public class Main {

    public static void main(String[] args) {

        //Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis.Agora faça os metodos retornarem valores.
        //Retornos

        System.out.println("Exercicios retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapezio: " + areaTrapezio);
    }


}
