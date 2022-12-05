package controle;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consultar_AgendamentoAdministrador extends javax.swing.JFrame {
    
    Conexao con_cliente;

    public Consultar_AgendamentoAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tblagendamento order by cod_cliente");
        preencherTabela();
        posicionarRegistro();
        tblAgendamento.setAutoCreateRowSorter(true);
        
        
       
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarMenuAdministrador = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        brnExcluir = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        Nome1 = new javax.swing.JLabel();
        lblPesquisa = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblAviso = new javax.swing.JLabel();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgendamento = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbBarbeiro = new javax.swing.JComboBox<>();
        cbCorte = new javax.swing.JComboBox<>();
        cbHorario = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnMais = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMostrarValor = new javax.swing.JTextField();
        lblAviso1 = new javax.swing.JLabel();
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

        Nome1.setText("Consultar Clientes");

        lblPesquisa.setText("Pesquisa por Código do Cliente:");

        txtCodigoCliente.setEditable(false);
        txtCodigoCliente.setText(" ");
        txtCodigoCliente.setPreferredSize(new java.awt.Dimension(80, 22));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btnNovo.setToolTipText("Limpar Seleção");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblCod.setText("Código do Cliente: ");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("O Código não necessita de inserção ou alteração");

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

        tblAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Barbeiro", "Corte", "Data ", "Horário", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgendamentoMouseClicked(evt);
            }
        });
        tblAgendamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAgendamentoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAgendamento);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_edit.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel6.setText("Escolha o Horário:");

        jLabel7.setText("Escolha o Corte:");

        cbBarbeiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Barbeiro:", "Lucas", "Joao", "Henrique", "Danilo", "Victor" }));

        cbCorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Corte:", "Blowout", "Bowl Cut", "Comb Over", "Crew Cut" }));
        cbCorte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbCorteFocusLost(evt);
            }
        });

        cbHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Horário:", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00" }));

        txtData.setEditable(false);

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        jLabel8.setText("Escolha o Barbeiro:");

        btnMais.setText("+");
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        jLabel9.setText("Escolha a Data:");

        jLabel10.setText("Clique no \"+\" ");

        jLabel11.setText("Valor:");

        txtMostrarValor.setEditable(false);

        lblAviso1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAviso1.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso1.setText("O Valor não necessita de inserção ou alteração");

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
                        .addGap(515, 515, 515)
                        .addComponent(btnVoltarMenuAdministrador)
                        .addGap(35, 35, 35)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(Nome1)))
                .addGap(453, 453, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCod)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAviso))
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
                                .addComponent(brnExcluir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnMenos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnMais))
                                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel7))
                                                .addGap(70, 70, 70))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbCorte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbBarbeiro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMostrarValor))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAviso1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPesquisa)
                            .addGap(18, 18, 18)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCod)
                    .addComponent(lblAviso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMais)
                        .addComponent(btnMenos))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMostrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAviso1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarMenuAdministrador)
                    .addComponent(btnFechar))
                .addGap(56, 56, 56))
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
                sql = "delete from tblagendamento where cod_cliente = " + txtCodigoCliente.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir == 1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tblagendamento order by cod_cliente");
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
        cbBarbeiro.setSelectedItem("Selecione o Barbeiro:");
        cbCorte.setSelectedItem("Selecione o Corte:");
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        LocalDate localDate = LocalDate.now();
        txtData.setText(dtf.format(localDate)); 
        
        cbHorario.setSelectedItem("Selecione o Horário:");
        txtMostrarValor.setText("");
        txtCodigoCliente.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        try {
            String pesquisa = "select * from tblagendamento where cod_cliente like '" + txtPesquisa.getText() + "%'";
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String barbeiro = cbBarbeiro.getSelectedItem().toString();
        String corte = cbCorte.getSelectedItem().toString();
        String data = txtData.getText();
        String horario = cbHorario.getSelectedItem().toString();
        String valor = txtMostrarValor.getText();

        try {
            String insert_sql = "insert into tblagendamento (barbeiro,corte, data, horario, valor) values ('" + barbeiro + "','" + corte + "','" + data+ "','" + horario + "','" + valor + "')";  //inserindo instrução SQL na variável sql
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tblagendamento order by cod_cliente");
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

    private void tblAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendamentoMouseClicked

        int linha_selecionada = tblAgendamento.getSelectedRow();

        txtCodigoCliente.setText(tblAgendamento.getValueAt(linha_selecionada, 0).toString());
        cbBarbeiro.setSelectedItem(tblAgendamento.getValueAt(linha_selecionada, 1).toString());
        cbCorte.setSelectedItem(tblAgendamento.getValueAt(linha_selecionada, 2).toString());
        txtData.setText(tblAgendamento.getValueAt(linha_selecionada, 3).toString());
        cbHorario.setSelectedItem(tblAgendamento.getValueAt(linha_selecionada, 4).toString());
        txtMostrarValor.setText(tblAgendamento.getValueAt(linha_selecionada, 5).toString());


    }//GEN-LAST:event_tblAgendamentoMouseClicked

    private void tblAgendamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAgendamentoKeyPressed

        int linha_selecionada = tblAgendamento.getSelectedRow();

        txtCodigoCliente.setText(tblAgendamento.getValueAt(linha_selecionada, 0).toString());
        cbBarbeiro.setSelectedItem(tblAgendamento.getValueAt(linha_selecionada, 1).toString());
        cbCorte.setSelectedItem(tblAgendamento.getValueAt(linha_selecionada, 2).toString());
        txtData.setText(tblAgendamento.getValueAt(linha_selecionada, 3).toString());
        cbHorario.setSelectedItem(tblAgendamento.getValueAt(linha_selecionada, 4).toString());
        txtMostrarValor.setText(tblAgendamento.getValueAt(linha_selecionada, 5).toString());
    }//GEN-LAST:event_tblAgendamentoKeyPressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        String barbeiro = cbBarbeiro.getSelectedItem().toString();
        String corte = cbCorte.getSelectedItem().toString();
        String data = txtData.getText();
        String horario = cbHorario.getSelectedItem().toString();
        String valor = txtMostrarValor.getText();

        String sql = "";
        String msg = "";

        try {
            //INSERT
            if(txtCodigoCliente.getText().equals("")){
                sql = "insert into tblagendamento (barbeiro,corte, data, horario, valor) values ('" + barbeiro + "','" + corte + "','" + data+ "','" + horario + "','" + valor + "')";
                msg = "Gravação de um novo registro";
            }else{
                //UPDATE
                sql="update tblagendamento set barbeiro='" + barbeiro + "', corte='" + corte + "', data='" + data + "',horario='" + horario + "',valor='" + valor + "' where cod_cliente = " + txtCodigoCliente.getText();
                msg="Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from tblagendamento order by cod_cliente");
            con_cliente.resultset.first();
            preencherTabela();
            posicionarRegistro();
            mostrar_Dados();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data;
        data = LocalDate.parse(txtData.getText(), dtf);

        String a = data + "";
        String b = LocalDate.now() + "";

        if(a == b){

            btnMenos.setEnabled(false);

        }
        else{
            btnMenos.setEnabled(true);
            txtData.setText(dtf.format(data.minusDays(1)));

        }

    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data;
        data = LocalDate.parse(txtData.getText(), dtf);
        txtData.setText(dtf.format(data.plusDays(1)));
    }//GEN-LAST:event_btnMaisActionPerformed

    private void cbCorteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbCorteFocusLost
       int valor = 0;
        
       if(cbCorte.getSelectedItem().equals("Blowout")){
            valor=40;
        } else if (cbCorte.getSelectedItem().equals("Bowl Cut")){
            valor=25;
        } else if (cbCorte.getSelectedItem().equals("Comb Over")){
            valor=20;
        }  else if (cbCorte.getSelectedItem().equals("Crew Cut")){
            valor=35;
        }
        
        txtMostrarValor.setText(valor+",00");
    }//GEN-LAST:event_cbCorteFocusLost

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

        public void preencherTabela(){
        tblAgendamento.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblAgendamento.getColumnModel().getColumn(1).setPreferredWidth(4);
        tblAgendamento.getColumnModel().getColumn(2).setPreferredWidth(4);
        tblAgendamento.getColumnModel().getColumn(3).setPreferredWidth(4);
        tblAgendamento.getColumnModel().getColumn(4).setPreferredWidth(4);
        tblAgendamento.getColumnModel().getColumn(5).setPreferredWidth(4);
        
        DefaultTableModel modelo = (DefaultTableModel) tblAgendamento.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod_cliente"),con_cliente.resultset.getString("barbeiro"),con_cliente.resultset.getString("corte"),con_cliente.resultset.getString("data"), con_cliente.resultset.getString("horario"), con_cliente.resultset.getString("valor")
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
            cbBarbeiro.setSelectedItem(con_cliente.resultset.getString("barbeiro"));
            cbCorte.setSelectedItem(con_cliente.resultset.getString("corte"));
            txtData.setText(con_cliente.resultset.getString("data"));
            cbHorario.setSelectedItem(con_cliente.resultset.getString("horario"));
            txtMostrarValor.setText(con_cliente.resultset.getString("valor"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome1;
    private javax.swing.JButton brnExcluir;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancarUmRegistro;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltarMenuAdministrador;
    private javax.swing.JButton btnVoltarUmRegistro;
    javax.swing.JComboBox<String> cbBarbeiro;
    private javax.swing.JComboBox<String> cbCorte;
    private javax.swing.JComboBox<String> cbHorario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblAviso1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JTable tblAgendamento;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtData;
    public javax.swing.JTextField txtMostrarValor;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
