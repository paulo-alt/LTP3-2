package figurasplanas;

public class quadrado {
    
    private double lado;
    
    public quadrado(double lado) {
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado (double lado) {
        this.lado = lado;
    }
    
    public double area() {
        return lado*lado;
    }
    
    @Override
    public String toString() {
        return String.format("Quadrado \n Lado:%.2f\n",lado,area());
    }
}