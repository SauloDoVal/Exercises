import com.pokeworld.PokeMundoImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokeMundoImplTest {

        private PokeMundoImpl mundo;

        static class Node<T> {

            T value ;
            Node<T> next;

        }
    static class Tree<T> {
        T value ;
        Tree<T> right;
        Tree<T> left;

    }

        @BeforeEach
        public void inicializar(){
            this.mundo = new PokeMundoImpl();
        }

        @Test
        public void testeMoveNorte() {
            mundo.move('N');
            assertEquals(2, mundo.pokemonCounter());
        }

        @Test
        public void testeMoveSul() {
            mundo.move('S');

        }

        @Test
        public void testeMoveEste() {
            mundo.move('E');
            assertEquals(2, mundo.pokemonCounter());
        }

        @Test
        public void testeMoveOeste() {
            mundo.move('O');
            assertEquals(2, mundo.pokemonCounter());
        }

        @Test
        public void testeMoveNESO(){
            mundo.move('N');
            mundo.move('E');
            mundo.move('S');
            mundo.move('O');
            assertEquals(4, mundo.pokemonCounter());
        }

        @Test
        public void testeVaiEVolta(){
            mundo.move('N');
            mundo.move('S');
            mundo.move('N');
            mundo.move('S');
            mundo.move('N');
            mundo.move('S');
            mundo.move('N');
            mundo.move('S');
            mundo.move('N');
            mundo.move('S');
            assertEquals(2, mundo.pokemonCounter());
        }

    @Test
    public void testeMoveMuitoAoNorte() {
        for (int i = 0; i < 1000000 ;  i++) {
            mundo.move('N');
        }
        assertEquals(1000001, mundo.pokemonCounter());
    }
    }