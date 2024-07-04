package Alienigena;

import QuarentenaEMonitoramento.QuarentenaEMonitoramento;

public class Especie {
    private String nomeEspecie;
    private String planetaOrigem;
    private int periculosidadeBase;


    public Especie(String nomeEspecie, int periculosidadeBase, String planetaOrigem) {
        this.nomeEspecie = nomeEspecie;
        this.periculosidadeBase = periculosidadeBase;
        this.planetaOrigem = planetaOrigem;
    }

    public Especie() {
    }

    public void Especie(String nome, String planeta) {

        this.nomeEspecie = nome;
        this.planetaOrigem = planeta;

        switch (nome) {
            case "Humano":
                switch (planeta) {
                    case "Tatooine":
                       this.setPericulosidadeBase(1);

                    case "Naboo":
                        this.setPericulosidadeBase(2);

                    case "Coruscant":
                        this.setPericulosidadeBase(3);

                    default:
                        break;
                }
                break;
            case "Lagarto":
                switch (planeta) {
                    case "Tatooine":
                        this.setPericulosidadeBase(2);

                    case "Naboo":
                        this.setPericulosidadeBase(2);

                    case "Coruscant":
                        this.setPericulosidadeBase(1);

                    default:
                        break;
                }
                break;
            case "Aranha":
                switch (planeta) {
                    case "Tatooine":
                        this.setPericulosidadeBase(3);

                    case "Naboo":
                        this.setPericulosidadeBase(3);

                    case "Coruscant":
                        this.setPericulosidadeBase(1);

                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }





    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public String getPlanetaOrigem() {
        return planetaOrigem;
    }

    public void setPlanetaOrigem(String planetaOrigem) {
        this.planetaOrigem = planetaOrigem;
    }

    public int getPericulosidadeBase() {
        return periculosidadeBase;
    }

    public void setPericulosidadeBase(int periculosidadeBase) {
        this.periculosidadeBase = periculosidadeBase;
    }
}
