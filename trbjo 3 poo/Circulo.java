public class Circulo extends Figura implements Comparable{
    private double radio;
   public Circulo(double pradio){
    radio=pradio;
   }
   
    public double calcularArea(){
        return (3.14*(radio*radio));
        }
    public int lados(){
        return 0;
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
                System.out.println("La figura con la que se compara el circulo tiene "+comparacionFigura.lados()+"lados");
                return 0;
                
            }
            else {
                System.out.println("El circulo tiene mas lados"+this.lados()+"en total");
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
