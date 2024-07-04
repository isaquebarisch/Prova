package Alienigena;

import Avaliacao.Avaliar;
import QuarentenaEMonitoramento.QuarentenaEMonitoramento;

import java.util.Date;

public class Alien extends Especie{
    private int id;
    private String nome;
    private int nivelPericulosidade;
    private String dataChegada;
    private boolean quarentena = false;


    public Alien(String nomeEspecie, int periculosidadeBase, String planetaOrigem, int id, String nome, String dataChegada) {
        super(nomeEspecie, periculosidadeBase, planetaOrigem);
        this.id = id;
        this.nome = nome;
        this.dataChegada = dataChegada;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie= " + super.getNomeEspecie() + '\'' +
                ", nivelPericulosidade=" + nivelPericulosidade +
                ", dataChegada='" + dataChegada + '\'' +
                ", quarentena=" + quarentena +
                ", nivelBasePerigo= " + super.getPericulosidadeBase() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNivelPericulosidade() {
        return nivelPericulosidade;
    }

    public void setNivelPericulosidade(int nivelPericulosidade) {
        this.nivelPericulosidade = nivelPericulosidade;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public boolean isQuarentena() {
        return quarentena;
    }

    public void setQuarentena(boolean quarentena) {
        this.quarentena = quarentena;
    }
}
