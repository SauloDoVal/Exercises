public class Salario {


    private double salario;
    private String nome;

    public Salario(double salario, String nome){
        this.salario = salario;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
