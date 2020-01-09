/*
 * Created by JFormDesigner on Thu Jan 09 10:10:13 CET 2020
 */

package fr.igruserver.windowsServer.Champs.ch_Grp;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class ch_Grp extends JPanel {
    public ch_Grp(String nomGrp) {
        initComponents(nomGrp);
    }

    private void initComponents(String nomGrp) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        labelNomGrp = new JLabel();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (e -> {if ("\u0062order" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); });
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]",
                // rows
                "[]"));

            //---- labelNomGrp ----
            labelNomGrp.setFont(labelNomGrp.getFont().deriveFont(labelNomGrp.getFont().getStyle() | Font.BOLD, labelNomGrp.getFont().getSize() + 4f));
            panel1.add(labelNomGrp, "cell 0 0,grow");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        labelNomGrp.setText("  #"+nomGrp);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel labelNomGrp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
