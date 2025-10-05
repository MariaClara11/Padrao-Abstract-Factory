package padroescriacao.abstractfactory;

public class FabricaFilmeAcao implements FabricaAbstrata {

    @Override
    public Roteiro criarRoteiro() {
        return new RoteiroAcao();
    }

    @Override
    public Elenco criarElenco() {
        return new ElencoAcao();
    }
}
