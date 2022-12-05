package controle;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Consultar_ClienteAdministrador extends javax.swing.JFrame {
    
      Conexao con_cliente;

    public Consultar_ClienteAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tblcliente order by cod_cliente");
        preencherTabela();
        posicionarRegistro();
        tblCliente.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarMenuAdministrador = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        brnExcluir = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        lblPesquisa = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        Nome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nome1 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarMenuAdministrador.setText("Voltar pro Menu");
        btnVoltarMenuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuAdministradorActionPerformed(evt);
            }
        });

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro.setToolTipText("Próximo registro");
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });

        brnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_delete.png"))); // NOI18N
        brnExcluir.setToolTipText("Deletar");
        brnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnExcluirActionPerformed(evt);
            }
        });

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.setToolTipText("Úlitmo registro");
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        lblPesquisa.setText("Pesquisa por nome do Cliente:");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btnNovo.setToolTipText("Limpar Seleção");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

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

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disk.png"))); // NOI18N
        btnCadastrar.setToolTipText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro.setToolTipText("Registro anterior");
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Nome", "Telefone", "Email", "Data ", "Cpf", "Rg"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        tblCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_edit.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtNome.setMinimumSize(new java.awt.Dimension(80, 22));
        txtNome.setPreferredSize(new java.awt.Dimension(80, 22));

        Nome.setText("Nome");

        txtEmail.setPreferredSize(new java.awt.Dimension(80, 22));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setPreferredSize(new java.awt.Dimension(112, 22));

        jLabel1.setText("Telefone");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setPreferredSize(new java.awt.Dimension(51, 22));

        jLabel2.setText("CPF");

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setPreferredSize(new java.awt.Dimension(72, 22));

        jLabel3.setText("RG");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setPreferredSize(new java.awt.Dimension(65, 22));

        jLabel4.setText("Data de Nascimento");

        jLabel5.setText("Email");

        Nome1.setText("Consultar Clientes");

        txtCodigoCliente.setEditable(false);
        txtCodigoCliente.setText(" ");
        txtCodigoCliente.setPreferredSize(new java.awt.Dimension(80, 22));

        lblCod.setText("Código do Cliente: ");

        lblAviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("O Código não necessita de inserção ou alteração");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblCod)
                                    .addComponent(Nome))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAviso))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiroRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvancarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimoRegistro)
                                .addGap(73, 73, 73)
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPesquisa)
                .addGap(135, 135, 135)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(btnVoltarMenuAdministrador)
                        .addGap(63, 63, 63)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addComponent(Nome1)))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCod)
                            .addComponent(lblAviso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNovo)
                                .addComponent(btnCadastrar)
                                .addComponent(btnAlterar)
                                .addComponent(brnExcluir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPrimeiroRegistro)
                                .addComponent(btnVoltarUmRegistro)
                                .addComponent(btnAvancarUmRegistro)
                                .addComponent(btnUltimoRegistro)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesquisa))
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltarMenuAdministrador)
                            .addComponent(btnFechar))
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuAdministradorActionPerformed
        Menu_Administrador ir =new Menu_Administrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarMenuAdministradorActionPerformed

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

    private void brnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnExcluirActionPerformed

        String sql="";

        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 0){
                sql = "delete from tblcliente where cod_cliente = " + txtCodigoCliente.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir == 1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tblcliente order by cod_cliente");
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

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed

        try {
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: "+erro);
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtCodigoCliente.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtCodigoCliente.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed

        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: "+erro);
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nome = txtNome.getText(); 
        String telefone = txtTelefone.getText();
        String cpf = txtCpf.getText(); 
        String rg = txtRg.getText(); 
        String dataNasc = txtDataNascimento.getText(); 
        String email = txtEmail.getText();

        
        try {
            String insert_sql = "insert into tblcliente (nome,telefone, email, dat_Nasc, cpf, rg) values ('" + nome + "','" + telefone + "','" + email + "','" + dataNasc + "','" + cpf + "','" + rg + "')";  //inserindo instrução SQL na variável sql
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tblcliente order by cod_cliente");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();
            
        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE); //tratamento de erro
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        String nome = txtNome.getText(); 
        String telefone = txtTelefone.getText();
        String cpf = txtCpf.getText(); 
        String rg = txtRg.getText(); 
        String dataNasc = txtDataNascimento.getText(); 
        String email = txtEmail.getText();

        String sql = "";
        String msg = "";

        try {
            //INSERT
            if(txtCodigoCliente.getText().equals("")){
                sql = "insert into tblcliente (nome,telefone, email, dat_Nasc, cpf, rg) values ('" + nome + "','" + telefone + "','" + email + "','" + dataNasc + "','" + cpf + "','" + rg + "')";
                msg="Gravação de um novo registro";
            }else{
                //UPDATE
                sql="update tblcliente set nome='" + nome + "',telefone='" + telefone + "', cpf='" + cpf + "', rg='" + rg + "',dat_Nasc='" + dataNasc + "',email='" + email + "' where cod_cliente = " + txtCodigoCliente.getText();
                msg="Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from tblcliente order by cod_cliente");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyPressed

       int linha_selecionada = tblCliente.getSelectedRow();

        txtCodigoCliente.setText(tblCliente.getValueAt(linha_selecionada, 0).toString());
        txtNome.setText(tblCliente.getValueAt(linha_selecionada, 1).toString());
        txtTelefone.setText(tblCliente.getValueAt(linha_selecionada, 2).toString());
        txtEmail.setText(tblCliente.getValueAt(linha_selecionada, 3).toString());
        txtDataNascimento.setText(tblCliente.getValueAt(linha_selecionada, 4).toString());
        txtCpf.setText(tblCliente.getValueAt(linha_selecionada, 5).toString());
        txtRg.setText(tblCliente.getValueAt(linha_selecionada, 6).toString());
    }//GEN-LAST:event_tblClienteKeyPressed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked

        int linha_selecionada = tblCliente.getSelectedRow();

        txtCodigoCliente.setText(tblCliente.getValueAt(linha_selecionada, 0).toString());
        txtNome.setText(tblCliente.getValueAt(linha_selecionada, 1).toString());
        txtTelefone.setText(tblCliente.getValueAt(linha_selecionada, 2).toString());
        txtEmail.setText(tblCliente.getValueAt(linha_selecionada, 3).toString());
        txtDataNascimento.setText(tblCliente.getValueAt(linha_selecionada, 4).toString());
        txtCpf.setText(tblCliente.getValueAt(linha_selecionada, 5).toString());
        txtRg.setText(tblCliente.getValueAt(linha_selecionada, 6).toString());
        
        
    }//GEN-LAST:event_tblClienteMouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        try {
            String pesquisa = "select * from tblcliente where nome like '" + txtPesquisa.getText() + "%'";
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

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    
    public void preencherTabela(){
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(4);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(4);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(4);
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(4);
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(4);
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(4);
        
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod_cliente"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("telefone"),con_cliente.resultset.getString("email"), con_cliente.resultset.getString("dat_Nasc"), con_cliente.resultset.getString("cpf"), con_cliente.resultset.getString("rg")
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
            txtCodigoCliente.setText(con_cliente.resultset.getString("cod_cliente"));
            txtNome.setText(con_cliente.resultset.getString("nome"));
            txtTelefone.setText(con_cliente.resultset.getString("telefone"));
            txtEmail.setText(con_cliente.resultset.getString("email"));
            txtDataNascimento.setText(con_cliente.resultset.getString("dat_Nasc"));
            txtCpf.setText(con_cliente.resultset.getString("cpf"));
            txtRg.setText(con_cliente.resultset.getString("rg"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nome1;
    private javax.swing.JButton brnExcluir;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancarUmRegistro;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltarMenuAdministrador;
    private javax.swing.JButton btnVoltarUmRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
