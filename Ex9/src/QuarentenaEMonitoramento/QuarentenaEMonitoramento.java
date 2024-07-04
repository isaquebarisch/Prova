package QuarentenaEMonitoramento;

import Alienigena.Alien;
import Avaliacao.Avaliar;

public class QuarentenaEMonitoramento {


    public QuarentenaEMonitoramento(Alien alien, Avaliar avaliacao) {

        int a;
        avaliacao.fazerAvaliacao(alien);
        a = alien.getNivelPericulosidade();

        if (a < 3) {
            System.out.println("O alien " + alien.getNome() + " não está na quarentena");
        } else if (a > 3) {
            System.out.println("O alien " + alien.getNome() + " está na quarentena");
            alien.setQuarentena(true);
        }

    }
}
