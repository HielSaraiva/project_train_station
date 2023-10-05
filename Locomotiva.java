public class Locomotiva {

    private String numSerie;
    private Double capTracao;
    private Double compLocom;

    public Locomotiva() {}

    public Locomotiva(String numSerie , Double capTracao , Double compLocom) {
        this.numSerie = numSerie;
        this.capTracao = capTracao;
        this.compLocom = compLocom;
    }
    
    public String getNumSerie() {
        return this.numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public Double getCapTracao() {
        return this.capTracao;
    }

    public void setCapTracao(Double capTracao) {
        this.capTracao = capTracao;
    }

    public Double getCompLocom() {
        return this.compLocom;
    }

    public void setCompLocom(Double compLocom) {
        this.compLocom = compLocom;
    }

    public String toString() {
        return "numSerie: " + numSerie
            + "\ncapTracao: " + capTracao
            + "\ncompLocom: " + compLocom;
    }
}
