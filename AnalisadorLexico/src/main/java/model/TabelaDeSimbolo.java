package model;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolo {
    private List<Token> tabela;

    public TabelaDeSimbolo() {
        tabela = new ArrayList<>();
    }

    public void adicionarToken(Token token) {
        tabela.add(token);
    }

    public List<Token> getTabela() {
        return tabela;
    }

    public void limpar() {
        tabela.clear();
    }
}
