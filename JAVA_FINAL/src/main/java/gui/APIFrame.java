/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basics.Artist;
import basics.Release;
import db.Database;
import files.*;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import org.json.simple.parser.ParseException;

/**
 *
 * @author it21771-it21794
 */
public class APIFrame extends javax.swing.JFrame {

    /**
     * Creates new form basicFrame
     */
    DefaultListModel dlm;
    //lists used to store objects from dlm,defined outside method so as to be seen by all methods.
    //One for object Artist and the other for Release.
    List<Object> data = new ArrayList<Object>();
    List<Object> data2 = new ArrayList<Object>();

    public APIFrame() throws IOException, MalformedURLException, ParseException {
        dlm = new DefaultListModel();
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.ListDialog.getContentPane().setBackground(Color.DARK_GRAY);
        ListDialog.setSize(new Dimension(300, 170));
        ListDialog.setResizable(false);
        this.FindsNothingDialog.getContentPane().setBackground(Color.DARK_GRAY);
        FindsNothingDialog.setSize(new Dimension(370, 170));
        FindsNothingDialog.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        DialogOKButton = new javax.swing.JButton();
        FindsNothingDialog = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        NothingOKButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList = new javax.swing.JList();
        jTextName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCountry = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        ButtonName = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        MyList = new javax.swing.JList();
        sButton = new javax.swing.JButton();
        dbButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();

        ListDialog.setBackground(new java.awt.Color(87, 46, 5));

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("You have to pick an option from the list");

        DialogOKButton.setBackground(new java.awt.Color(249, 145, 145));
        DialogOKButton.setText("OK");
        DialogOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DialogOKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListDialogLayout = new javax.swing.GroupLayout(ListDialog.getContentPane());
        ListDialog.getContentPane().setLayout(ListDialogLayout);
        ListDialogLayout.setHorizontalGroup(
            ListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListDialogLayout.createSequentialGroup()
                .addGroup(ListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListDialogLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(ListDialogLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(DialogOKButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListDialogLayout.setVerticalGroup(
            ListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListDialogLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(DialogOKButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("We couldn't find what you asked for. Try again.");

        NothingOKButton.setBackground(new java.awt.Color(249, 145, 145));
        NothingOKButton.setText("OK");
        NothingOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NothingOKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FindsNothingDialogLayout = new javax.swing.GroupLayout(FindsNothingDialog.getContentPane());
        FindsNothingDialog.getContentPane().setLayout(FindsNothingDialogLayout);
        FindsNothingDialogLayout.setHorizontalGroup(
            FindsNothingDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindsNothingDialogLayout.createSequentialGroup()
                .addGroup(FindsNothingDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FindsNothingDialogLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7))
                    .addGroup(FindsNothingDialogLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(NothingOKButton)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        FindsNothingDialogLayout.setVerticalGroup(
            FindsNothingDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindsNothingDialogLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(NothingOKButton)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.blue);

        JList.setBackground(new java.awt.Color(167, 162, 162));
        JList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Artist", "Group", "Album" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JList.setMinimumSize(new java.awt.Dimension(20, 20));
        JList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JList);

        jTextName.setBackground(new java.awt.Color(167, 162, 162));
        jTextName.setText(" ex. Fred,John,Nirvana");
        jTextName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNameMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Enter the name: ");

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Enter the country: ");

        jTextCountry.setBackground(new java.awt.Color(167, 162, 162));
        jTextCountry.setText("ex. US,GB,FR etc");
        jTextCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextCountryMouseClicked(evt);
            }
        });

        TextArea.setBackground(new java.awt.Color(167, 162, 162));
        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        ButtonName.setBackground(new java.awt.Color(249, 145, 145));
        ButtonName.setText("OK");
        ButtonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNameActionPerformed(evt);
            }
        });

        MyList.setBackground(new java.awt.Color(167, 162, 162));
        MyList.setModel(dlm   );
        jScrollPane4.setViewportView(MyList);

        sButton.setBackground(new java.awt.Color(249, 145, 145));
        sButton.setText("Show Selected");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        dbButton.setBackground(new java.awt.Color(249, 145, 145));
        dbButton.setText("Add to DataBase");
        dbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Select one of the following first:");

        ClearButton.setBackground(new java.awt.Color(249, 145, 145));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        GoBackButton.setBackground(new java.awt.Color(249, 165, 165));
        GoBackButton.setText("Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GoBackButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonName)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dbButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GoBackButton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(80, 80, 80))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(ButtonName)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ClearButton)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNameActionPerformed
        String name = jTextName.getText();
        String country = jTextCountry.getText();
        Object ob = JList.getSelectedValue();
        try {

            if (ob.equals("Artist")) {
                data.clear();
                data2.clear();
                dlm.clear();
                try {
                    ArrayList<Artist> output = APIWrapper.getArtistsFromCountry(name, country);

                    if (output.isEmpty()) {
                        FindsNothingDialog.setVisible(true);//showing dialog if output is empty
                    }
                    for (Artist a : output) {
                      
                        dlm.addElement(a.getName());
                        //saving the object to be able to show all its details in the Text Area 
                        this.data.add(a);
                    }

                } catch (Exception ex) {
                    ex.getMessage();

                }

            }
            if (ob.equals("Group")) {
                data.clear();
                data2.clear();
                dlm.clear();
                try {
                    ArrayList<Artist> output = APIWrapper.getGroupFromCountry(name, country);
                    if (output.isEmpty()) {
                        FindsNothingDialog.setVisible(true);
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
                data.clear();
                data2.clear();
                dlm.clear();

                try {
                    ArrayList<Release> output = APIWrapper.GetRealeseByName(name);
                    if (output.isEmpty()) {
                        FindsNothingDialog.setVisible(true);
                    }
                    for (Release a : output) {
                        dlm.addElement(a.getTitle());
                        this.data2.add(a);
                    }
                } catch (Exception ex) {
                    ex.getMessage();

                }
            }

        } catch (Exception e) {
            ListDialog.setVisible(true);//if the user doesn't select an option from the list a dialog pops up

        }


    }//GEN-LAST:event_ButtonNameActionPerformed


    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        List selectedItem = MyList.getSelectedValuesList();

        TextArea.setText("");
        if (selectedItem.isEmpty()) {
            TextArea.append("You haven't selected anything" + "\n");
        }

        for (Object s : selectedItem) {//Sacnning through the list which contains only the names of Artists or Groups
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

    }//GEN-LAST:event_sButtonActionPerformed

    private void dbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbButtonActionPerformed

        Object ob = JList.getSelectedValue();
        if (ob.equals("Artist")) {
            try {
                List<Artist> selectedItem = MyList.getSelectedValuesList();
                ArrayList<Artist> items = new ArrayList<Artist>();
                for (Object s : selectedItem) {// the list selectedItem contains only String names
                    for (Object c : data) {//data contains full objects
                        Artist a = (Artist) c;
                        //when the name from the first List is equal to the name of the object it adds to a new list
                        
                        if (a.getName().equals(s)) {
                            items.add(a);
                        }
                    }
                }
//                ArrayList<Artist> all = new ArrayList<Artist>();
//                for (Artist s : items) {
//                    try {
//                        all.add(s);
//                    } catch (NullPointerException e) {
//
//                    }
//
//                }
                int rows = Database.InsertArtistsIntoDatabase(items);
                if (rows > 0) {
                    TextArea.append(rows + " rows have been inserted" + "\n");
                } else if (selectedItem.isEmpty()) {
                    TextArea.append("You haven't selected anything" + "\n");
                } else {
                    TextArea.append("There is a problem with the connection" + "\n" + rows + " rows have been inserted" + "\n");
                }
            } catch (Exception e) {
                e.getMessage();

            }
        }

        if (ob.equals("Group")) {
            try {
                List<Artist> selectedItem = MyList.getSelectedValuesList();
                ArrayList<Artist> all = new ArrayList<Artist>();
                ArrayList<Artist> items = new ArrayList<Artist>();
                for (Object s : selectedItem) {
                    for (Object c : data) {
                        Artist a = (Artist) c;

                        if (a.getName().equals(s)) {
                            items.add(a);
                        }
                    }
                }

//                for (Artist s : items) {
//                    try {
//                        all.add(s);
//                    } catch (NullPointerException e) {
//
//                    }
                
                    int rows = Database.InsertGroupsIntoDatabase(items);
                    if (rows > 0) {
                        TextArea.append(rows + " rows have been inserted" + "\n");
                    } else if (selectedItem.isEmpty()) {
                        TextArea.append("You haven't selected anything" + "\n");
                    } else {
                        TextArea.append("There is a problem with the connection" + "\n" + rows + " rows have been inserted" + "\n");
                    }
                

            } catch (Exception e) {
                e.getMessage();
            }

        }
        if (ob.equals("Album")) {
            try {
                List<Release> selectedItem = MyList.getSelectedValuesList();
                ArrayList<Release> all = new ArrayList<Release>();
                ArrayList<Release> items = new ArrayList<Release>();
                for (Object s : selectedItem) {
                    for (Object c : data2) {
                        Release a = (Release) c;

                        if (a.getTitle().equals(s)) {
                            items.add(a);
                        }
                    }
                }
//                for (Release s : items) {
//                    try {
//                        all.add(s);
//                    } catch (NullPointerException e) {
//
//                    }
//
//                }

                int rows = Database.InsertAlbumIntoDatabase(items);
                if (rows > 0) {
                    TextArea.append(rows + " rows have been inserted" + "\n");
                } else if (selectedItem.isEmpty()) {
                    TextArea.append("You haven't selected anything" + "\n");
                } else {
                    TextArea.append("There is a problem with the connection" + "\n" + rows + " rows have been inserted" + "\n");
                }

            } catch (Exception e) {
                e.getMessage();

            }
        }

    }//GEN-LAST:event_dbButtonActionPerformed

    private void JListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListMouseClicked
        Object ob = JList.getSelectedValue();
        if (ob.equals("Album")) {//the Album object doesn't have the country field so it disables it
            jTextCountry.setEnabled(false);

        } else {
            jTextCountry.setEnabled(true);
        }
    }//GEN-LAST:event_JListMouseClicked

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        dlm.clear();
        JList.clearSelection();
        TextArea.setText("");
        jTextName.setText("");
        jTextCountry.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void DialogOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DialogOKButtonActionPerformed
        ListDialog.dispose();
    }//GEN-LAST:event_DialogOKButtonActionPerformed

    private void NothingOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NothingOKButtonActionPerformed
        FindsNothingDialog.dispose();
    }//GEN-LAST:event_NothingOKButtonActionPerformed

    private void jTextNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNameMouseClicked

        if (evt.getClickCount() == 2) { //when you double click it clears the field name
            jTextName.setText(null);
        }


    }//GEN-LAST:event_jTextNameMouseClicked

    private void jTextCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextCountryMouseClicked
        if (evt.getClickCount() == 2) {//when you double click it clears the field country
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
            java.util.logging.Logger.getLogger(APIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {

                    new APIFrame().setVisible(true);

                } catch (Exception e) {
                    e.getMessage();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonName;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DialogOKButton;
    private javax.swing.JDialog FindsNothingDialog;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JList JList;
    private javax.swing.JDialog ListDialog;
    private javax.swing.JList MyList;
    private javax.swing.JButton NothingOKButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton dbButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextCountry;
    private javax.swing.JTextField jTextName;
    private javax.swing.JButton sButton;
    // End of variables declaration//GEN-END:variables
}