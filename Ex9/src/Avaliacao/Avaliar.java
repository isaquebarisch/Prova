package Avaliacao;

import Alienigena.Alien;

public class Avaliar {

    public Avaliar() {
    }

    public void fazerAvaliacao(Alien alien) {

        switch (alien.getNomeEspecie()) {
            case "Homem":
                alien.setNivelPericulosidade(alien.getPericulosidadeBase() * 2);

            case "Lagarto":
                alien.setNivelPericulosidade(alien.getPericulosidadeBase() * 3);

            case "Aranha":
                alien.setNivelPericulosidade(alien.getPericulosidadeBase() * 4);

            default:
                break;
        }

    }



}
