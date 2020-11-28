package auxiliares;

/**
 * Mapeia os tipos de tranformacoes em proc. de imagem
 *
 */
public enum GraficosEnum {
    COLUNA("Coluna"), BARRA("Barra"), PIE("Pie");

    private final String titulo;

    GraficosEnum(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
