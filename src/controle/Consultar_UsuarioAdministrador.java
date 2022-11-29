package controle;

public class Consultar_UsuarioAdministrador extends javax.swing.JFrame {

    public Consultar_UsuarioAdministrador() {
        initComponents();
        
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarMenuAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarMenuAdministrador.setText("Voltar pro Menu");
        btnVoltarMenuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(btnVoltarMenuAdministrador)
                .addGap(348, 348, 348))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(689, Short.MAX_VALUE)
                .addComponent(btnVoltarMenuAdministrador)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuAdministradorActionPerformed
        Menu_Administrador ir =new Menu_Administrador();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarMenuAdministradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarMenuAdministrador;
    // End of variables declaration//GEN-END:variables
}
