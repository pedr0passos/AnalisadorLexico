package view;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javacc.ParseException;
import javacc.TokenMgrError;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import model.TabelaDeSimbolo;
import service.AnalisadorService;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        configuraLookAndFeel();
        initComponents();
        btnAnalisar.addActionListener(evt -> {
            try {
                String codigo = taCodigo.getText();
                var analisadorService = new AnalisadorService(codigo);

                analisadorService.analisarCodigo();

                var tabela = analisadorService.getTabela();
                atualizarTabela(tabela);
                limparDestaqueErro();
                taMensagem.setText("Análise concluída.");
            } catch (ParseException e) {
                limparTabela();
                destacarErro(e.getMessage());
                taMensagem.setText("Erro de análise: " + e.getMessage());
            } catch (TokenMgrError e) {
                limparTabela();
                destacarErro(e.getMessage());
                taMensagem.setText("Erro Léxico: " + e.getMessage());
            }
        });
    }

    private void destacarErro(String mensagemErro) {
        try {
            int[] posicaoErro = extrairLinhaEColuna(mensagemErro);
            int linhaErro = posicaoErro[0];
            int colunaErro = posicaoErro[1];

            if (linhaErro < 1 || colunaErro < 1) return;

            Highlighter highlighter = taCodigo.getHighlighter();
            Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);

            int startOffset = taCodigo.getLineStartOffset(linhaErro - 1);
            int errorOffset = startOffset + (colunaErro - 1);

            highlighter.addHighlight(errorOffset, errorOffset + 1, painter);
        } catch (BadLocationException ex) {}
    }
    
    private void limparDestaqueErro() {
        taCodigo.getHighlighter().removeAllHighlights();
    }

    private int[] extrairLinhaEColuna(String mensagemErro) {
        Pattern pattern = Pattern.compile("line\\s(\\d+),\\scolumn\\s(\\d+)");
        Matcher matcher = pattern.matcher(mensagemErro);
        if (matcher.find()) {
            return new int[]{Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2))};
        }
        return new int[]{-1, -1}; 
    }

    private void limparTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tbSimbolos.getModel();
        modelo.setRowCount(0); 
    }

    private void atualizarTabela(TabelaDeSimbolo tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tbSimbolos.getModel();
        modelo.setRowCount(0); 

        for (var token : tabela.getTabela()) {
            modelo.addRow(new Object[]{token.getTipo(), token.getLexema()});
        }
    }
    public static void configuraLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taCodigo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSimbolos = new javax.swing.JTable();
        btnAnalisar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taMensagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDE C--");
        setMaximumSize(new java.awt.Dimension(802, 565));
        setMinimumSize(new java.awt.Dimension(802, 565));

        taCodigo.setColumns(20);
        taCodigo.setRows(5);
        jScrollPane1.setViewportView(taCodigo);

        tbSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Token", "Lexema"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbSimbolos);

        btnAnalisar.setText("Iniciar");

        taMensagem.setColumns(20);
        taMensagem.setRows(5);
        jScrollPane3.setViewportView(taMensagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnalisar, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(btnAnalisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3)
                .addGap(10, 10, 10))
        );

        setSize(new java.awt.Dimension(831, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAnalisar() {
        return btnAnalisar;
    }

    public JTextArea getTaCodigo() {
        return taCodigo;
    }

    public JTextArea getTaMensagem() {
        return taMensagem;
    }

    public JTable getTbSimbolos() {
        return tbSimbolos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taCodigo;
    private javax.swing.JTextArea taMensagem;
    private javax.swing.JTable tbSimbolos;
    // End of variables declaration//GEN-END:variables
}
