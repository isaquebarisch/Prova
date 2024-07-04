package Relatorio;

import Alienigena.Alien;

import java.util.ArrayList;

public class Relatorio {
    private ArrayList<Alien> alienLista = new ArrayList<Alien>();


    public void listarEntradas(ArrayList<Alien> alienListas) {

        for (Alien alien : alienListas) {
            System.out.println(alien.toString());
        }
    }


    public Relatorio(ArrayList<Alien> alienList) {
        this.alienLista = alienList;
    }

    public ArrayList<Alien> getAlienList() {
        return alienLista;
    }

    public void setAlienList(ArrayList<Alien> alienList) {
        this.alienLista = alienList;
    }
}
