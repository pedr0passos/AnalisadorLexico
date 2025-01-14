package main;

import cup.parser;
import cup.sym;
import java_cup.runtime.Symbol;
import jflex.Lexer;
import model.TabelaDeSimbolo;
import model.Token;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Analisador {

    public TabelaDeSimbolo analisarLexica(File arquivo) throws IOException, RuntimeException {
        
        var lexer = new Lexer(new FileReader(arquivo));
        var tabela = new TabelaDeSimbolo();
        Symbol s;

        do {
            s = lexer.next_token();
            tabela.add(new Token(s.sym, lexer.yytext()));
        } while (s.sym != sym.EOF);

        return tabela;
    }

    public TabelaDeSimbolo analisarSintatica(File arquivo) throws Exception {
        Lexer lexer = new Lexer(new FileReader(arquivo));

        TabelaDeSimbolo tabela = new TabelaDeSimbolo();
        tabela = analisarLexica(arquivo);

        parser parser = new parser(lexer);

        try {
            parser.parse();
        } catch (RuntimeException e) {
            throw new RuntimeException(parser.getErros().toString());
        }

        return tabela;
    }
}
