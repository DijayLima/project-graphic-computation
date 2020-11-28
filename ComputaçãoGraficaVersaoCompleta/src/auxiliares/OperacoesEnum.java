package auxiliares;

/**
 *
 */
public enum OperacoesEnum {
    ADICAO("Adicao"), SUBSTRACAO("Substracao"), MULTIPLICACAO("Multiplicacao"), 
    DIVISAO("Divisão"), OR("OR"), XOR("XOR"), AND("AND");
    
    private final String titulo;
    
    OperacoesEnum(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
}
