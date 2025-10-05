package padroescriacao.singleton;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instance = new ConfiguracaoSistema();
    private ConfiguracaoSistema() {}

    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    private String idioma;
    private String tema;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
