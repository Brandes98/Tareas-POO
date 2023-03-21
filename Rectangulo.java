public class Rectangulo extends Figura implements Comparador{
 private double base;
 private double altura;

 public Rectangulo(double pBase, double pAltura){
 base = pBase;
 altura = pAltura;
 }

 //implementacion del metodo abstracto
 public double calcularArea(){
 return base * altura;
 }
public int lados(){
    return 4;
}
public int compareTo(Figura comparacionFigura){
    double areaPorComparar = comparacionFigura.calcularArea();
    double miArea = this.calcularArea();
    if(miArea==areaPorComparar){
        if(comparacionFigura.lados()==this.lados()){
            System.out.println("Ambos figuras son iguales");
            return 0;

        }
        else if(comparacionFigura.lados()>this.lados()){
            System.out.println("La figura con la que se compara el rectangulo tiene "+comparacionFigura.lados()+"lados");
            return 0;
            
        }
        else {
            System.out.println("El rectangulo tiene mas lados"+this.lados()+"en total");
            return 0;  
        }
         
         }
         else if (miArea > areaPorComparar){
             return 1;
             }
             else{
             return -1;

             }
    
}
 }