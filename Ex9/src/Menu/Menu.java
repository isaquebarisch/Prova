package Menu;

import Alienigena.Alien;
import Alienigena.Especie;
import Relatorio.Relatorio;
import Avaliacao.Avaliar;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public Menu() {


        Scanner scan = new Scanner(System.in);


        ArrayList<Alien> aliens = new ArrayList<Alien>();

        int op = 1;
        while (op != 0) {

            System.out.println("\nBem Vindo ao Sistema de Controle de Entrada de Alienígenas:");
            System.out.println("\n1 - Registrar Alienígena");
            System.out.println("\n2 - Listar Alienígenas");
            System.out.println("\n0 - Sair do sistema");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\nRegistrar Alienígena");
                    System.out.println("\nQual o ID dO Alienígena?");
                    int id = scan.nextInt();
                    System.out.println("\nQual o nome do Alienígena?");
                    String nome = scan.next();
                    System.out.println("\nQual a especie do Alienígena?");
                    System.out.println("\nHumano" + "\nLagarto" + "\nAranha");
                    String especie = scan.next();
                    System.out.println("\nQual o planeta de origem do Alienígena?");
                    System.out.println("\nTatooine" + "\nNaboo" + "\nCoruscant");
                    String planeta = scan.next();
                    System.out.println("\nQual a data de chegada?");
                    String dataChegada = scan.next();


                    Especie especie1 = new Especie();
                    especie1.Especie(especie,planeta);
                    Alien alien = new Alien(especie, especie1.getPericulosidadeBase(),planeta, id, nome,  dataChegada);



                    Avaliar avaliar = new Avaliar();
                    avaliar.fazerAvaliacao(alien);

                    aliens.add(alien);
                    Relatorio relatorio = new Relatorio(aliens);
                    relatorio.listarEntradas(aliens);
                    break;
                case 2:
                    System.out.println("\nListar Alienígenas");
                    relatorio = new Relatorio(aliens);
                    relatorio.listarEntradas(aliens);
                    break;

                case 0:
                    System.out.println("\nSair do sistema");
                    return;

                default:
                    System.out.println("\nOpção inválida");
                    break;
            }

        }


    }


}
