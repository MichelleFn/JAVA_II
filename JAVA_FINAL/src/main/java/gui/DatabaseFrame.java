/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basics.*;
import db.Database;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author it21771-it21794
 */
public class DatabaseFrame extends javax.swing.JFrame {

    /**
     * Creates new form SecondJFrame
     */
    DefaultListModel dlm;
    //lists used to store objects from dlm,defined outside method so as to be seen by all methods.
    //One for object Artist and the other for Release.
    
    List<Object> data = new ArrayList<Object>();
    List<Object> data2 = new ArrayList<Object>();
    public DatabaseFrame() {

        dlm = new DefaultListModel();
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.DbDialog.getContentPane().setBackground(Color.DARK_GRAY);
        DbDialog.setSize(new Dimension(370, 170));
        DbDialog.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DbDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        DbDialogButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCountry = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MyList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        ClearButton2 = new javax.swing.JButton();
        GoBackButton2 = new javax.swing.JButton();

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("You have to pick an option from the list");

        DbDialogButton.setBackground(new java.awt.Color(249, 145, 145));
        DbDialogButton.setText("OK");
        DbDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DbDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DbDialogLayout = new javax.swing.GroupLayout(DbDialog.getContentPane());
        DbDialog.getContentPane().setLayout(DbDialogLayout);
        DbDialogLayout.setHorizontalGroup(
            DbDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DbDialogLayout.createSequentialGroup()
                .addGroup(DbDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DbDialogLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(DbDialogButton))
                    .addGroup(DbDialogLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        DbDialogLayout.setVerticalGroup(
            DbDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DbDialogLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(DbDialogButton)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N

        JList.setBackground(new java.awt.Color(167, 162, 162));
        JList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Artist", "Group", "Album" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JList);

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 238, 238));
        jLabel1.setText("Please choose one of the following");

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Enter the name:");

        jTextName.setBackground(new java.awt.Color(167, 162, 162));
        jTextName.setText("ex.Fred,John,Nirvana");
        jTextName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNameMouseClicked(evt);
            }
        });
        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Enter the country:");

        jTextCountry.setBackground(new java.awt.Color(167, 162, 162));
        jTextCountry.setText("ex. US,GB,FR etc");
        jTextCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextCountryMouseClicked(evt);
            }
        });

        MyList.setBackground(new java.awt.Color(167, 162, 162));
        MyList.setModel(dlm);
        jScrollPane2.setViewportView(MyList);

        jButton1.setBackground(new java.awt.Color(249, 145, 145));
        jButton1.setText("Search Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ShowButton.setBackground(new java.awt.Color(249, 145, 145));
        ShowButton.setText("Show Selected");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        TextArea.setEditable(false);
        TextArea.setBackground(new java.awt.Color(167, 162, 162));
        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane3.setViewportView(TextArea);

        ClearButton2.setBackground(new java.awt.Color(249, 145, 145));
        ClearButton2.setText("Clear");
        ClearButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton2ActionPerformed(evt);
            }
        });

        GoBackButton2.setBackground(new java.awt.Color(249, 145, 145));
        GoBackButton2.setText("Go Back");
        GoBackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowButton)
                    .addComponent(ClearButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157)
                .addComponent(jScrollPane3)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoBackButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GoBackButton2)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearButton2)
                        .addGap(3, 3, 3))
                    .addComponent(jScrollPane3))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextName.getText();
        String country = jTextCountry.getText();
        Object ob = JList.getSelectedValue();
        try{
        if (ob.equals("Artist")) {
            dlm.clear();
            data.clear();
            data2.clear();
            try {
                
                String query;
                if(country.equals("")){//if you don't type anything into the country field it searches only by name
                   query = "select * from java_ii_artists where name like '%" + name + "%' "; 
                }else if(name.equals("")) {//the same thing only it searches by country
                 query = "select * from java_ii_artists where country like '%" + country + "%' "; 
                }else{//it searches using both fields
                 query = "select * from java_ii_artists where name like '%" + name + "%' and country='" + country + "'";
                }
                ArrayList<SoloArtist> output = Database.ReturnSoloArtistsFromDatabase(query);
                if (output.isEmpty()) {
                    PopUpFrame pf = new PopUpFrame();
                    pf.setVisible(true);
                }
                for (SoloArtist a : output) {
                    dlm.addElement(a.getName());
                    this.data.add(a);

                }

            } catch (Exception ex) {
                ex.getMessage();

            }

        }
        if (ob.equals("Group")) {
            dlm.clear();
            data.clear();
            data2.clear();
            try {
                String query;
                if(country.equals("")){
                   query = "select * from java_ii_artists where name like '%" + name + "%' "; 
                }
                else if(name.equals("")) {
                 query = "select * from java_ii_artists where country like '%" + country + "%' "; 
                }
                else{
                 query = "select * from java_ii_artists where name like '%" + name + "%' and country='" + country + "'";
                }
                ArrayList<Group> output = Database.ReturnGroupsFromDatabase(query);
                if (output.isEmpty()) {
                    PopUpFrame pf = new PopUpFrame();
                    pf.setVisible(true);
                }
                for (Artist a : output) {
                    dlm.addElement(a.getName());
                    this.data.add(a);
                }

            } catch (Exception ex) {
                ex.getMessage();

            }
        }
        if (ob.equals("Album")) {
            dlm.clear();
            data.clear();
            data2.clear();
            try {
                
                String query = "select * from java_ii_release where title like '%" + name + "%'";
                ArrayList<Release> output = Database.ReturnAlbumsFromDatabase(query);
                if (output.isEmpty()) {
                    PopUpFrame pf = new PopUpFrame();
                    pf.setVisible(true);
                }

                for (Release a : output) {
                    dlm.addElement(a.getTitle());
                    this.data2.add(a);
                }
            } catch (Exception ex) {
                ex.getMessage();

            }
        }
        }catch(Exception e){
               DbDialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListMouseClicked
        Object ob = JList.getSelectedValue();
        if (ob.equals("Album")) {
            jTextCountry.setEnabled(false);

        } else {
            jTextCountry.setEnabled(true);
        }
    }//GEN-LAST:event_JListMouseClicked

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
         List selectedItem = MyList.getSelectedValuesList();

        TextArea.setText("");
        if (selectedItem.isEmpty()) {
            TextArea.append("You haven't selected anything" + "\n");
        }

        for (Object s : selectedItem) {//Sacnning through the list which contains only the names of Artists or Group
            for (Object c : data) {//scanning through the ArrayList that contains the full objects
                Artist a = (Artist) c;//casting the object
                //checking to see if the name in the list matches the name of the object
                if (a.getName().equals(s)) {
                    TextArea.append(a + "\n");//if it does the object will appear in the Text Area
                }
            }
        }

        for (Object s : selectedItem) {//Same exact procedure for Release type objects
            for (Object c : data2) {
                Release a = (Release) c;

                if (a.getTitle().equals(s)) {
                    TextArea.append(a + "\n");
                }
            }
        }


    }//GEN-LAST:event_ShowButtonActionPerformed

    private void ClearButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton2ActionPerformed
        dlm.clear();
        JList.clearSelection();
        TextArea.setText("");
        jTextName.setText("");
        jTextCountry.setText("");
    }//GEN-LAST:event_ClearButton2ActionPerformed

    private void GoBackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_GoBackButton2ActionPerformed

    private void DbDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DbDialogButtonActionPerformed
         DbDialog.dispose();
    }//GEN-LAST:event_DbDialogButtonActionPerformed

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNameMouseClicked
              if (evt.getClickCount() == 2) {
            jTextName.setText(null);
              }
    }//GEN-LAST:event_jTextNameMouseClicked

    private void jTextCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextCountryMouseClicked
          if (evt.getClickCount() == 2) {
            jTextCountry.setText(null);
     }
    }//GEN-LAST:event_jTextCountryMouseClicked

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
            java.util.logging.Logger.getLogger(DatabaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton2;
    private javax.swing.JDialog DbDialog;
    private javax.swing.JButton DbDialogButton;
    private javax.swing.JButton GoBackButton2;
    private javax.swing.JList JList;
    private javax.swing.JList MyList;
    private javax.swing.JButton ShowButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextCountry;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
