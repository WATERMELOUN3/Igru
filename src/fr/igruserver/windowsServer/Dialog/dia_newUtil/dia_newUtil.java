/*
 * Created by JFormDesigner on Thu Jan 09 10:09:21 CET 2020
 */

package fr.igruserver.windowsServer.Dialog.dia_newUtil;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class dia_newUtil extends JPanel {
    public dia_newUtil() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        textFieldUsername = new JTextField();
        panel4 = new JPanel();
        label3 = new JLabel();
        textFieldPrenom = new JTextField();
        panel9 = new JPanel();
        label7 = new JLabel();
        textFieldNom = new JTextField();
        panel10 = new JPanel();
        label8 = new JLabel();
        passwordField = new JPasswordField();
        panel3 = new JPanel();
        buttonCancel = new JButton();
        buttonConfirm = new JButton();
        panel5 = new JPanel();
        label4 = new JLabel();
        panel6 = new JPanel();
        label5 = new JLabel();
        textField3 = new JTextField();
        panel7 = new JPanel();
        label6 = new JLabel();
        textField4 = new JTextField();
        panel8 = new JPanel();
        button3 = new JButton();
        button4 = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[220!,fill]",
                // rows
                "rel[20!]0" +
                "[40!]" +
                "[40!]" +
                "[40!]" +
                "[40!]" +
                "[40!]"));

            //---- label1 ----
            label1.setText("Nouvel Utilisateur");
            panel1.add(label1, "cell 0 0,alignx center,growx 0");

            //======== panel2 ========
            {
                panel2.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[53:64,fill]" +
                    "[130,fill]",
                    // rows
                    "rel[]0"));

                //---- label2 ----
                label2.setText("Username :");
                panel2.add(label2, "cell 0 0,alignx left,growx 0");
                panel2.add(textFieldUsername, "cell 1 0");
            }
            panel1.add(panel2, "cell 0 1");

            //======== panel4 ========
            {
                panel4.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[64,fill]" +
                    "[160,fill]",
                    // rows
                    "0[]0"));

                //---- label3 ----
                label3.setText("Pr\u00e9nom :");
                panel4.add(label3, "cell 0 0,alignx left,growx 0");
                panel4.add(textFieldPrenom, "cell 1 0");
            }
            panel1.add(panel4, "cell 0 2");

            //======== panel9 ========
            {
                panel9.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[41,fill]" +
                    "[160,fill]",
                    // rows
                    "0[]0"));

                //---- label7 ----
                label7.setText("Nom :");
                panel9.add(label7, "cell 0 0,alignx left,growx 0");
                panel9.add(textFieldNom, "cell 1 0");
            }
            panel1.add(panel9, "cell 0 3");

            //======== panel10 ========
            {
                panel10.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[64,fill]" +
                    "[160,fill]",
                    // rows
                    "0[]0"));

                //---- label8 ----
                label8.setText("Mot de Passe");
                panel10.add(label8, "cell 0 0,alignx left,growx 0");
                panel10.add(passwordField, "cell 1 0");
            }
            panel1.add(panel10, "cell 0 4");

            //======== panel3 ========
            {
                panel3.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "0[19:24]"));

                //---- buttonCancel ----
                buttonCancel.setText("Annuler");
                buttonCancel.setBorder(new LineBorder(Color.red, 2, true));
                buttonCancel.addActionListener(e -> button1ActionPerformed(e));
                panel3.add(buttonCancel, "cell 0 0");

                //---- buttonConfirm ----
                buttonConfirm.setText("Confirmer");
                buttonConfirm.addActionListener(e -> button2ActionPerformed(e));
                panel3.add(buttonConfirm, "cell 1 0");
            }
            panel1.add(panel3, "cell 0 5");
        }

        //======== panel5 ========
        {
            panel5.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,panel5. getBorder( )) ); panel5. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            panel5.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]",
                // rows
                "rel[15:17]0" +
                "[]" +
                "[]" +
                "[]" +
                "[34]" +
                "[21:24]"));

            //---- label4 ----
            label4.setText("Ajouter Utilisateur \u00e0 un groupe");
            panel5.add(label4, "cell 0 0,alignx center,growx 0");

            //======== panel6 ========
            {
                panel6.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[53:64,fill]" +
                    "[137,fill]",
                    // rows
                    "rel[]0"));

                //---- label5 ----
                label5.setText("Username :");
                panel6.add(label5, "cell 0 0,alignx left,growx 0");
                panel6.add(textField3, "cell 1 0");
            }
            panel5.add(panel6, "cell 0 1");

            //======== panel7 ========
            {
                panel7.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[64,fill]" +
                    "[160,fill]",
                    // rows
                    "0[]0"));

                //---- label6 ----
                label6.setText("Groupe :");
                panel7.add(label6, "cell 0 0,alignx left,growx 0");
                panel7.add(textField4, "cell 1 0");
            }
            panel5.add(panel7, "cell 0 2");

            //======== panel8 ========
            {
                panel8.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "0[19:24]"));

                //---- button3 ----
                button3.setText("Annuler");
                button3.setBorder(new LineBorder(Color.red, 2, true));
                button3.addActionListener(e -> button1ActionPerformed(e));
                panel8.add(button3, "cell 0 0");

                //---- button4 ----
                button4.setText("Confirmer");
                button4.addActionListener(e -> button2ActionPerformed(e));
                panel8.add(button4, "cell 1 0");
            }
            panel5.add(panel8, "cell 0 5");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textFieldUsername;
    private JPanel panel4;
    private JLabel label3;
    private JTextField textFieldPrenom;
    private JPanel panel9;
    private JLabel label7;
    private JTextField textFieldNom;
    private JPanel panel10;
    private JLabel label8;
    private JPasswordField passwordField;
    private JPanel panel3;
    private JButton buttonCancel;
    private JButton buttonConfirm;
    private JPanel panel5;
    private JLabel label4;
    private JPanel panel6;
    private JLabel label5;
    private JTextField textField3;
    private JPanel panel7;
    private JLabel label6;
    private JTextField textField4;
    private JPanel panel8;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
