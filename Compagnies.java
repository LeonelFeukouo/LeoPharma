package leopharma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Leonel FEUKOUO
 */
public class Compagnies extends Heritage {

    public Compagnies() {
        initComponents();
        SelectCompagnies();
    }

    Connection Con = null;
    PreparedStatement Pst = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectCompagnies(){
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from COMPAGNIES");
            COMPTABLE.setModel(DbUtils.resultSetToTableModel(Rs));
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MEDICAMENTS = new javax.swing.JLabel();
        VENTES = new javax.swing.JLabel();
        AGENTS = new javax.swing.JLabel();
        COMPAGNIES = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FERMER = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        COMPID = new javax.swing.JTextField();
        COMPNAME = new javax.swing.JTextField();
        COMPADRESSE = new javax.swing.JTextField();
        COMPEXPERIENCE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        COMPTABLE = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        COMPPHONE = new javax.swing.JTextField();
        COMPAJOUT = new javax.swing.JButton();
        COMPUPDATE = new javax.swing.JButton();
        COMPSUPPRIMER = new javax.swing.JButton();
        COMPEFFACER = new javax.swing.JButton();
        DECONNECTER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1767, 943));

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LeoPharma");

        MEDICAMENTS.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        MEDICAMENTS.setText("MEDICAMENTS");
        MEDICAMENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDICAMENTSMouseClicked(evt);
            }
        });

        VENTES.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        VENTES.setText("VENTES");
        VENTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VENTESMouseClicked(evt);
            }
        });

        AGENTS.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AGENTS.setText("AGENTS");
        AGENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTSMouseClicked(evt);
            }
        });

        COMPAGNIES.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        COMPAGNIES.setForeground(new java.awt.Color(204, 255, 255));
        COMPAGNIES.setText("COMPAGNIES");
        COMPAGNIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPAGNIESMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leopharma/logo.png"))); // NOI18N

        FERMER.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FERMER.setForeground(new java.awt.Color(255, 255, 255));
        FERMER.setText("X");
        FERMER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FERMERMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("GESTION DES COMPAGNIES");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nom Compagnie");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Adresse");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Experience");

        COMPID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        COMPNAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        COMPADRESSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        COMPEXPERIENCE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Numero de Telephone");

        COMPTABLE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        COMPTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom Cpmpagnie", "Adresse", "Numero de Telephone", "Experience"
            }
        ));
        COMPTABLE.setRowHeight(20);
        COMPTABLE.setSelectionBackground(new java.awt.Color(51, 204, 0));
        COMPTABLE.setSelectionForeground(new java.awt.Color(204, 255, 255));
        COMPTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(COMPTABLE);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("LISTE DES COMPAGNIES");

        COMPPHONE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        COMPAJOUT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        COMPAJOUT.setForeground(new java.awt.Color(51, 204, 0));
        COMPAJOUT.setText("AJOUTER");
        COMPAJOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPAJOUTMouseClicked(evt);
            }
        });
        COMPAJOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPAJOUTActionPerformed(evt);
            }
        });

        COMPUPDATE.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        COMPUPDATE.setForeground(new java.awt.Color(51, 204, 0));
        COMPUPDATE.setText("METTRE A JOUR");
        COMPUPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPUPDATEMouseClicked(evt);
            }
        });
        COMPUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPUPDATEActionPerformed(evt);
            }
        });

        COMPSUPPRIMER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        COMPSUPPRIMER.setForeground(new java.awt.Color(51, 204, 0));
        COMPSUPPRIMER.setText("SUPPRIMER");
        COMPSUPPRIMER.setToolTipText("");
        COMPSUPPRIMER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPSUPPRIMERMouseClicked(evt);
            }
        });
        COMPSUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPSUPPRIMERActionPerformed(evt);
            }
        });

        COMPEFFACER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        COMPEFFACER.setForeground(new java.awt.Color(51, 204, 0));
        COMPEFFACER.setText("EFFACER");
        COMPEFFACER.setToolTipText("");
        COMPEFFACER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPEFFACERMouseClicked(evt);
            }
        });
        COMPEFFACER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPEFFACERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(COMPID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(COMPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(COMPADRESSE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(226, 226, 226)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(COMPEXPERIENCE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(COMPPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(COMPAJOUT)
                                .addGap(51, 51, 51)
                                .addComponent(COMPUPDATE)
                                .addGap(51, 51, 51)
                                .addComponent(COMPSUPPRIMER)
                                .addGap(62, 62, 62)
                                .addComponent(COMPEFFACER)))))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7))
                .addGap(562, 562, 562))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(COMPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(COMPPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(COMPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(COMPEXPERIENCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(COMPADRESSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMPEFFACER)
                    .addComponent(COMPSUPPRIMER)
                    .addComponent(COMPUPDATE)
                    .addComponent(COMPAJOUT))
                .addGap(76, 76, 76)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DECONNECTER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DECONNECTER.setText("Deconnecter");
        DECONNECTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DECONNECTERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(COMPAGNIES)
                            .addComponent(VENTES)
                            .addComponent(AGENTS)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MEDICAMENTS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DECONNECTER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(601, 601, 601)
                .addComponent(FERMER, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(FERMER))
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DECONNECTER)
                .addGap(139, 139, 139)
                .addComponent(MEDICAMENTS)
                .addGap(42, 42, 42)
                .addComponent(VENTES)
                .addGap(40, 40, 40)
                .addComponent(AGENTS)
                .addGap(40, 40, 40)
                .addComponent(COMPAGNIES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void COMPAJOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPAJOUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMPAJOUTActionPerformed

    private void COMPUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPUPDATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMPUPDATEActionPerformed

    private void COMPSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPSUPPRIMERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMPSUPPRIMERActionPerformed

    private void COMPEFFACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPEFFACERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMPEFFACERActionPerformed

    private void COMPAJOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPAJOUTMouseClicked
        if (COMPID.getText().isEmpty() || COMPNAME.getText().isEmpty() || COMPADRESSE.getText().isEmpty() || COMPPHONE.getText().isEmpty() ||
           COMPEXPERIENCE.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations de la compagnie");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                Pst = Con.prepareStatement("insert into COMPAGNIES values(?,?,?,?,?)");
                Pst.setInt(1, Integer.valueOf(COMPID.getText()));
                Pst.setString(2, COMPNAME.getText());
                Pst.setString(3, COMPADRESSE.getText());
                Pst.setInt(4, Integer.valueOf(COMPPHONE.getText()));
                Pst.setInt(5, Integer.valueOf(COMPEXPERIENCE.getText()));
                Pst.executeUpdate();
                SelectCompagnies();
                JOptionPane.showMessageDialog(this, "Compagnie ajouté avec succès");
                COMPID.setText("");
                COMPNAME.setText((""));
                COMPADRESSE.setText("");
                COMPPHONE.setText("");
                COMPEXPERIENCE.setText("");
                Con.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_COMPAJOUTMouseClicked

    private void COMPUPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPUPDATEMouseClicked
        if (COMPID.getText().isEmpty() || COMPNAME.getText().isEmpty() || COMPADRESSE.getText().isEmpty() || COMPPHONE.getText().isEmpty() ||
           COMPEXPERIENCE.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations de la compagnie");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String UpdateQuery = "Update COMPAGNIES set "
                        + "COMPNAME='"+COMPNAME.getText()+"',"
                        + "COMPADRESSE='"+COMPADRESSE.getText()+"',"
                        + "COMPPHONE="+Integer.valueOf(COMPPHONE.getText())+","
                        + "COMPEXPERIENCE="+Integer.valueOf(COMPEXPERIENCE.getText())+" "
                        + "where COMPID="+Integer.valueOf(COMPID.getText());
                
                St = Con.createStatement();
                St.executeUpdate(UpdateQuery);
                SelectCompagnies();
                JOptionPane.showMessageDialog(this, "Compagnie Modifié avec succès");
                COMPID.setText("");
                COMPNAME.setText((""));
                COMPADRESSE.setText("");
                COMPPHONE.setText("");
                COMPEXPERIENCE.setText("");
                Con.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_COMPUPDATEMouseClicked

    private void COMPSUPPRIMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPSUPPRIMERMouseClicked
        if (COMPID.getText().isEmpty() || COMPNAME.getText().isEmpty() || COMPADRESSE.getText().isEmpty() || COMPPHONE.getText().isEmpty() ||
           COMPEXPERIENCE.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations de la compagnie");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String Id = COMPID.getText();
                String Query = "Delete from COMPAGNIES where COMPID="+Id;
                St = Con.createStatement();
                St.executeUpdate(Query);
                SelectCompagnies();
                JOptionPane.showMessageDialog(this, "Compagnie supprimé avec succès");
                COMPID.setText("");
                COMPNAME.setText((""));
                COMPADRESSE.setText("");
                COMPPHONE.setText("");
                COMPEXPERIENCE.setText("");
                Con.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_COMPSUPPRIMERMouseClicked

    private void COMPEFFACERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPEFFACERMouseClicked
        COMPID.setText("");
        COMPNAME.setText((""));
        COMPADRESSE.setText("");
        COMPPHONE.setText("");
        COMPEXPERIENCE.setText("");
    }//GEN-LAST:event_COMPEFFACERMouseClicked

    private void COMPTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPTABLEMouseClicked
        DefaultTableModel model= (DefaultTableModel)COMPTABLE.getModel();
        int index = COMPTABLE.getSelectedRow();
        COMPID.setText(model.getValueAt(index, 0).toString());
        COMPNAME.setText(model.getValueAt(index, 1).toString());
        COMPADRESSE.setText(model.getValueAt(index, 2).toString());
        COMPPHONE.setText(model.getValueAt(index, 3).toString());
        COMPEXPERIENCE.setText(model.getValueAt(index, 4).toString());
    }//GEN-LAST:event_COMPTABLEMouseClicked

    private void MEDICAMENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDICAMENTSMouseClicked
        new Medicaments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MEDICAMENTSMouseClicked

    private void VENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VENTESMouseClicked
        new Ventes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VENTESMouseClicked

    private void AGENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTSMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AGENTSMouseClicked

    private void COMPAGNIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPAGNIESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_COMPAGNIESMouseClicked

    private void FERMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FERMERMouseClicked
        System.exit(0);
    }//GEN-LAST:event_FERMERMouseClicked

    private void DECONNECTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DECONNECTERMouseClicked
        new Connexion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DECONNECTERMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGENTS;
    private javax.swing.JTextField COMPADRESSE;
    private javax.swing.JLabel COMPAGNIES;
    private javax.swing.JButton COMPAJOUT;
    private javax.swing.JButton COMPEFFACER;
    private javax.swing.JTextField COMPEXPERIENCE;
    private javax.swing.JTextField COMPID;
    private javax.swing.JTextField COMPNAME;
    private javax.swing.JTextField COMPPHONE;
    private javax.swing.JButton COMPSUPPRIMER;
    private javax.swing.JTable COMPTABLE;
    private javax.swing.JButton COMPUPDATE;
    private javax.swing.JLabel DECONNECTER;
    private javax.swing.JLabel FERMER;
    private javax.swing.JLabel MEDICAMENTS;
    private javax.swing.JLabel VENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
