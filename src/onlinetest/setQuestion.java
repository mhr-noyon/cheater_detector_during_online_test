/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinetest;

/**
 *
 * @author md
 */
public class setQuestion extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public setQuestion() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBusName = new javax.swing.JTextField();
        questionNo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCost1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtCost2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCost3 = new javax.swing.JTextField();
        btnAddBus = new javax.swing.JButton();
        btnAddStation = new javax.swing.JButton();
        txtCost4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Set Question");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("LOG OUT");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        txtBusName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusNameActionPerformed(evt);
            }
        });

        questionNo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        questionNo.setText("Question:");

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel11.setText("A:");

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel8.setText("B:");

        txtCost1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCost1ActionPerformed(evt);
            }
        });
        txtCost1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCost1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel7.setText("Answer:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jComboBox1.setBorder(new javax.swing.border.MatteBorder(null));

        txtCost2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCost2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCost2ActionPerformed(evt);
            }
        });
        txtCost2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCost2KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel9.setText("C:");

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel10.setText("D:");

        txtCost3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCost3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCost3ActionPerformed(evt);
            }
        });
        txtCost3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCost3KeyTyped(evt);
            }
        });

        btnAddBus.setBackground(new java.awt.Color(0, 0, 255));
        btnAddBus.setFont(new java.awt.Font("Siyam Rupali", 1, 18)); // NOI18N
        btnAddBus.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBus.setText("CONFIRM");
        btnAddBus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 153), new java.awt.Color(255, 153, 153)));
        btnAddBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBus.setFocusPainted(false);
        btnAddBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBusActionPerformed(evt);
            }
        });

        btnAddStation.setBackground(new java.awt.Color(0, 255, 255));
        btnAddStation.setFont(new java.awt.Font("Siyam Rupali", 1, 18)); // NOI18N
        btnAddStation.setText("ADD NEW Question");
        btnAddStation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        btnAddStation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddStation.setFocusPainted(false);
        btnAddStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStationActionPerformed(evt);
            }
        });

        txtCost4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCost4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCost4ActionPerformed(evt);
            }
        });
        txtCost4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCost4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtCost4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 31, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(questionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txtBusName, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txtCost1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(40, 40, 40)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txtCost2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(txtCost3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnAddBus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnAddStation, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 31, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(txtCost4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(questionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtBusName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCost1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCost2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCost3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddBus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddStation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //        int res = JOptionPane.showConfirmDialog(this, "Are you sure?", "CONFIRM", JOptionPane.YES_NO_OPTION);
        //        if(res==0){
            //            adminLogin adminloginFrame=new adminLogin();
            //            adminloginFrame.setVisible(true);
            //            adminloginFrame.pack();
            //            adminloginFrame.setLocationRelativeTo(null);
            //            this.dispose();
            //        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtBusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusNameActionPerformed

    private void txtCost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCost1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost1ActionPerformed

    private void txtCost1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCost1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost1KeyTyped

    private void txtCost2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCost2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost2ActionPerformed

    private void txtCost2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCost2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost2KeyTyped

    private void txtCost3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCost3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost3ActionPerformed

    private void txtCost3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCost3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost3KeyTyped

    private void btnAddBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBusActionPerformed
        //        if(clickUpdate!=1){
            //            int res = JOptionPane.showConfirmDialog(this, "Are you sure to add bus record?", "CONFIRM", JOptionPane.YES_NO_OPTION);
            //            if(res==0){
                //                try {
                    //                    JDBC.insertTable(txtBusName.getText(), String.valueOf(clickUpdate),txtStations.getText(), txtDistance.getText());
                    //                    JOptionPane.showMessageDialog(this,"New Bus record has been added to Database");
                    //                    adminHome adminHomeFrame = new adminHome();
                    //                    adminHomeFrame.setVisible(true);
                    //                    adminHomeFrame.pack();
                    //                    adminHomeFrame.setLocationRelativeTo(null);
                    //                    dispose();
                    //                } catch (Exception e) {
                    //                    System.out.println(""+e.getMessage());
                    //                }
                //            }
            //
            //        }
        //        else{
            //            JOptionPane.showMessageDialog(this,"Very less stoppage for this bus!");
            //        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBusActionPerformed

    private void btnAddStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStationActionPerformed
        // TODO add your handling code here:
        //        if(!txtStations.getText().equals("") && !txtDistance.getText().equals("")
            //            && !txtBusName.getText().equals("") && !txtCost.getText().equals("")){
            //            if(clickUpdate==1){
                //                //create table;
                //                JDBC.createTable(txtBusName.getText());
                //                buses.Buses.put(Float.valueOf(txtCost.getText()),txtBusName.getText());
                //                JDBC.insertBusName( txtBusName.getText(),txtCost.getText());
                //                txtBusName.setEditable(false);
                //                txtBusName.setFocusable(false);
                //                txtCost.setEditable(false);
                //                txtCost.setFocusable(false);
                //            }
            //            //String queryToInsert = "insert into "+txtBusName.getText()+" values ("+clickUpdate+",'"+txtStations.getText()+"',"+txtDistance.getText()+")";
            //            try{
                //                //                st.execute(queryToInsert);
                //                JDBC.insertStoppage(txtStations.getText());
                //                JDBC.insertTable(txtBusName.getText(), String.valueOf(clickUpdate),txtStations.getText(), txtDistance.getText());
                //                clickUpdate++;
                //                path += "->"+txtStations.getText();
                //                txtStations.setText("");
                //                txtDistance.setText("");
                //                txtPath.setText(path);
                //            }catch(Exception e){
                //                System.out.println("Error while inserting data into database."+e.getMessage());
                //            }
            //        }
        //        else{
            //            JOptionPane.showMessageDialog(this,"Please fill all of the textfield!");
            //        }
    }//GEN-LAST:event_btnAddStationActionPerformed

    private void txtCost4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCost4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost4ActionPerformed

    private void txtCost4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCost4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCost4KeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(setQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBus;
    private javax.swing.JButton btnAddStation;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel questionNo;
    public javax.swing.JTextField txtBusName;
    public javax.swing.JTextField txtCost1;
    public javax.swing.JTextField txtCost2;
    public javax.swing.JTextField txtCost3;
    public javax.swing.JTextField txtCost4;
    // End of variables declaration//GEN-END:variables
}