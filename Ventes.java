package leopharma;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Ventes extends Heritage {

    public Ventes() {
        initComponents();
        SelectMedicaments();
        ShowDate();
        FACTURE.setText("  ******************************LeoPharma******************************\n\n"
                + "\tID\tMEDICAMENTS\tQUANTITE\tPRIX\tTOTAL\n");
    }
    
    private Connection Con = null;
    private PreparedStatement Pst = null;
    private Statement St = null;
    private ResultSet Rs = null;
    private int i = 1;
    private String facture;
    private Double prix, prixTotal=0.0;
    private int id, quantite;
    
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
    
    public void ShowDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyy");
        DATEFACTURE.setText(s.format(d));
    }
    
    public void Update(){
        try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/LeoPharma", "leopharma", "leopharma");
                String UpdateQuery = "Update MEDICAMENTS set "
                        + "MEDQUANTITE="+(quantite - Integer.valueOf(QUANTITE.getText()))
                        + "where MEDID="+id;
                
                St = Con.createStatement();
                St.executeUpdate(UpdateQuery);
                Con.close();
            }
            catch (Exception e) {
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
        jLabel11 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        QUANTITE = new javax.swing.JTextField();
        AJOUT = new javax.swing.JButton();
        EFFACER = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MEDTABLE = new javax.swing.JTable();
        IMPRIMER = new javax.swing.JButton();
        DATEFACTURE = new javax.swing.JLabel();
        VENDEUR = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FACTURE = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
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
        VENTES.setForeground(new java.awt.Color(204, 255, 255));
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FERMERMouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("GESTION DES VENTES");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ID FACTURE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nom Medicament");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Quantité");

        ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID.setEnabled(false);

        NAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NAME.setEnabled(false);

        QUANTITE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        AJOUT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AJOUT.setForeground(new java.awt.Color(51, 204, 0));
        AJOUT.setText("AJOUTER A LA FACTURE");
        AJOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AJOUTMouseClicked(evt);
            }
        });
        AJOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJOUTActionPerformed(evt);
            }
        });

        EFFACER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        EFFACER.setForeground(new java.awt.Color(51, 204, 0));
        EFFACER.setText("EFFACER");
        EFFACER.setToolTipText("");
        EFFACER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EFFACERMouseClicked(evt);
            }
        });
        EFFACER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFFACERActionPerformed(evt);
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

        IMPRIMER.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        IMPRIMER.setForeground(new java.awt.Color(51, 204, 0));
        IMPRIMER.setText("IMPRIMER");
        IMPRIMER.setToolTipText("");
        IMPRIMER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMPRIMERMouseClicked(evt);
            }
        });
        IMPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMERActionPerformed(evt);
            }
        });

        DATEFACTURE.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        DATEFACTURE.setText("Date");

        VENDEUR.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        VENDEUR.setText("Vendeur : ");

        FACTURE.setColumns(20);
        FACTURE.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        FACTURE.setRows(5);
        jScrollPane2.setViewportView(FACTURE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("FACTURE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(346, 346, 346))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IMPRIMER)
                                    .addComponent(EFFACER)
                                    .addComponent(AJOUT))
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QUANTITE, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(jLabel2)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(VENDEUR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(509, 509, 509)
                        .addComponent(DATEFACTURE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DATEFACTURE)
                            .addComponent(VENDEUR)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(QUANTITE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AJOUT)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(EFFACER)
                        .addGap(110, 110, 110)
                        .addComponent(IMPRIMER)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DECONNECTER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(525, 525, 525)
                        .addComponent(FERMER, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FERMER)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
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

    private void MEDICAMENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDICAMENTSMouseClicked
        new Medicaments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MEDICAMENTSMouseClicked

    private void VENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VENTESMouseClicked
        
    }//GEN-LAST:event_VENTESMouseClicked

    private void AGENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTSMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AGENTSMouseClicked

    private void COMPAGNIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPAGNIESMouseClicked
        new Compagnies().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_COMPAGNIESMouseClicked

    private void AJOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AJOUTMouseClicked
        if(NAME.getText().isEmpty() || QUANTITE.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Renseigner toutes les informations du medicament");
        }
        else{
            facture = FACTURE.getText();
            prixTotal += Integer.valueOf(QUANTITE.getText())*prix;
            FACTURE.setText(facture+""
                    + "\t"+i+"\t"+NAME.getText()+"\t"+QUANTITE.getText()+"\t\t"+prix+"\t"+Integer.valueOf(QUANTITE.getText())*prix+"\n");
            facture = FACTURE.getText();
            i++;
            Update();
            SelectMedicaments();
            NAME.setText((""));
            QUANTITE.setText("");
        }
    }//GEN-LAST:event_AJOUTMouseClicked

    private void AJOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJOUTActionPerformed

    }//GEN-LAST:event_AJOUTActionPerformed

    private void EFFACERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EFFACERMouseClicked
        NAME.setText((""));
        QUANTITE.setText("");
        FACTURE.setText("  ******************************LeoPharma******************************\n\n"
                + "\tID\tMEDICAMENTS\tQUANTITE\tPRIX\tTOTAL\n");
    }//GEN-LAST:event_EFFACERMouseClicked

    private void EFFACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFFACERActionPerformed

    }//GEN-LAST:event_EFFACERActionPerformed

    private void MEDTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDTABLEMouseClicked
        DefaultTableModel model= (DefaultTableModel)MEDTABLE.getModel();
        int index = MEDTABLE.getSelectedRow();
        id = Integer.valueOf(model.getValueAt(index, 0).toString());
        NAME.setText(model.getValueAt(index, 1).toString());
        prix = Double.valueOf(model.getValueAt(index, 2).toString());
        quantite = Integer.valueOf(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_MEDTABLEMouseClicked

    private void IMPRIMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMPRIMERMouseClicked
        try {
            FACTURE.setText(facture+""
            + "\nPrix Total : "+prixTotal+"\n");
            FACTURE.print();
        }
        catch (Exception e) {
        
        }
    }//GEN-LAST:event_IMPRIMERMouseClicked

    private void IMPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMERActionPerformed
        
    }//GEN-LAST:event_IMPRIMERActionPerformed

    private void FERMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FERMERMouseClicked
        FERMER.setBackground(Color.red);
        System.exit(0);
    }//GEN-LAST:event_FERMERMouseClicked

    private void FERMERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FERMERMouseEntered
        FERMER.setBackground(Color.red);
    }//GEN-LAST:event_FERMERMouseEntered

    private void DECONNECTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DECONNECTERMouseClicked
        new Connexion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DECONNECTERMouseClicked

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGENTS;
    private javax.swing.JButton AJOUT;
    private javax.swing.JLabel COMPAGNIES;
    private javax.swing.JLabel DATEFACTURE;
    private javax.swing.JLabel DECONNECTER;
    private javax.swing.JButton EFFACER;
    private javax.swing.JTextArea FACTURE;
    private javax.swing.JLabel FERMER;
    private javax.swing.JTextField ID;
    private javax.swing.JButton IMPRIMER;
    private javax.swing.JLabel MEDICAMENTS;
    private javax.swing.JTable MEDTABLE;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField QUANTITE;
    private javax.swing.JLabel VENDEUR;
    private javax.swing.JLabel VENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
