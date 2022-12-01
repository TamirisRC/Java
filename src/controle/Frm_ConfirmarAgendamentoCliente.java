package controle;

import conexao.Conexao; //importar do package a classe
import javax.swing.JOptionPane; //importando classe JOptionPane
import javax.swing.table.DefaultTableModel; //para reconhecimento da Jtable
import java.sql.*; // para execução de comandos SQL no ambiente Java

public class Frm_ConfirmarAgendamentoCliente extends javax.swing.JFrame {
        
    Conexao con_cliente; // instanciando classe conexão
    
    public Frm_ConfirmarAgendamentoCliente() {
        initComponents();        
        setLocationRelativeTo(this);
        
        con_cliente = new Conexao(); //inicialização do objeto como instância
        con_cliente.conecta(); //chama o método que conecta
        con_cliente.executaSQL("select * from tblagendamento order by cod_cliente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtMostrarBarbeiro = new javax.swing.JTextField();
        txtMostrarCorte = new javax.swing.JTextField();
        txtMostrarData = new javax.swing.JTextField();
        txtMostrarHorario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMostrarValor = new javax.swing.JTextField();
        btnMenuCliente = new javax.swing.JButton();

        jLabel4.setText("Data Escolhida:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Barbeiro Escolhido:");

        jLabel2.setText("Horário Escolhido:");

        jLabel3.setText("Data Escolhida:");

        jLabel5.setText("Corte Escolhido:");

        jLabel6.setText("Confirmar Agendamento");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtMostrarBarbeiro.setEditable(false);

        txtMostrarCorte.setEditable(false);

        txtMostrarData.setEditable(false);

        txtMostrarHorario.setEditable(false);

        jLabel7.setText("Valor:");

        txtMostrarValor.setEditable(false);

        btnMenuCliente.setText("Voltar pro Menu");
        btnMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMostrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGap(108, 108, 108)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMostrarCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMostrarBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMostrarData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMostrarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMenuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVoltar)
                                        .addGap(73, 73, 73)
                                        .addComponent(btnConfirmar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel6)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMostrarBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMostrarCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMostrarData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMostrarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMostrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addGap(33, 33, 33)
                .addComponent(btnMenuCliente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Frm_AgendamentoCliente voltar = new Frm_AgendamentoCliente();
        voltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String barbeiro = txtMostrarBarbeiro.getText(); 
        String corte = txtMostrarCorte.getText();
        String data = txtMostrarData.getText(); 
        String horario = txtMostrarHorario.getText(); 
        String valor = txtMostrarValor.getText(); 

        try {
            String insert_sql = "insert into tblagendamento (barbeiro,corte, data, horario, valor) values ('" + barbeiro + "','" + corte + "','" + data+ "','" + horario + "','" + valor + "')"; //inserindo instrução SQL na variável sql
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Seu agendamento foi realizado com sucesso!!", "Agendamento", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tblagendamento order by cod_cliente");
        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro ao realizar o agendamento:\n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE); //tratamento de erro
        }
        
        Menu_Cliente ir = new Menu_Cliente();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuClienteActionPerformed
        Menu_Cliente ir = new Menu_Cliente();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnMenuCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField txtMostrarBarbeiro;
    public javax.swing.JTextField txtMostrarCorte;
    public javax.swing.JTextField txtMostrarData;
    public javax.swing.JTextField txtMostrarHorario;
    public javax.swing.JTextField txtMostrarValor;
    // End of variables declaration//GEN-END:variables
}
