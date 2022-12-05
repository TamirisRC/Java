package controle;

public class Menu_Administrador extends javax.swing.JFrame {

    public Menu_Administrador() {
        initComponents();
        
         setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultarClientes = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnConsultarUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarAgendamentos = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnFechar14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConsultarClientes.setText("Consultar");
        btnConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClientesActionPerformed(evt);
            }
        });

        jLabel3.setText("Consultar Usuários");

        btnConsultarUsuarios.setText("Consultar");
        btnConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuariosActionPerformed(evt);
            }
        });

        jLabel1.setText("Consultar Agendamentos");

        btnConsultarAgendamentos.setText("Consultar");
        btnConsultarAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAgendamentosActionPerformed(evt);
            }
        });

        jLabel2.setText("Consultar Clientes");

        jLabel4.setText("Menu do Administrador");

        btnInicio.setText("Voltar pro início");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnFechar14.setText("Fechar ");
        btnFechar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnConsultarUsuarios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(50, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addGap(69, 69, 69)
                .addComponent(btnFechar14)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnConsultarAgendamentos)
                        .addGap(80, 80, 80)
                        .addComponent(btnConsultarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarAgendamentos)
                    .addComponent(btnConsultarClientes)
                    .addComponent(btnConsultarUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnFechar14))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClientesActionPerformed
        Consultar_ClienteAdministrador ir = new Consultar_ClienteAdministrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarClientesActionPerformed

    private void btnConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuariosActionPerformed
        Consultar_UsuarioAdministrador ir = new Consultar_UsuarioAdministrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarUsuariosActionPerformed

    private void btnConsultarAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAgendamentosActionPerformed
        Consultar_AgendamentoAdministrador ir = new Consultar_AgendamentoAdministrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarAgendamentosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Frm_TelaInicio ir = new Frm_TelaInicio();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFechar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar14ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFechar14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConsultarAgendamentos;
    private javax.swing.JToggleButton btnConsultarClientes;
    private javax.swing.JButton btnConsultarUsuarios;
    private javax.swing.JButton btnFechar14;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
