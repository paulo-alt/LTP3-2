public Pessoa(String nome,double altura, Data dataNacismento) {
    this.nome = nome;
    this.altura = altura;
    this.dataNascimento = dataNacismento;
}

public Pessoa (String nome,double altura,int dia,int mes, int ano)
    this.nome = nome;
    this.altura= altura;
    dataNacismento= new Data(dia,mes,ano);
}