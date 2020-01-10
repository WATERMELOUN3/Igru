/*
 * Created by JFormDesigner on Thu Jan 09 10:10:21 CET 2020
 */

package fr.igruserver.windowsServer.Champs.ch_Util;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author unknown
 */
public class ch_Util extends JPanel {
// new ArrayList<>(Arrays.asList("Dance", "Ping Pong", "Java pour les nuls"))
    public ch_Util(String username,String nomUtil, String typeUtil, ArrayList<String> groupes, boolean isConnected) {
        initComponents(username,nomUtil,typeUtil,groupes,isConnected);
    }

    private void initComponents(String username,String nomUtil, String typeUtil, ArrayList<String> groupes, boolean isConnected) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel3 = new JPanel();
        panel4 = new JPanel();
        labelUsername = new JLabel();
        panelImg = new JPanel();
        labelNomUtil = new JLabel();
        labelTypeGrp = new JLabel();
        textAreaGrp = new JTextArea();

        //======== this ========
        setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        setMinimumSize(new Dimension(238, 130));
        setPreferredSize(new Dimension(245, 140));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  " " , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[225,fill]",
            // rows
            "[43:73,grow]0"));

        //======== panel3 ========
        {
            panel3.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "0[fill]0",
                // rows
                "0[39]5" +
                "[15]5" +
                "[35,grow]rel"));

            //======== panel4 ========
            {
                panel4.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[171,fill]" +
                    "[26:n,fill]",
                    // rows
                    "0[]" +
                    "[20:n]0"));

                //---- labelUsername ----
                labelUsername.setText(" ");
                labelUsername.setFont(labelUsername.getFont().deriveFont(labelUsername.getFont().getStyle() | Font.ITALIC));
                panel4.add(labelUsername, "cell 0 0");

                //======== panelImg ========
                {
                    panelImg.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "0[32:26,fill]0",
                        // rows
                        "0[32:26]0"));
                }
                panel4.add(panelImg, "cell 1 0 1 2");

                //---- labelNomUtil ----
                labelNomUtil.setFont(labelNomUtil.getFont().deriveFont(labelNomUtil.getFont().getStyle() | Font.BOLD, labelNomUtil.getFont().getSize() + 3f));
                labelNomUtil.setText(" ");
                panel4.add(labelNomUtil, "cell 0 1");
            }
            panel3.add(panel4, "cell 0 0");

            //---- labelTypeGrp ----
            labelTypeGrp.setText("  ");
            panel3.add(labelTypeGrp, "cell 0 1");

            //---- textAreaGrp ----
            textAreaGrp.setEditable(false);
            textAreaGrp.setOpaque(false);
            textAreaGrp.setMinimumSize(new Dimension(220, 17));
            textAreaGrp.setPreferredSize(new Dimension(215, 17));
            panel3.add(textAreaGrp, "cell 0 2,grow");
        }
        add(panel3, "cell 0 0,grow");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        labelUsername.setText("#"+username);
        labelNomUtil.setText(nomUtil);
        labelTypeGrp.setText("Type : "+typeUtil);
        String grpString = "Groupes :   ";
        int counterSize = 0;
        for (String groupe : groupes){
            counterSize+= groupe.length();
            if(counterSize > 20){
                grpString+="\n";
                counterSize = 0;
            }
            grpString += "  #" + groupe;

        }
        textAreaGrp.setText(grpString);
        textAreaGrp.revalidate();
        if(isConnected){
            ImageIcon isConnectedPic = new ImageIcon("src/fr/igruserver/windowsServer/Pictures/isConnected.png");
            JLabel imgLabel = new JLabel(isConnectedPic);
            panelImg.add(imgLabel);
            imgLabel.setVisible(true);
            panelImg.repaint();
            panelImg.revalidate();

        }else{
            ImageIcon isNotConnectedPic = new ImageIcon("src/fr/igruserver/windowsServer/Pictures/isNotConnected.jpg");
            JLabel imgLabel = new JLabel(isNotConnectedPic);
            panelImg.add(imgLabel);
            imgLabel.setVisible(true);
            panelImg.revalidate();
        }
        this.revalidate();

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel3;
    private JPanel panel4;
    private JLabel labelUsername;
    private JPanel panelImg;
    private JLabel labelNomUtil;
    private JLabel labelTypeGrp;
    private JTextArea textAreaGrp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
