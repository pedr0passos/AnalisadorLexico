package model;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolo {
    private List<ModelToken> tabela;

    public TabelaDeSimbolo() {
        tabela = new ArrayList<>();
    }

    public void adicionarToken(ModelToken token) {
        tabela.add(token);
    }

    public List<ModelToken> getTabela() {
        return tabela;
    }

    public void limpar() {
        tabela.clear();
    }
}
