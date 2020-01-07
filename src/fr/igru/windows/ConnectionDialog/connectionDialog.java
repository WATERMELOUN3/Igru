/*
 * Created by JFormDesigner on Tue Jan 07 18:56:54 CET 2020
 */

package fr.igru.windows.ConnectionDialog;

import javax.swing.*;
import net.miginfocom.swing.*;

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
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel4 = new JPanel();
        button1 = new JButton();
        panel5 = new JPanel();
        button2 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
        , 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
         getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
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
            "[]"));

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[260,fill]" +
                "[261,fill]" +
                "[260,fill]",
                // rows
                "[]" +
                "[]"));

            //======== panel2 ========
            {
                panel2.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]"));

                //======== panel4 ========
                {
                    panel4.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "[]"));

                    //---- button1 ----
                    button1.setText("text");
                    panel4.add(button1, "cell 0 0");
                }
                panel2.add(panel4, "cell 0 0");

                //======== panel5 ========
                {
                    panel5.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "[]"));

                    //---- button2 ----
                    button2.setText("text");
                    panel5.add(button2, "cell 0 0");
                }
                panel2.add(panel5, "cell 1 0");
            }
            panel1.add(panel2, "cell 1 0");
        }
        add(panel1, "cell 1 9 1 2");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel4;
    private JButton button1;
    private JPanel panel5;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
