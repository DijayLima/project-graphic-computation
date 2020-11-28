package auxiliares;

/**
 * Mapeia os tipos de algoritmos para rasterizacao da reta
 * 
 */
public enum RasterizacaoEnum {
    DDA("DDA (Digital Differential Analyser)"), PONTO_MEDIO("Ponto Medio");
    
    private final String titulo;

    RasterizacaoEnum(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
}
