package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutorTest {

    @Test
    void deveEscreverRoteiroAcao() {
        FabricaAbstrata fabrica = new FabricaFilmeAcao();
        Produtor produtor = new Produtor(fabrica);
        assertEquals("Roteiro de Filme de Ação", produtor.produzirRoteiro());
    }

    @Test
    void deveEscreverRoteiroComedia() {
        FabricaAbstrata fabrica = new FabricaFilmeComedia();
        Produtor produtor = new Produtor(fabrica);
        assertEquals("Roteiro de Filme de Comédia", produtor.produzirRoteiro());
    }

    @Test
    void deveEscalarElencoAcao() {
        FabricaAbstrata fabrica = new FabricaFilmeAcao();
        Produtor produtor = new Produtor(fabrica);
        assertEquals("Elenco de Atores de Ação escalado", produtor.escalarElenco());
    }

    @Test
    void deveEscalarElencoComedia() {
        FabricaAbstrata fabrica = new FabricaFilmeComedia();
        Produtor produtor = new Produtor(fabrica);
        assertEquals("Elenco de Atores de Comédia escalado", produtor.escalarElenco());
    }
}
