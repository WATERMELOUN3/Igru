/*
 * Created by JFormDesigner on Thu Jan 09 10:10:13 CET 2020
 */

package fr.igru.windowsclient.Champs.ch_MyGroups;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class ch_MyGroups extends JPanel {
    public ch_MyGroups(String nomGrp) {
        initComponents(nomGrp);
    }

    private void initComponents(String nomGrp) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        labelNomGrp = new JLabel();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
        javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax
        .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
        .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
        .Color.red), getBorder())); addPropertyChangeListener(new java.beans.
        PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".
        equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "0[fill]0",
            // rows
            "0[]0"));

        //---- labelNomGrp ----
        labelNomGrp.setFont(labelNomGrp.getFont().deriveFont(labelNomGrp.getFont().getStyle() | Font.BOLD, labelNomGrp.getFont().getSize() + 4f));
        add(labelNomGrp, "cell 0 0,grow");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        labelNomGrp.setText("  #"+nomGrp);
        labelNomGrp.setVisible(true);
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel labelNomGrp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
