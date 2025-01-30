package service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javacc.ParseException;
import javacc.SimpleParser;
import model.TabelaDeSimbolo;

public class AnalisadorService {

    private final InputStream inputStream1;
    private final InputStream inputStream2;
    
    public AnalisadorService(String codigo) {
        this.inputStream1 = new ByteArrayInputStream(codigo.getBytes());
        this.inputStream2 = new ByteArrayInputStream(codigo.getBytes());
    }

    public void analisarCodigo() throws ParseException {
        try {
            var parser = new SimpleParser(inputStream1);
            parser.analisar();
        } catch (ParseException e) {
            throw new ParseException(e.getMessage());
        }
    }

    public TabelaDeSimbolo getTabela() throws ParseException {
        var tabela = new TabelaDeSimbolo();
        var parser = new SimpleParser(inputStream2);
        
        var tokens = parser.getTokens(inputStream2);

        for (var token : tokens) {
            tabela.adicionarToken(token);
        }

        return tabela;
    }
}