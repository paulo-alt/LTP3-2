package figurasplanas

public class quadrado {
    
    private double lado;
    
    public quadrado(double lado) {
        setLado(lado);
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado) {
        if (lado<=0)this.lado=1;
        else this.lado = lado
        //this.lado=(lado=0?1:lado);
    }
    
    public double area() {
        return lado*lado;
    }
    
    @Override
    public String toString()
    return String.format("Quadrado \n Lado:%.2f \n Área:%.2f\n",lado, area());
}