public class Triangulo extends Figura implements Comparador {
    private double base;
    private double altura;
    public Triangulo(double pbase,double paltura){
        base=pbase;
        altura=paltura;
    }
    public double calcularArea(){
        return (base * altura)/2;
        }
    public int lados(){
        return 3;

    }
    public int compareTo( Figura comparacionFigura){
        double areaPorComparar = comparacionFigura.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if(comparacionFigura.lados()==this.lados()){
                System.out.println("Ambos figuras son iguales");
                return 0;
    
            }
            else if(comparacionFigura.lados()>this.lados()){
                System.out.println("La figura con la que se compara el triangulo tiene "+comparacionFigura.lados()+"lados");
                return 0;
                
            }
            else {
                System.out.println("El triangulo tiene mas lados"+this.lados()+"en total");
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
