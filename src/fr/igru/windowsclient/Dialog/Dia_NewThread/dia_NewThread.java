/*
 * Created by JFormDesigner on Fri Jan 10 05:45:58 CET 2020
 */

package fr.igru.windowsclient.Dialog.Dia_NewThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class dia_NewThread extends JPanel {
    public dia_NewThread() {
        initComponents();
    }

    private void buttonCancelActionPerformed(ActionEvent e) {
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
        textFieldTitre = new JTextField();
        panel4 = new JPanel();
        label3 = new JLabel();
        textFieldGrp = new JTextField();
        panel9 = new JPanel();
        label7 = new JLabel();
        scrollPane1 = new JScrollPane();
        textAreaMsg = new JTextArea();
        panel3 = new JPanel();
        buttonCancel = new JButton();
        buttonConfirm = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[220!,fill]",
            // rows
            "rel[20!]0" +
            "[40!]" +
            "[40!]" +
            "[120!]0" +
            "[40!]"));

        //---- label1 ----
        label1.setText("Nouveau Fil de Discussion");
        add(label1, "cell 0 0,alignx center,growx 0");

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
            label2.setText("Titre");
            panel2.add(label2, "cell 0 0,alignx left,growx 0");
            panel2.add(textFieldTitre, "cell 1 0");
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
            label3.setText("Groupe");
            panel4.add(label3, "cell 0 0,alignx left,growx 0");
            panel4.add(textFieldGrp, "cell 1 0");
        }
        add(panel4, "cell 0 2");

        //======== panel9 ========
        {
            panel9.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]",
                // rows
                "0[]0" +
                "[97]0"));

            //---- label7 ----
            label7.setText("Message :");
            panel9.add(label7, "cell 0 0,aligny center,growy 0");

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textAreaMsg);
            }
            panel9.add(scrollPane1, "cell 0 1,grow");
        }
        add(panel9, "cell 0 3,aligny top,growy 0");

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
        add(panel3, "cell 0 4");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textFieldTitre;
    private JPanel panel4;
    private JLabel label3;
    private JTextField textFieldGrp;
    private JPanel panel9;
    private JLabel label7;
    private JScrollPane scrollPane1;
    private JTextArea textAreaMsg;
    private JPanel panel3;
    private JButton buttonCancel;
    private JButton buttonConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
