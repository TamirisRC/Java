package controle;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Consultar_UsuarioAdministrador extends javax.swing.JFrame {

    Conexao con_cliente;

    public Consultar_UsuarioAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tblusuario order by cod_cliente");
        preencherTabela();
        posicionarRegistro();
        tblUsuarios.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarMenuAdministrador = new javax.swing.JButton();
        brnExcluir1 = new javax.swing.JButton();
        lblAviso1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblPesquisa1 = new javax.swing.JLabel();
        Se = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnUltimoRegistro1 = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();
        btnNovo1 = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPrimeiroRegistro1 = new javax.swing.JButton();
        btnCadastrar1 = new javax.swing.JButton();
        lblCod1 = new javax.swing.JLabel();
        btnVoltarUmRegistro1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblNome1 = new javax.swing.JLabel();
        btnAlterar1 = new javax.swing.JButton();
        btnAvancarUmRegistro1 = new javax.swing.JButton();
        lblCod2 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarMenuAdministrador.setText("Voltar pro Menu");
        btnVoltarMenuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuAdministradorActionPerformed(evt);
            }
        });

        brnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_delete.png"))); // NOI18N
        brnExcluir1.setToolTipText("Deletar");
        brnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnExcluir1ActionPerformed(evt);
            }
        });

        lblAviso1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAviso1.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso1.setText("O Código não necessita de inserção ou alteração");

        txtCod.setEditable(false);
        txtCod.setText(" ");

        lblPesquisa1.setText("Pesquisa por nome do Cliente:");

        Se.setText("Senha:");

        btnUltimoRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_last.png"))); // NOI18N
        btnUltimoRegistro1.setToolTipText("Úlitmo registro");
        btnUltimoRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistro1ActionPerformed(evt);
            }
        });

        txtSenha.setToolTipText("");

        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btnNovo1.setToolTipText("Limpar Seleção");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        btnPrimeiroRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro1.setToolTipText("Primeiro registro");
        btnPrimeiroRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistro1ActionPerformed(evt);
            }
        });

        btnCadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disk.png"))); // NOI18N
        btnCadastrar1.setToolTipText("Salvar");
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });

        lblCod1.setText("Código: ");

        btnVoltarUmRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro1.setToolTipText("Registro anterior");
        btnVoltarUmRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistro1ActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Usuário", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        tblUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblUsuariosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuarios);

        lblNome1.setText("Usuário:");

        btnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_edit.png"))); // NOI18N
        btnAlterar1.setToolTipText("Alterar");
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        btnAvancarUmRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro1.setToolTipText("Próximo registro");
        btnAvancarUmRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistro1ActionPerformed(evt);
            }
        });

        lblCod2.setText("Consultar Usuário");

        btnFechar.setText("Fechar ");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(258, 258, 258)
                            .addComponent(lblCod2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblPesquisa1)
                                    .addGap(62, 62, 62)
                                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnPrimeiroRegistro1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnVoltarUmRegistro1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnAvancarUmRegistro1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnUltimoRegistro1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNovo1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnCadastrar1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnAlterar1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(brnExcluir1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCod1)
                                                .addComponent(lblNome1)
                                                .addComponent(Se))
                                            .addGap(56, 56, 56)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblAviso1))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jScrollPane2))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnVoltarMenuAdministrador)
                        .addGap(74, 74, 74)
                        .addComponent(btnFechar)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCod2)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAviso1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Se)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrimeiroRegistro1)
                        .addComponent(btnVoltarUmRegistro1)
                        .addComponent(btnAvancarUmRegistro1)
                        .addComponent(btnUltimoRegistro1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo1)
                        .addComponent(btnCadastrar1)
                        .addComponent(btnAlterar1)
                        .addComponent(brnExcluir1)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarMenuAdministrador)
                    .addComponent(btnFechar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuAdministradorActionPerformed
        Menu_Administrador ir =new Menu_Administrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarMenuAdministradorActionPerformed

    private void brnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnExcluir1ActionPerformed

        String sql="";

        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 0){
                sql = "delete from tblusuario where cod_cliente = " + txtCod.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir == 1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tblusuario order by cod_cliente");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "\n Erro na exclusão :\n " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_brnExcluir1ActionPerformed

    private void btnUltimoRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistro1ActionPerformed

        try {
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: "+erro);
        }
    }//GEN-LAST:event_btnUltimoRegistro1ActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed

        txtCod.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtCod.requestFocus();
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        try {
            String pesquisa = "select * from tblusuario where usuario like '" + txtPesquisa.getText() + "%'";
            con_cliente.executaSQL(pesquisa);

            if(con_cliente.resultset.first()){
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este parâmetro!!", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n " + errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnPrimeiroRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistro1ActionPerformed

        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: "+erro);
        }
    }//GEN-LAST:event_btnPrimeiroRegistro1ActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed

        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        try {
            String insert_sql = "insert into tblusuario (usuario,senha) values ('"+ usuario + "','" + senha + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tblusuario order by cod_cliente");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnVoltarUmRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUmRegistro1ActionPerformed

        try {
            if(con_cliente.resultset.isFirst() == false){
                con_cliente.resultset.previous();
            }else{
                con_cliente.resultset.first();
            }
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no registro anterior: "+erro);
        }
    }//GEN-LAST:event_btnVoltarUmRegistro1ActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked

        int linha_selecionada = tblUsuarios.getSelectedRow();

        txtCod.setText(tblUsuarios.getValueAt(linha_selecionada, 0).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(linha_selecionada, 1).toString());
        txtSenha.setText(tblUsuarios.getValueAt(linha_selecionada, 2).toString());
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void tblUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUsuariosKeyPressed

        int linha_selecionada = tblUsuarios.getSelectedRow();

        txtCod.setText(tblUsuarios.getValueAt(linha_selecionada, 0).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(linha_selecionada, 1).toString());
        txtSenha.setText(tblUsuarios.getValueAt(linha_selecionada, 2).toString());
    }//GEN-LAST:event_tblUsuariosKeyPressed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed

        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        String sql = "";
        String msg = "";

        try {
            //INSERT
            if(txtCod.getText().equals("")){
                sql="insert into tblusuario (usuario,senha) values ('"+ usuario + "','" + senha + "')";
                msg="Gravação de um novo registro";
            }else{
                //UPDATE
                sql="update tblusuario set usuario='" + usuario + "', senha='" + senha + "' where cod_cliente = " + txtCod.getText();
                msg="Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from tblusuario order by cod_cliente");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnAvancarUmRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarUmRegistro1ActionPerformed

        try {
            if(con_cliente.resultset.isLast() == false){
                con_cliente.resultset.next();
                mostrar_Dados();
            }else{
                con_cliente.resultset.last();
                mostrar_Dados();
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no próximo registro: "+erro);
        }
    }//GEN-LAST:event_btnAvancarUmRegistro1ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

     public void preencherTabela(){
        tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(4);
        tblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(4);
        
        DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod_cliente"),con_cliente.resultset.getString("usuario"),con_cliente.resultset.getString("senha")

                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    

    public void posicionarRegistro(){
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro:"+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    

    public void mostrar_Dados()
    {
        try {
            txtCod.setText(con_cliente.resultset.getString("cod_cliente"));
            txtUsuario.setText(con_cliente.resultset.getString("usuario"));
            txtSenha.setText(con_cliente.resultset.getString("senha"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Se;
    private javax.swing.JButton brnExcluir1;
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JButton btnAvancarUmRegistro1;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnPrimeiroRegistro1;
    private javax.swing.JButton btnUltimoRegistro1;
    private javax.swing.JButton btnVoltarMenuAdministrador;
    private javax.swing.JButton btnVoltarUmRegistro1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAviso1;
    private javax.swing.JLabel lblCod1;
    private javax.swing.JLabel lblCod2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblPesquisa1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
