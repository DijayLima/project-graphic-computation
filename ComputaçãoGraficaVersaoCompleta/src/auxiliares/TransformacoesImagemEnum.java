package auxiliares;

/**
 * Mapeia os tipos de tranformacoes em proc. de imagem
 *
 */
public enum TransformacoesImagemEnum {
    NEGATIVO("Negativo"), GAMMA("Gamma"), LOG("Logaritmo");

    private final String titulo;

    TransformacoesImagemEnum(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
