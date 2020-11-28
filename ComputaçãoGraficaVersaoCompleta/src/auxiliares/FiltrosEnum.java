package auxiliares;

/**
 * Mapeia os tipos de filtros
 *
 */
public enum FiltrosEnum {
    MEDIA("Media"), MEDIANA("MEDIANA"), PASSA_ALTA_BASICO("Passa alta basico"), 
    OPERADOR_ROBERTS("Operador de Roberts"), OPERADOR_ROBERTS_CRUZADO("Operador de Roberts Cruzado"),OPERADOR_PEWITT("Operador de Prewitt"), 
    ALTO_REFORCO("Alto Reforco (Hight-Boost)"), OPERADOR_SOBEL("Operador de Sobel");

    private final String titulo;

    FiltrosEnum(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
