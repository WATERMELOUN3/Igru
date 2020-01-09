/*
 * Created by JFormDesigner on Thu Jan 09 10:10:21 CET 2020
 */

package fr.igruserver.windowsServer.Champs.ch_Util;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author unknown
 */
public class ch_Util extends JPanel {

    public ch_Util(String nomUtil, String typeUtil, ArrayList<String> groupes, boolean isConnected) {
        initComponents("Bernard Bianca","Professeur", new ArrayList<>(Arrays.asList("Dance", "Ping Pong", "Java pour les nuls")), true);
    }

    private void initComponents(String nomUtil, String typeUtil, ArrayList<String> groupes, boolean isConnected) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        panel2 = new JPanel();
        labelNomUtil = new JLabel();
        panelImg = new JPanel();
        labelTypeGrp = new JLabel();
        textAreaGrp = new JTextArea();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (e -> {if ("bord\u0065r" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); });
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]",
                // rows
                "[]"));

            //======== panel2 ========
            {

                //---- labelNomUtil ----
                labelNomUtil.setFont(labelNomUtil.getFont().deriveFont(labelNomUtil.getFont().getStyle() | Font.BOLD, labelNomUtil.getFont().getSize() + 3f));

                //======== panelImg ========
                {
                    panelImg.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "0[34,fill]0",
                        // rows
                        "0[]0"));
                }

                //---- labelTypeGrp ----
                labelTypeGrp.setText("  ");

                //---- textAreaGrp ----
                textAreaGrp.setEditable(false);

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(labelTypeGrp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(labelNomUtil, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(panelImg, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addComponent(textAreaGrp))
                            .addGap(18, 18, 18))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelImg, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addComponent(labelNomUtil, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelTypeGrp, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textAreaGrp, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                );
            }
            panel1.add(panel2, "cell 0 0,grow");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        labelNomUtil.setText(nomUtil);
        labelTypeGrp.setText(typeUtil);
        String grpString = "  ";
        for (String groupe : groupes) grpString = "  #" + groupe;
        textAreaGrp.setText(grpString);
        if(isConnected){
            ImageIcon isConnectedPic = new ImageIcon("isConnected.png");
            panelImg.add(new JLabel(isConnectedPic));
        }else{
            ImageIcon isNotConnectedPic = new ImageIcon("isNotConnected.png");
            panelImg.add(new JLabel(isNotConnectedPic));
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JPanel panel2;
    private JLabel labelNomUtil;
    private JPanel panelImg;
    private JLabel labelTypeGrp;
    private JTextArea textAreaGrp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
