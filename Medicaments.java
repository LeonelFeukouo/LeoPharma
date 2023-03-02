package leopharma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public final class Medicaments extends Heritage {

    public Medicaments() {
        initComponents();
        SelectMedicaments();
        getCompanies();
    }

    Connection Con = null;
    PreparedStatement Pst = null;
    Statement St = null;
    ResultSet Rs = null;
    java.util.Date FabDate, ExpDate;
    java.sql.Date MyFabDate, MyExpDate;
    
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
        MEDID = new javax.swing.JTextField();
        MEDNAME = new javax.swing.JTextField();
        MEDPRIX = new javax.swing.JTextField();
        MEDQUANTITE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MEDCOMPAGNIE = new javax.swing.JComboBox();
        MEDFABRICATION = new com.toedter.calendar.JDateChooser();
        MEDEXPIRATION = new com.toedter.calendar.JDateChooser();
        MEDAJOUT = new javax.swing.JButton();
        MEDUPDATE = new javax.swing.JButton();
        MEDSUPPRIMER = new javax.swing.JButton();
        MEDEFFACER = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MEDTABLE = new javax.swing.JTable();
        DECONNECTER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LeoPharma");

        MEDICAMENTS.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        MEDICAMENTS.setForeground(new java.awt.Color(204, 255, 255));
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
        jLabel7.setText("GESTION DES MEDICAMENTS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nom Medicament");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Prix");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Quantité");

        MEDID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        MEDNAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        MEDPRIX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        MEDQUANTITE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Date de Fabrication");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Compagnie de Fabication");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Date de D'expiration");

        MEDCOMPAGNIE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MEDCOMPAGNIE.setToolTipText("");

        MEDAJOUT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        MEDAJOUT.setForeground(new java.awt.Color(51, 204, 0));
        MEDAJOUT.setText("AJOUTER");
        MEDAJOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDAJOUTMouseClicked(evt);
            }
        });
        MEDAJOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDAJOUTActionPerformed(evt);
            }
        });

        MEDUPDATE.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        MEDUPDATE.setForeground(new java.awt.Color(51, 204, 0));
        MEDUPDATE.setText("METTRE A JOUR");
        MEDUPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDUPDATEMouseClicked(evt);
            }
        });
        MEDUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDUPDATEActionPerformed(evt);
            }
        });

        MEDSUPPRIMER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        MEDSUPPRIMER.setForeground(new java.awt.Color(51, 204, 0));
        MEDSUPPRIMER.setText("SUPPRIMER");
        MEDSUPPRIMER.setToolTipText("");
        MEDSUPPRIMER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDSUPPRIMERMouseClicked(evt);
            }
        });
        MEDSUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDSUPPRIMERActionPerformed(evt);
            }
        });

        MEDEFFACER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        MEDEFFACER.setForeground(new java.awt.Color(51, 204, 0));
        MEDEFFACER.setText("EFFACER");
        MEDEFFACER.setToolTipText("");
        MEDEFFACER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDEFFACERMouseClicked(evt);
            }
        });
        MEDEFFACER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDEFFACERActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("LISTE DES MEDICAMENTS");

        MEDTABLE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MEDTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom Medicament", "Prix", "Quantité", "Date Fab", "Date Exp", "Compagnie"
            }
        ));
        MEDTABLE.setRowHeight(20);
        MEDTABLE.setSelectionBackground(new java.awt.Color(51, 204, 0));
        MEDTABLE.setSelectionForeground(new java.awt.Color(204, 255, 255));
        MEDTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MEDTABLE);

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
                .addGap(175, 175, 175)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MEDID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEDNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEDPRIX, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEDQUANTITE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(226, 226, 226)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MEDCOMPAGNIE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MEDFABRICATION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MEDEXPIRATION, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(MEDAJOUT)
                .addGap(51, 51, 51)
                .addComponent(MEDUPDATE)
                .addGap(51, 51, 51)
                .addComponent(MEDSUPPRIMER)
                .addGap(62, 62, 62)
                .addComponent(MEDEFFACER)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(MEDID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(MEDFABRICATION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(MEDNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(MEDPRIX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MEDEXPIRATION, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(MEDCOMPAGNIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(MEDQUANTITE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEDEFFACER)
                    .addComponent(MEDSUPPRIMER)
                    .addComponent(MEDUPDATE)
                    .addComponent(MEDAJOUT))
                .addGap(41, 41, 41)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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

    public void SelectMedicaments(){
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from MEDICAMENTS");
            MEDTABLE.setModel(DbUtils.resultSetToTableModel(Rs));
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void getCompanies(){
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from COMPAGNIES");
            while(Rs.next()){
                String MyComp = Rs.getString("COMPNAME");
                MEDCOMPAGNIE.addItem(MyComp);
            }
        } 
        catch (Exception e) {
        
        }
    }
    
    private void MEDAJOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDAJOUTActionPerformed
        
    }//GEN-LAST:event_MEDAJOUTActionPerformed

    private void MEDUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDUPDATEActionPerformed
        
    }//GEN-LAST:event_MEDUPDATEActionPerformed

    private void MEDSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDSUPPRIMERActionPerformed
        
    }//GEN-LAST:event_MEDSUPPRIMERActionPerformed

    private void MEDEFFACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDEFFACERActionPerformed
        
    }//GEN-LAST:event_MEDEFFACERActionPerformed

    private void MEDAJOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDAJOUTMouseClicked
        if (MEDID.getText().isEmpty() || MEDNAME.getText().isEmpty() || MEDPRIX.getText().isEmpty() || MEDQUANTITE.getText().isEmpty() ||
           MEDFABRICATION.getDate()==null || MEDEXPIRATION.getDate()==null) {
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations du medicaments");
        }
        else{
            FabDate = MEDFABRICATION.getDate();
            MyFabDate = new java.sql.Date(FabDate.getTime());

            ExpDate = MEDEXPIRATION.getDate();
            MyExpDate = new java.sql.Date(ExpDate.getTime());
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                Pst = Con.prepareStatement("insert into MEDICAMENTS values(?,?,?,?,?,?,?)");
                Pst.setInt(1, Integer.valueOf(MEDID.getText()));
                Pst.setString(2, MEDNAME.getText());
                Pst.setDouble(3, Double.valueOf(MEDPRIX.getText()));
                Pst.setInt(4, Integer.valueOf(MEDQUANTITE.getText()));
                Pst.setDate(5, MyFabDate);
                Pst.setDate(6, MyExpDate);
                Pst.setString(7, String.valueOf(MEDCOMPAGNIE.getSelectedItem()));
                Pst.executeUpdate();
                SelectMedicaments();
                JOptionPane.showMessageDialog(this, "Medicament ajouté avec succès");
                MEDID.setText("");
                MEDNAME.setText((""));
                MEDPRIX.setText("");
                MEDQUANTITE.setText("");
                MEDFABRICATION.setDate(null);
                MEDEXPIRATION.setDate(null);
                MEDCOMPAGNIE.setSelectedIndex(0); 
                Con.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_MEDAJOUTMouseClicked

    private void MEDSUPPRIMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDSUPPRIMERMouseClicked
        if (MEDID.getText().isEmpty() || MEDNAME.getText().isEmpty() || MEDPRIX.getText().isEmpty() || MEDQUANTITE.getText().isEmpty() ||
           MEDFABRICATION.getDate()==null || MEDEXPIRATION.getDate()==null) {
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations du medicaments");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String Id = MEDID.getText();
                String Query = "Delete from MEDICAMENTS where MEDID="+Id;
                St = Con.createStatement();
                St.executeUpdate(Query);
                SelectMedicaments();
                JOptionPane.showMessageDialog(this, "Medicament supprimé avec succès");
                MEDID.setText("");
                MEDNAME.setText((""));
                MEDPRIX.setText("");
                MEDQUANTITE.setText("");
                MEDFABRICATION.setDate(null);
                MEDEXPIRATION.setDate(null);
                MEDCOMPAGNIE.setSelectedIndex(0);
                Con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_MEDSUPPRIMERMouseClicked

    private void MEDTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDTABLEMouseClicked
        DefaultTableModel model= (DefaultTableModel)MEDTABLE.getModel();
        int index = MEDTABLE.getSelectedRow();
        MEDID.setText(model.getValueAt(index, 0).toString());
        MEDNAME.setText(model.getValueAt(index, 1).toString());
        MEDPRIX.setText(model.getValueAt(index, 2).toString());
        MEDQUANTITE.setText(model.getValueAt(index, 3).toString());
        MEDFABRICATION.setDate((Date) model.getValueAt(index, 4));
        MEDEXPIRATION.setDate((Date) model.getValueAt(index, 5));
        MEDCOMPAGNIE.setSelectedItem(model.getValueAt(index, 6));
    }//GEN-LAST:event_MEDTABLEMouseClicked

    private void MEDUPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDUPDATEMouseClicked
        if(MEDID.getText().isEmpty() || MEDNAME.getText().isEmpty() || MEDPRIX.getText().isEmpty() || MEDQUANTITE.getText().isEmpty() ||
           MEDFABRICATION.getDate()==null || MEDEXPIRATION.getDate()==null){
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations du medicaments");
        }
        else{
            FabDate = MEDFABRICATION.getDate();
            MyFabDate = new java.sql.Date(FabDate.getTime());

            ExpDate = MEDEXPIRATION.getDate();
            MyExpDate = new java.sql.Date(ExpDate.getTime());
            
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String UpdateQuery = "Update MEDICAMENTS set "
                        + "MEDNAME='"+MEDNAME.getText()+"',"
                        + "MEDPRIX="+Double.valueOf(MEDPRIX.getText())+","
                        + "MEDQUANTITE="+Integer.valueOf(MEDQUANTITE.getText())+","
                        + "MEDFABRICATION='"+MyFabDate+"',"
                        + "MEDEXPIRATION='"+MyExpDate+"',"
                        + "MEDCOMPAGNIE='"+String.valueOf(MEDCOMPAGNIE.getSelectedItem())+"'"
                        + "where MEDID="+Integer.valueOf(MEDID.getText());
                
                St = Con.createStatement();
                St.executeUpdate(UpdateQuery);
                SelectMedicaments();
                JOptionPane.showMessageDialog(this, "Medicament Modifié avec succès");
                MEDID.setText("");
                MEDNAME.setText((""));
                MEDPRIX.setText("");
                MEDQUANTITE.setText("");
                MEDFABRICATION.setDate(null);
                MEDEXPIRATION.setDate(null);
                MEDCOMPAGNIE.setSelectedIndex(0); 
                Con.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_MEDUPDATEMouseClicked

    private void MEDEFFACERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDEFFACERMouseClicked
        MEDID.setText("");
        MEDNAME.setText((""));
        MEDPRIX.setText("");
        MEDQUANTITE.setText("");
        MEDFABRICATION.setDate(null);
        MEDEXPIRATION.setDate(null);
        MEDCOMPAGNIE.setSelectedIndex(0); 
    }//GEN-LAST:event_MEDEFFACERMouseClicked

    private void MEDICAMENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDICAMENTSMouseClicked
        
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
        new Compagnies().setVisible(true);
        this.dispose();
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
    private javax.swing.JLabel COMPAGNIES;
    private javax.swing.JLabel DECONNECTER;
    private javax.swing.JLabel FERMER;
    private javax.swing.JButton MEDAJOUT;
    private javax.swing.JComboBox MEDCOMPAGNIE;
    private javax.swing.JButton MEDEFFACER;
    private com.toedter.calendar.JDateChooser MEDEXPIRATION;
    private com.toedter.calendar.JDateChooser MEDFABRICATION;
    private javax.swing.JLabel MEDICAMENTS;
    private javax.swing.JTextField MEDID;
    private javax.swing.JTextField MEDNAME;
    private javax.swing.JTextField MEDPRIX;
    private javax.swing.JTextField MEDQUANTITE;
    private javax.swing.JButton MEDSUPPRIMER;
    private javax.swing.JTable MEDTABLE;
    private javax.swing.JButton MEDUPDATE;
    private javax.swing.JLabel VENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
