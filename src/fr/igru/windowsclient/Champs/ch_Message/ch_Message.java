/*
 * Created by JFormDesigner on Thu Jan 09 10:00:02 CET 2020
 */

package fr.igru.windowsclient.Champs.ch_Message;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class ch_Message extends JPanel {
    public ch_Message(String txtMessage) {
        initComponents(txtMessage);
    }

    private void initComponents(String txtMessage) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        textArea1 = new JTextArea();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
            , 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
            panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[260:260,fill]",
                // rows
                "[grow]"));

            //---- textArea1 ----
            textArea1.setOpaque(false);
            textArea1.setEditable(false);
            panel1.add(textArea1, "cell 0 0,grow");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        textArea1.setText(txtMessage);
        textArea1.setVisible(true);
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
