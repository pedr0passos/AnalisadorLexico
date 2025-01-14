package presenter;

import java.io.*;
import java.util.ListIterator;
import javax.swing.table.DefaultTableModel;

import model.TabelaDeSimbolo;
import model.Token;
import main.Analisador;
import view.MainView;

public class MainPresenter {

    private MainView view;
    private DefaultTableModel tmSimbolos;

    public MainPresenter() {
        view = new MainView();
        view.setVisible(true);

        tmSimbolos = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Token", "Lexema"}
        );

        this.view.getBtnAnalisar().addActionListener(e -> {
            File diretorio = new File("src/dados");
            if (!diretorio.exists()) {
                diretorio.mkdirs();
            }

            File arquivo = new File(diretorio, "codigo.c");
            PrintWriter pw;
            try {
                pw = new PrintWriter(arquivo);
                pw.print(view.getTaCodigo().getText());
                pw.close();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
                view.getTaMensagem().setText("Erro ao salvar o arquivo.");
                return;
            }

            Analisador analisador = new Analisador();
            TabelaDeSimbolo tabela;
            try {
                tabela = analisador.analisarSintatica(arquivo);
                preencheTabela(tabela);
                view.getTaMensagem().setText("Análise Concluída!");
            } catch (RuntimeException ex) {
                view.getTaMensagem().setText(ex.getMessage());
            } catch (IOException ex) {
                view.getTaMensagem().setText("Erro ao ler o arquivo.");
            } catch (Exception ex) {
                view.getTaMensagem().setText(ex.getMessage());
            }
        });
    }

    private void preencheTabela(TabelaDeSimbolo tabela) {
        tmSimbolos.setNumRows(0);
        ListIterator<Token> it = tabela.getTokens().listIterator();

        while (it.hasNext()) {
            Token token = it.next();
            tmSimbolos.addRow(new Object[]{token.getNome(), token.getValor()});
        }

        this.view.getTbSimbolos().setModel(tmSimbolos);
    }

}
