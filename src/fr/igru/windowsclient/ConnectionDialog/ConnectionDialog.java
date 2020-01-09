/*
 * Created by JFormDesigner on Tue Jan 07 18:56:54 CET 2020
 */

package fr.igru.windowsclient.ConnectionDialog;

import java.awt.event.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * @author unknown
 */
public class ConnectionDialog extends JPanel {
    public ConnectionDialog() {
        initComponents();
    }

    private void buttonCancelActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void buttonConnectActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alexis GELIN
        panel5 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        label3 = new JLabel();
        panel9 = new JPanel();
        comboBoxUserType = new JComboBox();
        label1 = new JLabel();
        textFieldLogin = new JTextField();
        label2 = new JLabel();
        textFieldMDP = new JTextField();
        label4 = new JLabel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        buttonCancel = new JButton();
        panel8 = new JPanel();
        buttonConnect = new JButton();

        //======== panel5 ========
        {
            panel5.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel5. getBorder
            ( )) ); panel5. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            panel5.setLayout(new MigLayout(
                "fillx,hidemode 3",
                // columns
                "[524:n,fill]",
                // rows
                "[top]" +
                "[]" +
                "[167:159,grow,fill]0" +
                "[]"));

            //======== panel10 ========
            {
                panel10.setBorder(new EtchedBorder());
                panel10.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[13:n]"));

                //======== panel11 ========
                {
                    panel11.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "0[18:20]0"));

                    //---- label3 ----
                    label3.setText("Se Connecter");
                    panel11.add(label3, "cell 0 0,alignx center,growx 0");
                }
                panel10.add(panel11, "cell 0 0");
            }
            panel5.add(panel10, "cell 0 1");

            //======== panel9 ========
            {

                //---- label1 ----
                label1.setText("Login :");

                //---- label2 ----
                label2.setText("Mot de Passe : ");

                //---- label4 ----
                label4.setText("Type d'Utilisateur :");

                GroupLayout panel9Layout = new GroupLayout(panel9);
                panel9.setLayout(panel9Layout);
                panel9Layout.setHorizontalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label2)
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label1)
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)))
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldLogin, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(textFieldMDP, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(comboBoxUserType, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                            .addContainerGap(82, Short.MAX_VALUE))
                );
                panel9Layout.setVerticalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(comboBoxUserType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(textFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(textFieldMDP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(11, Short.MAX_VALUE))
                );
            }
            panel5.add(panel9, "cell 0 2,grow");

            //======== panel6 ========
            {
                panel6.setLayout(new MigLayout(
                    "hidemode 3,alignx center",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "0[]"));

                //======== panel7 ========
                {
                    panel7.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "[]"));

                    //---- buttonCancel ----
                    buttonCancel.setText("Annuler");
                    buttonCancel.setBackground(Color.red);
                    buttonCancel.addActionListener(e -> buttonCancelActionPerformed(e));
                    panel7.add(buttonCancel, "cell 0 0");
                }
                panel6.add(panel7, "cell 0 0");

                //======== panel8 ========
                {
                    panel8.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "[]"));

                    //---- buttonConnect ----
                    buttonConnect.setText("Se connecter");
                    buttonConnect.addActionListener(e -> buttonConnectActionPerformed(e));
                    panel8.add(buttonConnect, "cell 0 0");
                }
                panel6.add(panel8, "cell 1 0");
            }
            panel5.add(panel6, "cell 0 3,growx");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Alexis GELIN
    private JPanel panel5;
    private JPanel panel10;
    private JPanel panel11;
    private JLabel label3;
    private JPanel panel9;
    private JComboBox comboBoxUserType;
    private JLabel label1;
    private JTextField textFieldLogin;
    private JLabel label2;
    private JTextField textFieldMDP;
    private JLabel label4;
    private JPanel panel6;
    private JPanel panel7;
    private JButton buttonCancel;
    private JPanel panel8;
    private JButton buttonConnect;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
