public class Pessoa {
    private String nome;
    private double altura;
    private Data dataNascimento;
    
    
    public Pessoa (string nome, double altura, Data dataNacismento) {
        this.nome = nome;
        this.altura= altura;
        this.dataNacismento = dataNacismento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = ((altura<=0.0)| | (altura>3.5)?1:altura);
    }
    
    public Data getDataNascimento() {
        return dataNacismento;
    }
    
    public void setDataNascimento(Data dataNascimento) {
        this.dataNacismento = dataNacismento;
    }
    
    @Override
    public String toString() {
        return String.format ("%n de %.2fm nasceu em %d/%d/%d\n",nome,altura,dataNacismento.getMes(),dataNacismento.getAno());
    }
}