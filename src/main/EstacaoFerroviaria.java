package src.main;

import java.util.ArrayList;

public class EstacaoFerroviaria {
    private String sigla;
    private String descricao;
    private ArrayList<LinhaFerroviaria> linhas;

    public EstacaoFerroviaria(ArrayList<LinhaFerroviaria> linhas) {
        this.linhas = linhas;
    }

    public EstacaoFerroviaria(ArrayList<LinhaFerroviaria> linhas, String sigla, String descricao) {
        this.linhas = linhas;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public ArrayList<LinhaFerroviaria> getLinhas() {
        return this.linhas;
    }

    public void setLinhas(ArrayList<LinhaFerroviaria> linhas) {
        this.linhas = linhas;
    }

    public String toString() {
        String str = "";
        str += "\nsigla: " + this.sigla;
        str += "\ndescricao: " + this.descricao;
    
        return str;
    }
}
