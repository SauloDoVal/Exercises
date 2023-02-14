public class TesteSalario {
    public static void main(String[] args) {


        Salario salarios[] = new Salario[4];
        salarios[0] = new Salario(3200, "Fernando");
        salarios[1] = new Salario(6000, "Alfredo");
        salarios[2] = new Salario(5000, "Flávio");
        salarios[3] = new Salario(2200, "Marcela");


        int maiorSalario =0;
        int menorSalario =0;


        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i].getSalario() > salarios[maiorSalario].getSalario()) {
                maiorSalario = i;

            }
        }

        System.out.println("O maior salario é o numero da array " + maiorSalario + " de " +salarios[maiorSalario].getSalario() + " No valor de " + salarios[maiorSalario].getNome());

        for (int j = 0; j < salarios.length; j++){
            if (salarios[j].getSalario() < salarios[menorSalario].getSalario()) {
                menorSalario = j;
            }
        }

        System.out.println("O menor salario é o numero da array " + menorSalario + " de " +salarios[menorSalario].getSalario() + " No valor de " + salarios[menorSalario].getNome());

}}
