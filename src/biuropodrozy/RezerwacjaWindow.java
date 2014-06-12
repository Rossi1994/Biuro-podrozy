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
public class RezerwacjaWindow extends javax.swing.JFrame {

    private RezerwacjeWindow sender;
    private Klient daneKlienta;
    private Wycieczka wybranaWycieczka;
    private BazaDanych bazaDanych;
    private boolean nowyWpis;
    
    /**
     * Creates new form RezerwacjaWindow
     */
    public RezerwacjaWindow() {
        initComponents();
    }
    
    public RezerwacjaWindow(RezerwacjeWindow newSender, BazaDanych newBazaDanych) {
        this();
        sender = newSender;
        daneKlienta = null;
        wybranaWycieczka = null;
        bazaDanych = newBazaDanych;
        nowyWpis = true;
    }
    
    public RezerwacjaWindow(RezerwacjeWindow newSender, BazaDanych newBazaDanych, Rezerwacja newRezerwacja) {
        sender = newSender;
        daneKlienta = newRezerwacja.getKlient();
        wybranaWycieczka = newRezerwacja.getWycieczka();
        bazaDanych = newBazaDanych;
        // TODO Jeszcze coś
        nowyWpis = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWycieczka = new javax.swing.JLabel();
        btnWycieczka = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spnMiejsca = new javax.swing.JSpinner();
        lblMiejsca = new javax.swing.JLabel();
        btnKlient = new javax.swing.JButton();
        lblKlient = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnAnuluj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Edytuj rezerwację");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        lblWycieczka.setText("Wycieczka: nie wybrano");

        btnWycieczka.setText("Wybierz wycieczkę");
        btnWycieczka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWycieczkaActionPerformed(evt);
            }
        });

        jLabel2.setText("Liczba miejsc:");

        lblMiejsca.setText("/10");

        btnKlient.setText("Wprowadź dane");
        btnKlient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlientActionPerformed(evt);
            }
        });

        lblKlient.setText("Dane klienta: imie nazwisko");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnAnuluj.setText("Anuluj");
        btnAnuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnulujActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWycieczka)
                    .addComponent(jLabel2)
                    .addComponent(lblKlient))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWycieczka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKlient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spnMiejsca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMiejsca)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnuluj)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWycieczka)
                    .addComponent(btnWycieczka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnMiejsca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblMiejsca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKlient)
                    .addComponent(lblKlient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnuluj)
                    .addComponent(btnOk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKlientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlientActionPerformed
        KlientWindow klientWindow = new KlientWindow(this, daneKlienta);
        setVisible(false);
    }//GEN-LAST:event_btnKlientActionPerformed

    private void btnWycieczkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWycieczkaActionPerformed
        WycieczkiWindow wycieczkiWidnow = new WycieczkiWindow(this, bazaDanych);
        setVisible(false);
    }//GEN-LAST:event_btnWycieczkaActionPerformed

    private void btnAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnulujActionPerformed
        sender.koniecEdydjiRezerwacji(false);
        dispose();
    }//GEN-LAST:event_btnAnulujActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        sender.koniecEdycjiRezerwacji(true);
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(RezerwacjaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezerwacjaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezerwacjaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezerwacjaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezerwacjaWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnuluj;
    private javax.swing.JButton btnKlient;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnWycieczka;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblKlient;
    private javax.swing.JLabel lblMiejsca;
    private javax.swing.JLabel lblWycieczka;
    private javax.swing.JSpinner spnMiejsca;
    // End of variables declaration//GEN-END:variables

    private void wyswietlKlienta() {
        lblKlient.setText("Dane klienta: " + daneKlienta.getImie() + " " + daneKlienta.getNazwisko());
    }
    
    private void wyswietlWycieczke() {
        lblWycieczka.setText("Wycieczka: " + wybranaWycieczka.getMiejsce() + " - " + wybranaWycieczka.getData());
    }


    public void koniecEdycjiKlienta(boolean ok, Klient newKlient) {
        if (ok) {
            daneKlienta = newKlient;
            wyswietlKlienta();
        }
        setVisible(true);
    }
    
    public void koniecWyboruWycieczki(boolean ok, Wycieczka newWycieczka) {
        if (ok) {
            wybranaWycieczka = newWycieczka;
            wyswietlWycieczke();
        }
    }

}
