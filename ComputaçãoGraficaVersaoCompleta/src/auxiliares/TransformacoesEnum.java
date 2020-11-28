package auxiliares;

/**
 * Mapeia os tipos de tranformacoes 2D/3D em objetos
 *
 */
public enum TransformacoesEnum {
    TRANSLACAO("Translacao"), ESCALA("Escala"), ROTACAO("Rotacao"), REFLEXAO("Reflexao"), CISALHAMENTO("Cisalhamento"), COMPOSTA("Composta");

    private final String titulo;

    TransformacoesEnum(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
