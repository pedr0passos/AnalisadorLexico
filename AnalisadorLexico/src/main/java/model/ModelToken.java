package model;

public class ModelToken {
    private String tipo;
    private String lexema;

    public ModelToken(String tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "Token{" + "tipo='" + tipo + '\'' + ", lexema='" + lexema + '\'' + '}';
    }
}
