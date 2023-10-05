import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instanciando vagoes
        Vagao vagao1 = new Vagao("L1918", "FERRO", 15500.50, 20.00, 1.0);
        Vagao vagao2 = new Vagao("L2015", "OURO", 20500.50, 18.00, 1.25);

        // Instanciando locomotivas
        Locomotiva locomotiva1 = new Locomotiva("S123", 5000.50, 5.25);
        Locomotiva locomotiva2 = new Locomotiva("S124", 6000.50, 4.00);

        // Testando metodo toString
        System.out.println("Dados do vagao 1: \n" + vagao1.toString() + "\n");
        System.out.println("Dados do vagao 2: \n" + vagao2.toString() + "\n");
        System.out.println("Dados da locomotiva 1: \n" + locomotiva1.toString() + "\n");
        System.out.println("Dados da locomotiva 2: \n" + locomotiva2.toString() + "\n");

        // Instanciando linhas
        LinhaFerroviaria linha1 = new LinhaFerroviaria();
        linha1.setDescricao("Washington Soares");
        linha1.setExtensao(25000.50);
        linha1.setNumero(855);
        LinhaFerroviaria linha2 = new LinhaFerroviaria();
        linha2.setDescricao("Albert Sabin");
        linha2.setExtensao(25000.00);
        linha2.setNumero(88);

        // Adicionando linha1 e linha2 aos respectivos ArrayList's
        ArrayList<LinhaFerroviaria> linhas1 = new ArrayList<LinhaFerroviaria>();
        linhas1.add(linha1);

        ArrayList<LinhaFerroviaria> linhas2 = new ArrayList<LinhaFerroviaria>();
        linhas2.add(linha2);

        
        // Instanciando estacoes 1 e 2
        EstacaoFerroviaria estacao1 = new EstacaoFerroviaria(linhas1, "FEC", "Peia no KANAL");
        EstacaoFerroviaria estacao2 = new EstacaoFerroviaria(linhas2, "LAION", "Come ovo");
        
        // Instanciando o Trem e adicionando ao ArrayList
        Date dataForm = new Date(20/11/2000);
        Trem trem1 = new Trem(vagao2, locomotiva2, estacao1, estacao2, "É O LAION", dataForm);
        ArrayList<Trem> trens = new ArrayList<Trem>();
        trens.add(trem1);
        
        // Adicionando o mesmo Trem às duas LinhaFerroviaria's
        linhas1.get(0).setTrens(trens);
        linhas2.get(0).setTrens(trens);


        // Testando alguns métodos:
        System.out.println("Dados do trem 1: \n" + trem1 + "\n");
        System.out.println("Dados da estacao 1 \n" + estacao1 + "\n");
        System.out.println("Dados da estacao 2 \n" + estacao2 + "\n");
        System.out.println("Dados da linha 1: \n" + linha1 + "\n");
        System.out.println("Dados da linha 2: \n" + linha2 + "\n");
    }
}
