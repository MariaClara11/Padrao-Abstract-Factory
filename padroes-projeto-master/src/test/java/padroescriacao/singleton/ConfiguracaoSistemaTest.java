package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoSistemaTest {

    @Test
    public void deveRetornarIdioma() {
        ConfiguracaoSistema.getInstance().setIdioma("Português");
        assertEquals("Português", ConfiguracaoSistema.getInstance().getIdioma());
    }

    @Test
    public void deveRetornarTema() {
        ConfiguracaoSistema.getInstance().setTema("Escuro");
        assertEquals("Escuro", ConfiguracaoSistema.getInstance().getTema());
    }
}
