/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

/**
 *
 * @author Paulina
 */

public class RezerwacjeWindow extends javax.swing.JFrame {

    private MenuWindow sender;
    int ostatniIndex;
    
    BazaDanych bazaDanych;
    
    /**
     * Creates new form WycieczkiWindow
     */
    public RezerwacjeWindow() {
        initComponents();
    }
    
    public RezerwacjeWindow(MenuWindow newSender, BazaDanych newBazaDanych) {
        this();
        sender = newSender;
        bazaDanych = newBazaDanych;
        
        zaladujDane();
        aktualizujPrzyciski();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();
        btnEdytuj = new javax.swing.JButton();
        btnUsun = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Wycieczki");
        setType(java.awt.Window.Type.UTILITY);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnOk.setText("Wyjdź");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnEdytuj.setText("Edytuj");
        btnEdytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdytujActionPerformed(evt);
            }
        });

        btnUsun.setText("Usuń");
        btnUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDodaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdytuj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnEdytuj)
                    .addComponent(btnUsun)
                    .addComponent(btnDodaj))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunActionPerformed
        if (tabela.getSelectedRow() >= 0) {
            bazaDanych.usunRezerwacje(tabela.getSelectedRow());
            zaladujDane();
            aktualizujPrzyciski();
        }
    }//GEN-LAST:event_btnUsunActionPerformed

    private void btnEdytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdytujActionPerformed
        if (tabela.getSelectedRow() >= 0) {
            RezerwacjaWindow rezerwacjaWindow = new RezerwacjaWindow(this, bazaDanych, tabela.getSelectedRow());
            ostatniIndex = tabela.getSelectedRow();
            setVisible(false);
        }
    }//GEN-LAST:event_btnEdytujActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        sender.koniecEdycjiRezerwacji(true);
        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        aktualizujPrzyciski();
    }//GEN-LAST:event_tabelaKeyPressed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        aktualizujPrzyciski();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        RezerwacjaWindow rezerwacjaWindow = new RezerwacjaWindow(this, bazaDanych);
        setVisible(false);
    }//GEN-LAST:event_btnDodajActionPerformed

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
            java.util.logging.Logger.getLogger(RezerwacjeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezerwacjeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezerwacjeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezerwacjeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezerwacjeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnEdytuj;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnUsun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void zaladujDane() {
        tabela.setModel(new RezerwacjeTableModel(bazaDanych.getModelTabeliRezerwacji()));
    }
    
    private void aktualizujPrzyciski() {
        btnEdytuj.setEnabled(tabela.getSelectedRow() >= 0);
        btnUsun.setEnabled(tabela.getSelectedRow() >= 0);
    }
    
    public void koniecEdycjiRezerwacji(boolean ok) {
        if (ok) {
            zaladujDane();
        }
        aktualizujPrzyciski();
        setVisible(true);
    }
    
}
