/*
 * Created by JFormDesigner on Thu Jan 09 10:09:47 CET 2020
 */

package fr.igruserver.windowsServer.Dialog.dia_rmUtilFromGrp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class dia_rmUtilFromGrp extends JPanel {
    public dia_rmUtilFromGrp() {
        initComponents();
    }

    private void buttonCancelActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.setVisible(false);
        this.setEnabled(false);
    }

    private void buttonConfirmActionPerformed(ActionEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        textFieldUsername = new JTextField();
        panel4 = new JPanel();
        label3 = new JLabel();
        textFieldGrp = new JTextField();
        panel3 = new JPanel();
        buttonCancel = new JButton();
        buttonConfirm = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[220!,fill]",
            // rows
            "rel[25!]0" +
            "[40!]" +
            "[40!]" +
            "[40!]"));

        //---- label1 ----
        label1.setText("Retirer Utilisateur \u00e0 un groupe");
        add(label1, "cell 0 0,alignx center,growx 0");

        //======== panel2 ========
        {
            panel2.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[53:64,fill]" +
                "[137,fill]",
                // rows
                "rel[]0"));

            //---- label2 ----
            label2.setText("Username :");
            panel2.add(label2, "cell 0 0,alignx left,growx 0");
            panel2.add(textFieldUsername, "cell 1 0");
        }
        add(panel2, "cell 0 1");

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
            label3.setText("Groupe :");
            panel4.add(label3, "cell 0 0,alignx left,growx 0");
            panel4.add(textFieldGrp, "cell 1 0");
        }
        add(panel4, "cell 0 2");

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
            buttonCancel.addActionListener(e -> buttonCancelActionPerformed(e));
            panel3.add(buttonCancel, "cell 0 0");

            //---- buttonConfirm ----
            buttonConfirm.setText("Confirmer");
            buttonConfirm.addActionListener(e -> buttonConfirmActionPerformed(e));
            panel3.add(buttonConfirm, "cell 1 0");
        }
        add(panel3, "cell 0 3");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables+
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textFieldUsername;
    private JPanel panel4;
    private JLabel label3;
    private JTextField textFieldGrp;
    private JPanel panel3;
    private JButton buttonCancel;
    private JButton buttonConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
