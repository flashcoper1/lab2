package lab2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
public class Program {

    //https://pokemondb.net/pokedex/torkoal
    //https://pokemondb.net/pokedex/diglett
    //https://pokemondb.net/pokedex/dugtrio
    //https://pokemondb.net/pokedex/happiny
    //https://pokemondb.net/pokedex/chansey
    //https://pokemondb.net/pokedex/blissey
    public static void main(String[] args) {
        Battle b = new Battle();
        Dugtrio p1 = new Dugtrio("Банда червяков", 1);
        Torkoal p2 = new Torkoal("Пыхнувший динозавр", 1);
        Chansey p3 = new Chansey("Большая милаха",1);
        Happiny p4 = new Happiny("Милаха поменьше", 1);
        Blissey p5 = new Blissey("Огроменная милаха",1);
        Diglett p6 = new Diglett("Червячелла",1);
        b.addAlly(p5);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addFoe(p6);
        b.addFoe(p3);
        b.addFoe(p2);
        b.go();



    }

    public static boolean chance(double chance) {
        return Math.random() < chance;
    }
}