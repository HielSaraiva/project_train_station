import java.util.ArrayList;
import java.util.Date;

class Trem {
    private ArrayList<Vagao> vagoes = new ArrayList<>();
    public ArrayList<Locomotiva> locomotivas = new ArrayList<>();
    private String prefixo;
    private Date dataForm;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;

    public Trem(Vagao vagaoPrincipal, Locomotiva locomotivaPrincipal, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino, String prefixo, Date dataForm) {
        this.locomotivas.add(locomotivaPrincipal);
        this.vagoes.add(vagaoPrincipal);

        this.prefixo = prefixo;
        this.dataForm = dataForm;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;       
    }

    public Vagao getVagoes() {
        for(Vagao vagao : vagoes) {
            return vagao;
        }
        return null;
    }

    public Locomotiva getLocomotivas() {
        for(Locomotiva locomotiva : locomotivas) {
            return locomotiva;
        }
        return null;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Date getDataForm() {
        return dataForm;
    }

    public void setDataForm(Date dataForm) {
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
        for(Vagao vagao : vagoes) {
            return "tipo do vagao: " + vagao.getTipo()
                    + "\nNumero de serie do vagao: " + vagao.getNumSerie()
                    + "\nCapacidade de carga: " + vagao.getCapacidadeCarga()
                    + "\nComprimento de testeiras: " + vagao.getCompTesteiras()
                    + "\nComprimento de engates: " + vagao.getCompEngates();
        }
        for(Locomotiva locomotiva : locomotivas) {
            return "Numero de serie: " + locomotiva.getNumSerie()
                    + "\nCapacidade de tracao: " + locomotiva.getCapTracao()
                    + "\nComprimento da locomotiva: " + locomotiva.getCompLocom();
        }
            return "\nprefixo: " + prefixo
            + "\ndataForm: " + dataForm
            + "\nestacaoOrigem: " + estacaoOrigem
            + "\nestacaoDestino: " + estacaoDestino; 
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