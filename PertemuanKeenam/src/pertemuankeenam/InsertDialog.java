/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pertemuankeenam;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class InsertDialog extends javax.swing.JDialog {

    private final Connection conn; // tambahkan di atas biar bisa dipakai seluruh kelas

    public InsertDialog(Frame parent, Connection conn) {
        super(parent, "Insert Komik", true);
        this.conn = conn;
        initComponents();
        if (parent != null) {
            setLocationRelativeTo(parent);  // muncul di tengah parent
        } else {
            setLocationRelativeTo(null);    // muncul di tengah layar
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tfjudul = new javax.swing.JTextField();
        tfpengarang = new javax.swing.JTextField();
        tftahun = new javax.swing.JTextField();
        tfgenre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btsave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("INPUT DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 6, -1, 32));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 59, 80, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("JUDUL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 96, 80, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("PENGARANG");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 139, 80, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("TAHUN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 179, 92, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("GENRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 219, 92, -1));

        tfid.setBackground(new java.awt.Color(0, 102, 255));
        tfid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfid.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 56, 203, -1));

        tfjudul.setBackground(new java.awt.Color(0, 102, 255));
        tfjudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfjudul.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(tfjudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 96, 203, -1));

        tfpengarang.setBackground(new java.awt.Color(0, 102, 255));
        tfpengarang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfpengarang.setForeground(new java.awt.Color(255, 204, 0));
        tfpengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpengarangActionPerformed(evt);
            }
        });
        jPanel1.add(tfpengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 136, 203, -1));

        tftahun.setBackground(new java.awt.Color(0, 102, 255));
        tftahun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tftahun.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(tftahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 176, 203, -1));

        tfgenre.setBackground(new java.awt.Color(0, 102, 255));
        tfgenre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfgenre.setForeground(new java.awt.Color(255, 204, 0));
        tfgenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfgenreActionPerformed(evt);
            }
        });
        jPanel1.add(tfgenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 216, 203, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 260, 94, 36));

        btsave.setBackground(new java.awt.Color(0, 255, 0));
        btsave.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        btsave.setText("SAVE");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 260, 94, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Husain\\OneDrive\\Bismillah\\NetBeansProjects\\PertemuanKeenam\\src\\pertemuankeenam\\Gemini_Generated_Image_31xxep31xxep31xx.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfpengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpengarangActionPerformed

    private void tfgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfgenreActionPerformed

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        try {
            String sql = "INSERT INTO toko_komik_jadoel (id, judul, pengarang, tahun, genre) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(tfid.getText()));
            ps.setString(2, tfjudul.getText());
            ps.setString(3, tfpengarang.getText());
            ps.setInt(4, Integer.parseInt(tftahun.getText()));
            ps.setString(5, tfgenre.getText());
            ps.executeUpdate();
            if (tfid.getText().isEmpty() || tfjudul.getText().isEmpty()
                    || tfpengarang.getText().isEmpty() || tftahun.getText().isEmpty()
                    || tfgenre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
                return;
            }

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            dispose(); // tutup dialog setelah insert
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        JOptionPane.showMessageDialog(null, """
                                            Kelas InsertDialog tidak bisa dijalankan langsung.
                                            Silakan jalankan lewat DataKomik.""",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfgenre;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfjudul;
    private javax.swing.JTextField tfpengarang;
    private javax.swing.JTextField tftahun;
    // End of variables declaration//GEN-END:variables
}
