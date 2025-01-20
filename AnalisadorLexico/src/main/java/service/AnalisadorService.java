package service;

import model.Token;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javacc.ParseException;
import javacc.SimpleParser;
import javacc.SimpleParserConstants;

public class AnalisadorService {

    public List<Token> analisarCodigo(String codigo) throws ParseException {
        InputStream inputStream = new ByteArrayInputStream(codigo.getBytes());
        SimpleParser parser = new SimpleParser(inputStream);
        List<Token> tokens = new ArrayList<>();

        try {
            // Inicia o parsing para validação completa
            parser.Start();

            while (true) {
                TokenJavaCC token = parser.getNextToken();
                if (token.kind == 0) { // EOF
                    break;
                }
                // Adiciona o token à lista usando seu tipo e lexema
                tokens.add(new Token(SimpleParserConstants.tokenImage[token.kind], token.image));
            }
        } catch (ParseException e) {
            // Lança a exceção para que ela possa ser tratada na camada superior
            throw new ParseException("Erro durante a análise: " + e.getMessage());
        }

        return tokens;
    }
}
