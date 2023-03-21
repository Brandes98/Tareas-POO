import java.util.Arrays;

 public class Geometrias {

 public static void main(String args[]) {

 Figura[] figuras = new Figura[4];


 figuras[0] = new Rectangulo(2.5, 3.0);
 figuras[1] = new Rectangulo(1.7, 2.2);
 figuras[2] = new Circulo(2.8);
 figuras[3] = new Triangulo(3.5, 1.2);
 Arrays.sort(figuras);

 }
 }
