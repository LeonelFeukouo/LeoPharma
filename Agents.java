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

public class Agents extends Heritage {

    public Agents() {
        initComponents();
        SelectAgents();
    }
    
    Connection Con = null;
    PreparedStatement Pst = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectAgents(){
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from AGENTS");
            AGENTTABLE.setModel(DbUtils.resultSetToTableModel(Rs));
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
        AGENTID = new javax.swing.JTextField();
        AGENTNAME = new javax.swing.JTextField();
        AGENTAGE = new javax.swing.JTextField();
        AGENTPWD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AGENTGENRE = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        AGENTTABLE = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        AGENTPHONE = new javax.swing.JTextField();
        AGENTAJOUT = new javax.swing.JButton();
        AGENTUPDATE = new javax.swing.JButton();
        AGENTSUPPRIMER = new javax.swing.JButton();
        AGENTEFFACER = new javax.swing.JButton();
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
        AGENTS.setForeground(new java.awt.Color(204, 255, 255));
        AGENTS.setText("AGENTS");
        AGENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTSMouseClicked(evt);
            }
        });

        COMPAGNIES.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
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

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("GESTION DES AGENTS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nom Agent");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Age");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Mot de Passe");

        AGENTID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        AGENTNAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        AGENTAGE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        AGENTPWD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Numero de Telephone");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Genre");

        AGENTGENRE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AGENTGENRE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMININ", "MASCULIN" }));

        AGENTTABLE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AGENTTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom Agent", "Age", "Numero de Telephone", "Mot de Passe", "Genre"
            }
        ));
        AGENTTABLE.setRowHeight(20);
        AGENTTABLE.setSelectionBackground(new java.awt.Color(51, 204, 0));
        AGENTTABLE.setSelectionForeground(new java.awt.Color(204, 255, 255));
        AGENTTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AGENTTABLE);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("LISTE DES AGENTS");

        AGENTPHONE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        AGENTAJOUT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AGENTAJOUT.setForeground(new java.awt.Color(51, 204, 0));
        AGENTAJOUT.setText("AJOUTER");
        AGENTAJOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTAJOUTMouseClicked(evt);
            }
        });
        AGENTAJOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGENTAJOUTActionPerformed(evt);
            }
        });

        AGENTUPDATE.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AGENTUPDATE.setForeground(new java.awt.Color(51, 204, 0));
        AGENTUPDATE.setText("METTRE A JOUR");
        AGENTUPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTUPDATEMouseClicked(evt);
            }
        });
        AGENTUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGENTUPDATEActionPerformed(evt);
            }
        });

        AGENTSUPPRIMER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AGENTSUPPRIMER.setForeground(new java.awt.Color(51, 204, 0));
        AGENTSUPPRIMER.setText("SUPPRIMER");
        AGENTSUPPRIMER.setToolTipText("");
        AGENTSUPPRIMER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTSUPPRIMERMouseClicked(evt);
            }
        });
        AGENTSUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGENTSUPPRIMERActionPerformed(evt);
            }
        });

        AGENTEFFACER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AGENTEFFACER.setForeground(new java.awt.Color(51, 204, 0));
        AGENTEFFACER.setText("EFFACER");
        AGENTEFFACER.setToolTipText("");
        AGENTEFFACER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTEFFACERMouseClicked(evt);
            }
        });
        AGENTEFFACER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGENTEFFACERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7))
                .addGap(562, 562, 562))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(AGENTID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AGENTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AGENTAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(226, 226, 226)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AGENTPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AGENTGENRE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AGENTPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(AGENTAJOUT)
                        .addGap(51, 51, 51)
                        .addComponent(AGENTUPDATE)
                        .addGap(51, 51, 51)
                        .addComponent(AGENTSUPPRIMER)
                        .addGap(62, 62, 62)
                        .addComponent(AGENTEFFACER)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AGENTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(AGENTPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(AGENTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(AGENTPWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(AGENTAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(AGENTGENRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGENTEFFACER)
                    .addComponent(AGENTSUPPRIMER)
                    .addComponent(AGENTUPDATE)
                    .addComponent(AGENTAJOUT))
                .addGap(62, 62, 62)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
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

    private void AGENTAJOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGENTAJOUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGENTAJOUTActionPerformed

    private void AGENTUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGENTUPDATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGENTUPDATEActionPerformed

    private void AGENTSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGENTSUPPRIMERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGENTSUPPRIMERActionPerformed

    private void AGENTEFFACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGENTEFFACERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGENTEFFACERActionPerformed

    private void AGENTAJOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTAJOUTMouseClicked
        if (AGENTID.getText().isEmpty() || AGENTNAME.getText().isEmpty() || AGENTAGE.getText().isEmpty() || AGENTPHONE.getText().isEmpty() ||
            AGENTPWD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations de l'agent");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                Pst = Con.prepareStatement("insert into AGENTS values(?,?,?,?,?,?)");
                Pst.setInt(1, Integer.valueOf(AGENTID.getText()));
                Pst.setString(2, AGENTNAME.getText());
                Pst.setInt(3, Integer.valueOf(AGENTAGE.getText()));
                Pst.setInt(4, Integer.valueOf(AGENTPHONE.getText()));
                Pst.setString(5, AGENTPWD.getText());
                Pst.setString(6, String.valueOf(AGENTGENRE.getSelectedItem()));
                Pst.executeUpdate();
                SelectAgents();
                JOptionPane.showMessageDialog(this, "Agent ajouté avec succès");
                AGENTID.setText("");
                AGENTNAME.setText((""));
                AGENTAGE.setText("");
                AGENTPHONE.setText("");
                AGENTPWD.setText("");
                AGENTGENRE.setSelectedIndex(0);
                Con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AGENTAJOUTMouseClicked

    private void AGENTUPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTUPDATEMouseClicked
        if(AGENTID.getText().isEmpty() || AGENTNAME.getText().isEmpty() || AGENTAGE.getText().isEmpty() || AGENTPHONE.getText().isEmpty() ||
            AGENTPWD.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations de l'agent");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String UpdateQuery = "Update AGENTS set "
                + "AGENTNAME='"+AGENTNAME.getText()+"',"
                + "AGENTAGE="+Integer.valueOf(AGENTAGE.getText())+","
                + "AGENTPHONE="+Integer.valueOf(AGENTPHONE.getText())+","
                + "AGENTPWD='"+AGENTPWD.getText()+"',"
                + "AGENTGENRE='"+String.valueOf(AGENTGENRE.getSelectedItem())+"'"
                + "where AGENTID="+Integer.valueOf(AGENTID.getText());

                St = Con.createStatement();
                St.executeUpdate(UpdateQuery);
                SelectAgents();
                JOptionPane.showMessageDialog(this, "Agent Modifié avec succès");
                AGENTID.setText("");
                AGENTNAME.setText((""));
                AGENTAGE.setText("");
                AGENTPHONE.setText("");
                AGENTPWD.setText("");
                AGENTGENRE.setSelectedIndex(0);
                Con.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AGENTUPDATEMouseClicked

    private void AGENTSUPPRIMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTSUPPRIMERMouseClicked
        if(AGENTID.getText().isEmpty() || AGENTNAME.getText().isEmpty() || AGENTAGE.getText().isEmpty() || AGENTPHONE.getText().isEmpty() ||
            AGENTPWD.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations de l'agent");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String Id = AGENTID.getText();
                String Query = "Delete from AGENTS where AGENTID="+Id;
                St = Con.createStatement();
                St.executeUpdate(Query);
                SelectAgents();
                JOptionPane.showMessageDialog(this, "Agent supprimé avec succès");
                AGENTID.setText("");
                AGENTNAME.setText((""));
                AGENTAGE.setText("");
                AGENTPHONE.setText("");
                AGENTPWD.setText("");
                AGENTGENRE.setSelectedIndex(0);
                Con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AGENTSUPPRIMERMouseClicked

    private void AGENTEFFACERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTEFFACERMouseClicked
        AGENTID.setText("");
        AGENTNAME.setText((""));
        AGENTAGE.setText("");
        AGENTPHONE.setText("");
        AGENTPWD.setText("");
        AGENTGENRE.setSelectedIndex(0);
    }//GEN-LAST:event_AGENTEFFACERMouseClicked

    private void AGENTTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTTABLEMouseClicked
        DefaultTableModel model= (DefaultTableModel)AGENTTABLE.getModel();
        int index = AGENTTABLE.getSelectedRow();
        AGENTID.setText(model.getValueAt(index, 0).toString());
        AGENTNAME.setText(model.getValueAt(index, 1).toString());
        AGENTAGE.setText(model.getValueAt(index, 2).toString());
        AGENTPHONE.setText(model.getValueAt(index, 3).toString());
        AGENTPWD.setText(model.getValueAt(index, 4).toString());
        AGENTGENRE.setSelectedItem(model.getValueAt(index, 5));
    }//GEN-LAST:event_AGENTTABLEMouseClicked

    private void MEDICAMENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDICAMENTSMouseClicked
        new Medicaments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MEDICAMENTSMouseClicked

    private void VENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VENTESMouseClicked
        new Ventes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VENTESMouseClicked

    private void AGENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTSMouseClicked

    }//GEN-LAST:event_AGENTSMouseClicked

    private void COMPAGNIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPAGNIESMouseClicked
        new Compagnies().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_COMPAGNIESMouseClicked

    private void DECONNECTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DECONNECTERMouseClicked
        new Connexion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DECONNECTERMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGENTAGE;
    private javax.swing.JButton AGENTAJOUT;
    private javax.swing.JButton AGENTEFFACER;
    private javax.swing.JComboBox AGENTGENRE;
    private javax.swing.JTextField AGENTID;
    private javax.swing.JTextField AGENTNAME;
    private javax.swing.JTextField AGENTPHONE;
    private javax.swing.JTextField AGENTPWD;
    private javax.swing.JLabel AGENTS;
    private javax.swing.JButton AGENTSUPPRIMER;
    private javax.swing.JTable AGENTTABLE;
    private javax.swing.JButton AGENTUPDATE;
    private javax.swing.JLabel COMPAGNIES;
    private javax.swing.JLabel DECONNECTER;
    private javax.swing.JLabel FERMER;
    private javax.swing.JLabel MEDICAMENTS;
    private javax.swing.JLabel VENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
