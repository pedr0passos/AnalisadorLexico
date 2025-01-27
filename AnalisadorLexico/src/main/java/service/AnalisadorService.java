package service;

import model.ModelToken;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javacc.ParseException;
import javacc.SimpleParser;
import javacc.SimpleParserConstants;
import javacc.Token;

public class AnalisadorService {

    public List<ModelToken> analisarCodigo(String codigo) throws ParseException {
        
        InputStream inputStream = new ByteArrayInputStream(codigo.getBytes());
        SimpleParser parser = new SimpleParser(inputStream);
        List<ModelToken> tokens = new ArrayList<>();

        try {
            parser.Start();

            while (true) {
                Token token = parser.getNextToken();
                if (token.kind == 0) { 
                    break;
                }
                tokens.add(new ModelToken(SimpleParserConstants.tokenImage[token.kind], token.image));
            }
        } catch (ParseException e) {
            throw new ParseException(e.getMessage());
        }

        return tokens;
    }
}
