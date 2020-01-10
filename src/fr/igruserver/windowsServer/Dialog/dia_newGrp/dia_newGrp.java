/*
 * Created by JFormDesigner on Thu Jan 09 10:09:05 CET 2020
 */

package fr.igruserver.windowsServer.Dialog.dia_newGrp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class dia_newGrp extends JPanel {
    public dia_newGrp() {
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
        panel4 = new JPanel();
        label3 = new JLabel();
        textFieldGrp = new JTextField();
        panel3 = new JPanel();
        buttonCancel = new JButton();
        buttonConfirm = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[220!,fill]",
                // rows
                "rel[25!]0" +
                "[58!]" +
                "[35!]"));

            //---- label1 ----
            label1.setText("Ajouter un groupe");
            panel1.add(label1, "cell 0 0,alignx center,growx 0");

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
            panel1.add(panel4, "cell 0 1");

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
            panel1.add(panel3, "cell 0 2");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel4;
    private JLabel label3;
    private JTextField textFieldGrp;
    private JPanel panel3;
    private JButton buttonCancel;
    private JButton buttonConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
