/*
 * Created by JFormDesigner on Tue Jan 07 19:04:23 CET 2020
 */

package fr.igru.windows.MainWindow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JPanel {
    public MainWindow() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button14ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button15ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button12ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button13ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button9ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button10ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button11ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel31 = new JPanel();
        textField3 = new JTextField();
        panel22 = new JPanel();
        panel13 = new JPanel();
        panel20 = new JPanel();
        textField1 = new JTextField();
        panel32 = new JPanel();
        scrollPane2 = new JScrollPane();
        panel23 = new JPanel();
        panel14 = new JPanel();
        panel21 = new JPanel();
        textField2 = new JTextField();
        panel33 = new JPanel();
        scrollPane3 = new JScrollPane();
        panel16 = new JPanel();
        panel17 = new JPanel();
        button9 = new JButton();
        panel19 = new JPanel();
        button10 = new JButton();
        panel18 = new JPanel();
        button11 = new JButton();
        panel25 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        panel24 = new JPanel();
        panel29 = new JPanel();
        button14 = new JButton();
        panel30 = new JPanel();
        button15 = new JButton();
        panel26 = new JPanel();
        panel27 = new JPanel();
        button12 = new JButton();
        panel28 = new JPanel();
        button13 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
        new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e"
        , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 )
        , java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
                e -> {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
                ; });
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[235:260,grow,fill]unrel" +
            "[282:293,grow,fill]" +
            "[178:177,right]",
            // rows
            "0[29:31]0" +
            "[grow]0" +
            "[32:n]0" +
            "[36:40]"));

        //======== panel31 ========
        {
            panel31.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[657:585,fill]",
                // rows
                "0[28:6]"));

            //---- textField3 ----
            textField3.setText("                                                                                    Panneau gestion serveur");
            textField3.setEditable(false);
            panel31.add(textField3, "growx");
        }
        add(panel31, "cell 0 0 3 1,alignx center,growx 0");

        //======== panel22 ========
        {
            panel22.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]0",
                // rows
                "[grow,fill]0"));

            //======== panel13 ========
            {
                panel13.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                panel13.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "0[]" +
                    "[209,grow,fill]rel"));

                //======== panel20 ========
                {
                    panel20.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "0[]0"));

                    //---- textField1 ----
                    textField1.setText("                   Groupes                  ");
                    textField1.setEditable(false);
                    panel20.add(textField1, "cell 0 0,alignx center,growx 0");
                }
                panel13.add(panel20, "cell 0 0,alignx center,growx 0");

                //======== panel32 ========
                {
                    panel32.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "0[fill]0",
                        // rows
                        "0[grow]0"));
                    panel32.add(scrollPane2, "cell 0 0,grow");
                }
                panel13.add(panel32, "cell 0 1,grow");
            }
            panel22.add(panel13, "cell 0 0,grow");
        }
        add(panel22, "cell 0 1 1 2,grow");

        //======== panel23 ========
        {
            panel23.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]",
                // rows
                "[212]"));

            //======== panel14 ========
            {
                panel14.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                panel14.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[229:234,fill]",
                    // rows
                    "0[top]" +
                    "[155:154,grow]" +
                    "[]"));

                //======== panel21 ========
                {
                    panel21.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "0[]0"));

                    //---- textField2 ----
                    textField2.setText("                   Utilisateurs                 ");
                    textField2.setEditable(false);
                    panel21.add(textField2, "cell 0 0,alignx center,growx 0");
                }
                panel14.add(panel21, "cell 0 0,alignx center,growx 0");

                //======== panel33 ========
                {
                    panel33.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "0[fill]0",
                        // rows
                        "0[181,grow,fill]0"));
                    panel33.add(scrollPane3, "cell 0 0,grow");
                }
                panel14.add(panel33, "cell 0 1,grow");
            }
            panel23.add(panel14, "cell 0 0,grow");
        }
        add(panel23, "cell 1 1,grow");

        //======== panel16 ========
        {
            panel16.setLayout(new MigLayout(
                "fill,hidemode 3,aligny top",
                // columns
                "[129:n,fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //======== panel17 ========
            {
                panel17.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[139:146,fill]",
                    // rows
                    "[]"));

                //---- button9 ----
                button9.setText("Client Administrateur");
                button9.addActionListener(this::button9ActionPerformed);
                panel17.add(button9, "cell 0 0");
            }
            panel16.add(panel17, "cell 0 0");

            //======== panel19 ========
            {
                panel19.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[]"));

                //---- button10 ----
                button10.setText("Sauvegarder Donn\u00e9es");
                button10.addActionListener(this::button10ActionPerformed);
                panel19.add(button10, "cell 0 0");
            }
            panel16.add(panel19, "cell 0 1");

            //======== panel18 ========
            {
                panel18.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[]"));

                //---- button11 ----
                button11.setText("Visualisateur des tables");
                button11.addActionListener(this::button11ActionPerformed);
                panel18.add(button11, "cell 0 0");
            }
            panel16.add(panel18, "cell 0 2");
        }
        add(panel16, "cell 2 1 1 2,aligny top,growy 0");

        //======== panel25 ========
        {
            panel25.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]" +
                "[130:n,fill]",
                // rows
                "[]0" +
                "[]0" +
                "[]0" +
                "[]"));

            //---- button2 ----
            button2.setText("Enlever du groupe");
            button2.addActionListener(this::button2ActionPerformed);
            panel25.add(button2, "cell 1 0 1 4");

            //---- button1 ----
            button1.setText("Ajouter au groupe");
            button1.setIconTextGap(3);
            button1.addActionListener(this::button1ActionPerformed);
            panel25.add(button1, "cell 0 1 1 2,growx");
        }
        add(panel25, "cell 1 2");

        //======== panel24 ========
        {
            panel24.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "rel[fill]rel" +
                "[fill]0",
                // rows
                "0[]"));

            //======== panel29 ========
            {
                panel29.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[117:115,fill]0",
                    // rows
                    "rel[]"));

                //---- button14 ----
                button14.setText("Ajouter");
                button14.addActionListener(this::button14ActionPerformed);
                panel29.add(button14, "cell 0 0");
            }
            panel24.add(panel29, "cell 0 0");

            //======== panel30 ========
            {
                panel30.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[110:106,fill]0",
                    // rows
                    "rel[]"));

                //---- button15 ----
                button15.setText("Supprimer");
                button15.addActionListener(this::button15ActionPerformed);
                panel30.add(button15, "cell 0 0");
            }
            panel24.add(panel30, "cell 1 0");
        }
        add(panel24, "cell 0 3,grow");

        //======== panel26 ========
        {
            panel26.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "0[]"));

            //======== panel27 ========
            {
                panel27.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[123,fill]0",
                    // rows
                    "rel[]"));

                //---- button12 ----
                button12.setText("Ajouter");
                button12.addActionListener(this::button12ActionPerformed);
                panel27.add(button12, "cell 0 0,growx,wmin 130");
            }
            panel26.add(panel27, "cell 0 0,growx");

            //======== panel28 ========
            {
                panel28.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[122,fill]0",
                    // rows
                    "rel[]"));

                //---- button13 ----
                button13.setText("Supprimer");
                button13.addActionListener(this::button13ActionPerformed);
                panel28.add(button13, "cell 0 0,growx,width 130:130");
            }
            panel26.add(panel28, "cell 1 0,growx");
        }
        add(panel26, "cell 1 3");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel31;
    private JTextField textField3;
    private JPanel panel22;
    private JPanel panel13;
    private JPanel panel20;
    private JTextField textField1;
    private JPanel panel32;
    private JScrollPane scrollPane2;
    private JPanel panel23;
    private JPanel panel14;
    private JPanel panel21;
    private JTextField textField2;
    private JPanel panel33;
    private JScrollPane scrollPane3;
    private JPanel panel16;
    private JPanel panel17;
    private JButton button9;
    private JPanel panel19;
    private JButton button10;
    private JPanel panel18;
    private JButton button11;
    private JPanel panel25;
    private JButton button2;
    private JButton button1;
    private JPanel panel24;
    private JPanel panel29;
    private JButton button14;
    private JPanel panel30;
    private JButton button15;
    private JPanel panel26;
    private JPanel panel27;
    private JButton button12;
    private JPanel panel28;
    private JButton button13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
