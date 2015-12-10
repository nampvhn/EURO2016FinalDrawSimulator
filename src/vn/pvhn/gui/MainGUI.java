/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.pvhn.gui;

import java.util.Collections;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import vn.pvhn.draw.Main;

/**
 *
 * @author Edison
 */
public class MainGUI extends javax.swing.JFrame {
    Main m = new Main();
    
    String[][] str;
    
    Vector<String> pot0;
    Vector<String> pot1;
    Vector<String> pot2;
    Vector<String> pot3;
    
    DefaultTableModel tblModel;
    String[] header = {"Group A", "Group B", "Group C", "Group D", "Group E", "Group F"};
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        this.setTitle("EURO 2016 DRAW SIMULATOR");
        
        str = m.getTeamList();

        pot0 = m.getTeamListByPot(str, 0);
        pot1 = m.getTeamListByPot(str, 1);
        pot2 = m.getTeamListByPot(str, 2);
        pot3 = m.getTeamListByPot(str, 3);

        addItemToJList(lstPot0, pot0);
        addItemToJList(lstPot1, pot1);
        addItemToJList(lstPot2, pot2);
        addItemToJList(lstPot3, pot3);
        
        tblModel = (DefaultTableModel) tblPot.getModel();
        tblModel.setDataVector(null, header);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPot0 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPot = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPot1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPot2 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPot3 = new javax.swing.JList();
        btnSimulate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lstPot0.setBorder(javax.swing.BorderFactory.createTitledBorder("Pot 1"));
        lstPot0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lstPot0.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstPot0);

        tblPot.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblPot.setForeground(new java.awt.Color(0, 0, 153));
        tblPot.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPot);

        lstPot1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pot 2"));
        lstPot1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lstPot1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstPot1);

        lstPot2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pot 3"));
        lstPot2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lstPot2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(lstPot2);

        lstPot3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pot 4"));
        lstPot3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lstPot3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(lstPot3);

        btnSimulate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimulate.setForeground(new java.awt.Color(255, 51, 51));
        btnSimulate.setText("Draw Simulator");
        btnSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 51, 51));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/pvhn/img/Logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSimulate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulateActionPerformed
        Vector<String> tmpPot0 = new Vector<>();
        for (int i = 1; i < pot0.size(); i++) {
            tmpPot0.add(pot0.get(i));
        }
        m.shuffleTeam(tmpPot0);
        pot0.clear();
        pot0.add(str[0][0]); // Thêm France
        pot0.addAll(tmpPot0);
        m.shuffleTeam(pot1);
        m.shuffleTeam(pot2);
        m.shuffleTeam(pot3);
        
        // Gán lại giá trị cho mảng
        for (int j = 0; j < 6; j++) {
            str[0][j] = pot0.get(j);
            str[1][j] = pot1.get(j);
            str[2][j] = pot2.get(j);
            str[3][j] = pot3.get(j);
        }
        
        // Sắp xếp thứ tự trong bảng
        Vector<String> tmp0 = new Vector<>();
        Vector<String> tmp1 = new Vector<>();
        Vector<String> tmp2 = new Vector<>();
        Vector<String> tmp3 = new Vector<>();
        Vector<String> tmp4 = new Vector<>();
        Vector<String> tmp5 = new Vector<>();
        
        for (int i = 1; i < 4; i++) {
            tmp0.add(str[i][0]);
            tmp1.add(str[i][1]);
            tmp2.add(str[i][2]);
            tmp3.add(str[i][3]);
            tmp4.add(str[i][4]);
            tmp5.add(str[i][5]);
        }
        
        m.shuffleTeam(tmp0);
        m.shuffleTeam(tmp1);
        m.shuffleTeam(tmp2);
        m.shuffleTeam(tmp3);
        m.shuffleTeam(tmp4);
        m.shuffleTeam(tmp5);
        
        // 6 groups
        Vector<String> group0 = new Vector<>();
        Vector<String> group1 = new Vector<>();
        Vector<String> group2 = new Vector<>();
        Vector<String> group3 = new Vector<>();
        Vector<String> group4 = new Vector<>();
        Vector<String> group5 = new Vector<>();
        
        group0.add(str[0][0]);
        group1.add(str[0][1]);
        group2.add(str[0][2]);
        group3.add(str[0][3]);
        group4.add(str[0][4]);
        group5.add(str[0][5]);
        
        group0.addAll(tmp0);
        group1.addAll(tmp1);
        group2.addAll(tmp2);
        group3.addAll(tmp3);
        group4.addAll(tmp4);
        group5.addAll(tmp5);
        
        // Lại gán lại giá trị cho mảng
        for (int i = 0; i < 4; i++) {
            str[i][0] = group0.get(i);
            str[i][1] = group1.get(i);
            str[i][2] = group2.get(i);
            str[i][3] = group3.get(i);
            str[i][4] = group4.get(i);
            str[i][5] = group5.get(i);
        }
        
        // Table
        tblModel.setDataVector(str, header);
    }//GEN-LAST:event_btnSimulateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tblModel.setDataVector(null, header);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimulate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JList lstPot0;
    private javax.swing.JList lstPot1;
    private javax.swing.JList lstPot2;
    private javax.swing.JList lstPot3;
    private javax.swing.JTable tblPot;
    // End of variables declaration//GEN-END:variables

    public void addItemToJList(JList lst, Vector<String> pot) {
        DefaultListModel listModel = new DefaultListModel();
        pot.stream().forEach((s) -> {
            listModel.addElement(s);
        });
        lst.setModel(listModel);
    }
}