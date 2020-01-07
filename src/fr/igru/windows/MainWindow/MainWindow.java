/*
 * Created by JFormDesigner on Tue Jan 07 19:04:23 CET 2020
 */

package fr.igru.windows.MainWindow;

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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel13 = new JPanel();
        panel20 = new JPanel();
        textField1 = new JTextField();
        panel14 = new JPanel();
        panel21 = new JPanel();
        textField2 = new JTextField();
        panel16 = new JPanel();
        panel17 = new JPanel();
        button9 = new JButton();
        panel19 = new JPanel();
        button10 = new JButton();
        panel18 = new JPanel();
        button11 = new JButton();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel4 = new JPanel();
        button1 = new JButton();
        panel5 = new JPanel();
        button2 = new JButton();
        panel10 = new JPanel();
        panel11 = new JPanel();
        button8 = new JButton();
        panel12 = new JPanel();
        button7 = new JButton();
        panel7 = new JPanel();
        panel8 = new JPanel();
        button5 = new JButton();
        panel9 = new JPanel();
        button6 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (e -> {if ("\u0062ord\u0065r" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); });
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[235:260,fill]unrel" +
            "[282:293,fill]" +
            "[177,right]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //======== panel13 ========
        {
            panel13.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
            panel13.setLayout(new MigLayout(
                "fillx,hidemode 3",
                // columns
                "[fill]",
                // rows
                "0[]" +
                "[199]"));

            //======== panel20 ========
            {
                panel20.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "0[]0"));

                //---- textField1 ----
                textField1.setText("                       Groupes                  ");
                panel20.add(textField1, "cell 0 0,growx");
            }
            panel13.add(panel20, "cell 0 0");
        }
        add(panel13, "cell 0 0 1 12,aligny top,growy 0");

        //======== panel14 ========
        {
            panel14.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
            panel14.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[229:234,fill]",
                // rows
                "0[]" +
                "[155:154]"));

            //======== panel21 ========
            {
                panel21.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "0[]"));

                //---- textField2 ----
                textField2.setText("                             Utilisateurs              ");
                panel21.add(textField2, "cell 0 0");
            }
            panel14.add(panel21, "cell 0 0");
        }
        add(panel14, "cell 1 0 1 12,aligny top,growy 0");

        //======== panel16 ========
        {
            panel16.setLayout(new MigLayout(
                "fill,hidemode 3,aligny top",
                // columns
                "[fill]",
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
                panel18.add(button11, "cell 0 0");
            }
            panel16.add(panel18, "cell 0 2");
        }
        add(panel16, "cell 2 0 1 12,aligny top,growy 0");

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[227:237,fill]unrel" +
                "[274:297,fill]" +
                "[260,fill]",
                // rows
                "[]0" +
                "[]0"));

            //======== panel2 ========
            {
                panel2.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "0[134:129,fill]unrel" +
                    "[fill]",
                    // rows
                    "0[]0"));

                //======== panel4 ========
                {
                    panel4.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "0[120:n,fill]0",
                        // rows
                        "0[]0"));

                    //---- button1 ----
                    button1.setText("Ajouter au groupe");
                    button1.setIconTextGap(3);
                    panel4.add(button1, "cell 0 0,growx");
                }
                panel2.add(panel4, "cell 0 0");

                //======== panel5 ========
                {
                    panel5.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "0[137,fill]0",
                        // rows
                        "0[]0"));

                    //---- button2 ----
                    button2.setText("Enlever du groupe");
                    panel5.add(button2, "cell 0 0");
                }
                panel2.add(panel5, "cell 1 0");
            }
            panel1.add(panel2, "cell 1 0");

            //======== panel10 ========
            {
                panel10.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[49]"));

                //======== panel11 ========
                {
                    panel11.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "0[91,fill]0",
                        // rows
                        "[]"));

                    //---- button8 ----
                    button8.setText("Ajouter");
                    panel11.add(button8, "cell 0 0");
                }
                panel10.add(panel11, "cell 0 0,growx");

                //======== panel12 ========
                {
                    panel12.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "[]"));

                    //---- button7 ----
                    button7.setText("Supprimer");
                    panel12.add(button7, "cell 0 0");
                }
                panel10.add(panel12, "cell 1 0");
            }
            panel1.add(panel10, "cell 0 1");

            //======== panel7 ========
            {
                panel7.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "0[fill]unrel" +
                    "[127:124,fill]0",
                    // rows
                    "0[]0"));

                //======== panel8 ========
                {
                    panel8.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "0[133:118,left]0",
                        // rows
                        "[]"));

                    //---- button5 ----
                    button5.setText("Ajouter");
                    panel8.add(button5, "cell 0 0,growx");
                }
                panel7.add(panel8, "cell 0 0");

                //======== panel9 ========
                {
                    panel9.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "0[132:126,fill]0",
                        // rows
                        "[]"));

                    //---- button6 ----
                    button6.setText("Supprimer");
                    panel9.add(button6, "cell 0 0");
                }
                panel7.add(panel9, "cell 1 0");
            }
            panel1.add(panel7, "cell 1 1");
        }
        add(panel1, "cell 0 10 3 2");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel13;
    private JPanel panel20;
    private JTextField textField1;
    private JPanel panel14;
    private JPanel panel21;
    private JTextField textField2;
    private JPanel panel16;
    private JPanel panel17;
    private JButton button9;
    private JPanel panel19;
    private JButton button10;
    private JPanel panel18;
    private JButton button11;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel4;
    private JButton button1;
    private JPanel panel5;
    private JButton button2;
    private JPanel panel10;
    private JPanel panel11;
    private JButton button8;
    private JPanel panel12;
    private JButton button7;
    private JPanel panel7;
    private JPanel panel8;
    private JButton button5;
    private JPanel panel9;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
