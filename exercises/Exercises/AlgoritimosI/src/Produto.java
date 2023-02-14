public class Produto {

    private double preco;
    private String nome;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    private static int maisCaro(Produto[] produtos) {
        int maisCaro = 0;

        for(int atual = 0; atual <= produtos.length; atual++){
            if(produtos[atual].getPreco() < produtos[maisCaro].getPreco()) {
                maisCaro = atual;
            }
        }
        return maisCaro;
    }



    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
