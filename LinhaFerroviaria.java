import java.util.ArrayList;

class LinhaFerroviaria {
    private int numero;
    private Double extensao;
    private String descricao;
    private ArrayList<Trem> trens;

    public LinhaFerroviaria() {}

    public LinhaFerroviaria(int numero, Double extensao, String descricao, ArrayList<Trem> trens) {
        this.numero = numero;
        this.extensao = extensao;
        this.descricao = descricao;
        this.trens = trens;
    }   
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getExtensao() {
        return this.extensao;
    }

    public void setExtensao(Double extensao) {
        this.extensao = extensao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Trem> getTrens() {
        return this.trens;
    }

    public void setTrens(ArrayList<Trem> trens) {
        this.trens = trens;
    }

    public String toString() {
        return "numero: " + this.numero
            + "\nextensao: " + this.extensao
            + "\ndescricao: " + this.descricao
            + "\ntrens: " + this.trens;
    }
}