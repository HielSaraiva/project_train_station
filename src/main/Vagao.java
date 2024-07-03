package src.main;

public class Vagao {
    private String numSerie;
    private String tipo;
    private Double capacidadeCarga;
    private Double compTesteiras;
    private Double compEngates;

    public Vagao() {}

    public Vagao(String numSerie, String tipo, Double capacidadeCarga, Double compTesteiras, Double compEngates) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.compTesteiras = compTesteiras;
        this.compEngates = compEngates;
    }

    public String getNumSerie() {
        return this.numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    public void setCapacidadeCarga(Double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Double getCompTesteiras() {
        return this.compTesteiras;
    }

    public void setCompTesteiras(Double compTesteiras) {
        this.compTesteiras = compTesteiras;
    }

    public Double getCompEngates() {
        return this.compEngates;
    }

    public void setCompEngates(Double compEngates) {
        this.compEngates = compEngates;
    }

    public String toString() {
        return "numSerie: " + numSerie
            + "\ntipo: " + tipo
            + "\ncapacidadeCarga: " + capacidadeCarga
            + "\ncompTesteiras: " + compTesteiras
            + "\ncompEngates: " + compEngates;
    }
}
