package view;

import java.util.ArrayList;
import java.util.List;
import javacc.ParseException;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import model.ModelToken;
import model.TabelaDeSimbolo;
import service.AnalisadorService;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();

        btnAnalisar.addActionListener(evt -> {
            try {
                String codigo = taCodigo.getText();

                var analisadorService = new AnalisadorService();
                var tokens = analisadorService.analisarCodigo(codigo);
                var tabela = analisadorService.retornarTabelaDeSimbolo(tokens);
                
                atualizarTabela(tabela);

                taMensagem.setText("Análise concluída.");
            } catch (ParseException e) {
                taMensagem.setText("Erro de análise: " + e.getMessage());
            }
        });

    }
    
    private void atualizarTabela(TabelaDeSimbolo tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tbSimbolos.getModel();
        
        modelo.setRowCount(0); 

        for (var token : tabela.getTabela()) {
            modelo.addRow(new Object[]{token.getTipo(), token.getLexema()});
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
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbSimbolos);
        if (tbSimbolos.getColumnModel().getColumnCount() > 0) {
            tbSimbolos.getColumnModel().getColumn(0).setResizable(false);
            tbSimbolos.getColumnModel().getColumn(1).setResizable(false);
        }

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnAnalisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
