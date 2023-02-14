package com.pokeworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PokeMundo mundo = new PokeMundoImpl();
        TextosDoConsole textos = new TextosDoConsole();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            textos.start();
            String ashMoves = scanner.nextLine();

            if (ashMoves.equalsIgnoreCase("exit")){
                exit = true;
                continue;
            }

            for (int i = 0; i < ashMoves.length(); i++) {
                char direcao = Character.toUpperCase(ashMoves.charAt(i));
                mundo.move(direcao);
            }
            textos.score();
            System.out.println(mundo.pokemonCounter() + " Pokemons");
            textos.playAgain();
            String jogarMais = scanner.nextLine();
            if (!jogarMais.equalsIgnoreCase("sim")) {
                exit = true;
            }
        }
        scanner.close();

        textos.end();

    }
}
