/*
 * Created by JFormDesigner on Tue Jan 07 18:56:54 CET 2020
 */

package fr.igru.windows.ConnectionDialog;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * @author unknown
 */
public class connectionDialog extends JPanel {
    public connectionDialog() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
        // Generated using JFormDesigner Evaluation license - unknown
        JPanel panel5 = new JPanel();
        JPanel panel10 = new JPanel();
        JPanel panel11 = new JPanel();
        JLabel label3 = new JLabel();
        JPanel panel9 = new JPanel();
        JComboBox comboBox1 = new JComboBox();
        JLabel label1 = new JLabel();
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel();
        JTextField textField2 = new JTextField();
        JLabel label4 = new JLabel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JButton button2 = new JButton();
        JPanel panel8 = new JPanel();
        JButton button3 = new JButton();

        //======== panel5 ========
        {
            panel5.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
                    EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax.swing.border.TitledBorder.CENTER, javax.swing
                    .border.TitledBorder.BOTTOM, new Font("Dia\u006cog", Font.BOLD,12), java.awt.Color.red), panel5. getBorder()));
            panel5. addPropertyChangeListener(e -> {if("bord\u0065r".equals(e.getPropertyName()))
            throw new RuntimeException();});
            panel5.setLayout(new MigLayout(
                "fillx,hidemode 3",
                    /* columns */
                "[524:n,fill]",
                    /* rows */
                "[top]" +
                "[]" +
                "[167:159,grow,fill]0" +
                "[]"));

            //======== panel10 ========
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
                            .addGap(24, 24, 24)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel9Layout.createParallelGroup()
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(label1))
                                    .addComponent(label2))
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(82, Short.MAX_VALUE))
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGroup(panel9Layout.createParallelGroup()
                                        .addComponent(textField2)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(76, Short.MAX_VALUE))))
                );
                panel9Layout.setVerticalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1))
                            .addGap(18, 18, 18)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(20, Short.MAX_VALUE))
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

                    //---- button2 ----
                    button2.setText("Annuler");
                    button2.setBackground(Color.red);
                    panel7.add(button2, "cell 0 0");
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

                    //---- button3 ----
                    button3.setText("Se connecter");
                    panel8.add(button3, "cell 0 0");
                }
                panel6.add(panel8, "cell 1 0");
            }
            panel5.add(panel6, "cell 0 3,growx");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
