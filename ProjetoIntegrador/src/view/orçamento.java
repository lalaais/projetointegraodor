package view;

public class orçamento extends javax.swing.JFrame {

    public orçamento() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuFornecedor = new javax.swing.JMenu();
        menuProduto = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuFornecedor1 = new javax.swing.JMenu();
        menuProduto1 = new javax.swing.JMenu();
        menuSair1 = new javax.swing.JMenu();

        menuFornecedor.setText("Cadastrar Fornecedor");
        menuFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFornecedorMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuFornecedor);

        menuProduto.setText("Cadastrar Produto");
        menuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProdutoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuProduto);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        menuFornecedor1.setText("Cadastrar Fornecedor");
        menuFornecedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFornecedor1MouseClicked(evt);
            }
        });
        jMenuBar2.add(menuFornecedor1);

        menuProduto1.setText("Cadastrar Produto");
        menuProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProduto1MouseClicked(evt);
            }
        });
        jMenuBar2.add(menuProduto1);

        menuSair1.setText("Sair");
        menuSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSair1MouseClicked(evt);
            }
        });
        jMenuBar2.add(menuSair1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFornecedorMouseClicked
        // TODO add your handling code here:
        CadastroFornece cadFornecedor = new CadastroFornece();
        cadFornecedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuFornecedorMouseClicked

    private void menuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProdutoMouseClicked
        // TODO add your handling code here:
        cadastroProduto cadProduto = new cadastroProduto();
        cadProduto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuProdutoMouseClicked

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        // TODO add your handling code here:
        login menuSair = new login();
        menuSair.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuFornecedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFornecedor1MouseClicked
        // TODO add your handling code here:
        CadastroFornece cadFornecedor = new CadastroFornece();
        cadFornecedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuFornecedor1MouseClicked

    private void menuProduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProduto1MouseClicked
        // TODO add your handling code here:
        cadastroProduto cadProduto = new cadastroProduto();
        cadProduto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuProduto1MouseClicked

    private void menuSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSair1MouseClicked
        // TODO add your handling code here:
        login menuSair = new login();
        menuSair.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSair1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(orçamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orçamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orçamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orçamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orçamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuFornecedor;
    private javax.swing.JMenu menuFornecedor1;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuProduto1;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSair1;
    // End of variables declaration//GEN-END:variables
}
