package controle;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Consultar_AgendamentoAdministrador extends javax.swing.JFrame {
    
    Conexao con_cliente;

    public Consultar_AgendamentoAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
        tblClientes.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarMenuAdministrador = new javax.swing.JButton();
        txtNasc = new javax.swing.JFormattedTextField();
        btnVoltarUmRegistro = new javax.swing.JButton();
        txtTel = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        btnAvancarUmRegistro = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        lblNasc = new javax.swing.JLabel();
        btnUltimoRegistro = new javax.swing.JButton();
        lblTel = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        brnExcluir = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPesquisa = new javax.swing.JTextField();
        btnPrimeiroRegistro = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarMenuAdministrador.setText("Voltar pro Menu");
        btnVoltarMenuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuAdministradorActionPerformed(evt);
            }
        });

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro.setToolTipText("Registro anterior");
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setToolTipText("");

        lblNome.setText("Nome:");

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro.setToolTipText("Próximo registro");
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("O Código não necessita de inserção ou alteração");

        lblNasc.setText("Data Nascimento:");

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.setToolTipText("Úlitmo registro");
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        lblTel.setText("Telefone:");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btnNovo.setToolTipText("Limpar Seleção");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblEmail.setText("Email:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disk.png"))); // NOI18N
        btnCadastrar.setToolTipText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nascimento", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        tblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_edit.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        brnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_delete.png"))); // NOI18N
        brnExcluir.setToolTipText("Deletar");
        brnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnExcluirActionPerformed(evt);
            }
        });

        txtCod.setEditable(false);
        txtCod.setText(" ");

        lblPesquisa.setText("Pesquisa por nome do Cliente:");

        txtEmail.setToolTipText("");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro.setToolTipText("Primeiro registro");
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });

        lblCod.setText("Código: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCod)
                                    .addComponent(lblNome)
                                    .addComponent(lblNasc)
                                    .addComponent(lblTel)
                                    .addComponent(lblEmail))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(109, 109, 109))
                                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAviso))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiroRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvancarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimoRegistro)
                                .addGap(75, 75, 75)
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brnExcluir)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPesquisa)
                                .addGap(62, 62, 62)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnVoltarMenuAdministrador))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAviso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNasc)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiroRegistro)
                            .addComponent(btnVoltarUmRegistro)
                            .addComponent(btnAvancarUmRegistro)
                            .addComponent(btnUltimoRegistro))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnCadastrar)
                            .addComponent(btnAlterar)
                            .addComponent(brnExcluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(btnVoltarMenuAdministrador)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuAdministradorActionPerformed
        Menu_Administrador ir =new Menu_Administrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarMenuAdministradorActionPerformed

    private void btnVoltarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUmRegistroActionPerformed

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
    }//GEN-LAST:event_btnVoltarUmRegistroActionPerformed

    private void btnAvancarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarUmRegistroActionPerformed

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
    }//GEN-LAST:event_btnAvancarUmRegistroActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed

        try {
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: "+erro);
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtCod.setText("");
        txtNome.setText("");
        txtNasc.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtCod.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nome = txtNome.getText();
        String data_nasc = txtNasc.getText();
        String telefone = txtTel.getText();
        String email = txtEmail.getText();

        try {
            String insert_sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tbclientes order by cod");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

        int linha_selecionada = tblClientes.getSelectedRow();

        txtCod.setText(tblClientes.getValueAt(linha_selecionada, 0).toString());
        txtNome.setText(tblClientes.getValueAt(linha_selecionada, 1).toString());
        txtNasc.setText(tblClientes.getValueAt(linha_selecionada, 2).toString());
        txtTel.setText(tblClientes.getValueAt(linha_selecionada, 3).toString());
        txtEmail.setText(tblClientes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientesKeyPressed

        int linha_selecionada = tblClientes.getSelectedRow();

        txtCod.setText(tblClientes.getValueAt(linha_selecionada, 0).toString());
        txtNome.setText(tblClientes.getValueAt(linha_selecionada, 1).toString());
        txtNasc.setText(tblClientes.getValueAt(linha_selecionada, 2).toString());
        txtTel.setText(tblClientes.getValueAt(linha_selecionada, 3).toString());
        txtEmail.setText(tblClientes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblClientesKeyPressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        String nome = txtNome.getText();
        String data_nasc = txtNasc.getText();
        String telefone = txtTel.getText();
        String email = txtEmail.getText();

        String sql = "";
        String msg = "";

        try {
            //INSERT
            if(txtCod.getText().equals("")){
                sql="insert into tbclientes (nome, telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                msg="Gravação de um novo registro";
            }else{
                //UPDATE
                sql="update tbclientes set nome='" + nome + "',telefone='" + telefone + "', email='" + email + "', dt_nasc='" + data_nasc + "' where cod = " + txtCod.getText();
                msg="Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from tbclientes order by cod");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void brnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnExcluirActionPerformed

        String sql="";

        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 0){
                sql = "delete from tbclientes where cod = " + txtCod.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir == 1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tbclientes order by cod");
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
    }//GEN-LAST:event_brnExcluirActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        try {
            String pesquisa = "select * from tbclientes where nome like '" + txtPesquisa.getText() + "%'";
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

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed

        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: "+erro);
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    public void preencherTabela(){
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(14);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")

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
            txtCod.setText(con_cliente.resultset.getString("cod"));
            txtNome.setText(con_cliente.resultset.getString("nome"));
            txtNasc.setText(con_cliente.resultset.getString("dt_nasc"));
            txtTel.setText(con_cliente.resultset.getString("telefone"));
            txtEmail.setText(con_cliente.resultset.getString("email"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnExcluir;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancarUmRegistro;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltarMenuAdministrador;
    private javax.swing.JButton btnVoltarUmRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
