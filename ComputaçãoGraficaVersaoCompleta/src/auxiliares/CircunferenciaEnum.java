package auxiliares;

/**
 * Mapeia os tipos de algoritmos para desenhar circunferencia
 * 
 */
public enum CircunferenciaEnum {
    EQUACAO_EXPLICITA("Equacao Explicita"), PONTO_MEDIO("Ponto Medio"), TRIGONOMETRIA("Trigonometrica"), ELIPSE("Elipse");
    
    private final String titulo;

    CircunferenciaEnum(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
}
