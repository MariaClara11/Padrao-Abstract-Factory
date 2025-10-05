package padroescriacao.abstractfactory;

public class Produtor {

    private Roteiro roteiro;
    private Elenco elenco;

    public Produtor(FabricaAbstrata fabrica) {
        this.roteiro = fabrica.criarRoteiro();
        this.elenco = fabrica.criarElenco();
    }

    public String produzirRoteiro() {
        return this.roteiro.escrever();
    }

    public String escalarElenco() {
        return this.elenco.escalar();
    }
}
