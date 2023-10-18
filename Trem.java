import java.util.ArrayList;
import java.util.Calendar;

class Trem {
    private ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
    private ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
    private String prefixo;
    private String dataForm;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;

    public Trem(Vagao vagaoPrincipal, Locomotiva locomotivaPrincipal, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino, String prefixo, String dataForm) {
        this.locomotivas.add(locomotivaPrincipal);
        this.vagoes.add(vagaoPrincipal);

        this.prefixo = prefixo;
        this.dataForm = dataForm;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;       
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataForm() {
        return dataForm;
    }

    public void setDataForm(String dataForm) {
        this.dataForm = dataForm;
    }

    public EstacaoFerroviaria getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public void setEstacaoOrigem(EstacaoFerroviaria estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public EstacaoFerroviaria getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(EstacaoFerroviaria estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    public String toString() {
        String str = "";
        for(Vagao vagao : vagoes) {
            str += "Tipo do vagao: " + vagao.getTipo()
                    + "\nNumero de serie do vagao: " + vagao.getNumSerie()
                    + "\nCapacidade de carga: " + vagao.getCapacidadeCarga()
                    + "\nComprimento de testeiras: " + vagao.getCompTesteiras()
                    + "\nComprimento de engates: " + vagao.getCompEngates();
        }

        for(Locomotiva locomotiva : locomotivas) {
            str += "\nNumero de serie: " + locomotiva.getNumSerie()
                    + "\nCapacidade de tracao: " + locomotiva.getCapTracao()
                    + "\nComprimento da locomotiva: " + locomotiva.getCompLocom();
        }

        str += "\nprefixo: " + this.prefixo
            + "\ndataForm: " + this.dataForm
            + "\nestacaoOrigem: " + this.estacaoOrigem
            + "\nestacaoDestino: " + this.estacaoDestino; 

        return str;
    }

    public String addVagao(Vagao vagao) {
        if(this.vagoes.size() + this.locomotivas.size() <= 150) {
            this.vagoes.add(vagao);
            return "Vagão adicionado, total de vagões: " + this.vagoes.size() + "\n";
        } else {
            return "Limite de 150 recursos atingido!\n";
        }
    }

    public String addLocomotiva(Locomotiva locomotivas) {
        if(this.vagoes.size() + this.locomotivas.size() <= 150) {
            this.locomotivas.add(locomotivas);
            return "Locomotiva adicionada, total de locomotivas: " + this.locomotivas.size() + "\n";
        } else {
            return "Limite de 150 recursos atingido!\n";
        }
    }
}