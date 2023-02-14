package com.pokeworld;
import java.util.HashSet;

public class PokeMundoImpl implements PokeMundo {
private int latitude;
private int longitude;
private final HashSet<String> lugarVisitado;

    public PokeMundoImpl(){

    latitude = 0;
    longitude = 0;
    lugarVisitado = new HashSet<>();
    lugarVisitado.add(latitude + "," + longitude);
}
    public void move(char direcao){
        switch (direcao) {
            case 'N' -> latitude++;
            case 'S' -> latitude--;
            case 'E' -> longitude++;
            case 'O' -> longitude--;
        }
    String posicaoAtual = latitude + "," + longitude;
    lugarVisitado.add(posicaoAtual);
}
public int pokemonCounter(){
    return lugarVisitado.size();
}
}
