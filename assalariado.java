package Serviço;

public class assalariado extends empregado{

    double s = 0;
    double inss = (0.75);

    public assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }
public double vencimento(double valor){
        return (s - inss);
  }

}
