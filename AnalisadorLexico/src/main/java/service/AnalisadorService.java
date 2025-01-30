package service;

import model.ModelToken;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javacc.ParseException;
import javacc.SimpleParser;
import model.TabelaDeSimbolo;

public class AnalisadorService {

    private final InputStream inputStream;
    private final SimpleParser parser;

    public AnalisadorService(String codigo) {
        this.inputStream = new ByteArrayInputStream(codigo.getBytes());
        this.parser = new SimpleParser(inputStream);
    }

    public void analisarCodigo() throws ParseException {
        try {
            // Realiza a análise sintática e coleta os tokens
            parser.analisar();
        } catch (ParseException e) {
            throw new ParseException(e.getMessage());
        }
    }

    public TabelaDeSimbolo getTabela() {
        var tabela = new TabelaDeSimbolo();

        // Obtém os tokens coletados durante a análise
        var tokens = parser.getTokens();

        // Adiciona os tokens à tabela de símbolos
        for (var token : tokens) {
            tabela.adicionarToken(token);
        }

        return tabela;
    }
}