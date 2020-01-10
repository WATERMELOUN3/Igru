/*
 * Created by JFormDesigner on Thu Jan 09 10:09:37 CET 2020
 */

package fr.igruserver.windowsServer.Dialog.dia_rmUtil;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class dia_rmUtil extends JPanel {
    public dia_rmUtil() {
        initComponents();
    }

    private void buttonCancelActionPerformed(ActionEvent e) {
        this.setVisible(false);
        this.setEnabled(false);
    }

    private void buttonConfirmActionPerformed(ActionEvent e) {
        String username = textFieldUsername.getText();
        this.setVisible(false);
        this.setEnabled(false);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        panel4 = new JPanel();
        label3 = new JLabel();
        textFieldUsername = new JTextField();
        panel3 = new JPanel();
        buttonCancel = new JButton();
        buttonConfirm = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
        .border.EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder
        .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.
        awt.Font.BOLD,12),java.awt.Color.red), getBorder()))
        ; addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException();}})
        ;
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[220!,fill]",
            // rows
            "rel[25!]0" +
            "[60!]" +
            "[40!]"));

        //---- label1 ----
        label1.setText("Retirer un utilisateur");
        add(label1, "cell 0 0,alignx center,growx 0");

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
            label3.setText("Username :");
            panel4.add(label3, "cell 0 0,alignx left,growx 0");
            panel4.add(textFieldUsername, "cell 1 0");
        }
        add(panel4, "cell 0 1");

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
        add(panel3, "cell 0 2");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JPanel panel4;
    private JLabel label3;
    private JTextField textFieldUsername;
    private JPanel panel3;
    private JButton buttonCancel;
    private JButton buttonConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
