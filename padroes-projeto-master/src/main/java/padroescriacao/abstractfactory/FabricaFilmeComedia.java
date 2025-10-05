package padroescriacao.abstractfactory;

public class FabricaFilmeComedia implements FabricaAbstrata {

    @Override
    public Roteiro criarRoteiro() {
        return new RoteiroComedia();
    }

    @Override
    public Elenco criarElenco() {
        return new ElencoComedia();
    }
}
