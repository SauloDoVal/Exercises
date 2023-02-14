    public class TestaProduto {
        public static void main(String[] args) {


//            Produto[] produtos = new Produto[5];
//            produtos[0] = new Produto("Lamborghini", 1000000);
//            produtos[1] = new Produto("Jipe", 46000);
//            produtos[2] = new Produto("Brasília", 16000);
//            produtos[3] = new Produto("Smart", 46000);
//            produtos[4] = new Produto("Fusca", 17000);

            Produto produtos[] = {
                    new Produto("Lamborguini", 1000000),
                    new Produto("Jipe", 46000),
                    new Produto("Brasília", 16000),
                    new Produto("Smart", 46000),
                    new Produto("Fusca", 17000)
            };







            int oMaisBarato = 0;

            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].getPreco() < produtos[oMaisBarato].getPreco()) {
                    oMaisBarato = i;
                }
            }
            System.out.println("O proço mais barato é o numero " + oMaisBarato + " da Array");
            System.out.println("O proço mais barato é : " + produtos[oMaisBarato].getNome() + " e custa " + produtos[oMaisBarato].getPreco());

        }

        }
