/*
 * Created by JFormDesigner on Thu Jan 09 09:59:07 CET 2020
 */

package fr.igru.windowsclient.Champs.ch_FilDiscu;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

import java.awt.*;

/**
 * @author unknown
 */
public class ch_FilDiscu extends JPanel {
    public ch_FilDiscu(String titre, String Grp, int statut ) {
        initComponents(titre,Grp,statut);
    }

    private void panel1MouseClicked(MouseEvent e) {
        // TODO trouver tt les messages provenant du fil de discussion et les ajouter 1 par 1 dans l'ordre
    }

    private void initComponents(String titre, String Grp, int statut) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textAreaNomFil = new JTextArea();
        panel2 = new JPanel();
        labelGrp = new JLabel();
        panel3 = new JPanel();

        //======== this ========
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel1MouseClicked(e);
            }
        });
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , " ", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "0[fill]0",
            // rows
            "0[18:56]" +
            "[18:n]0"));

        //---- textAreaNomFil ----
        textAreaNomFil.setOpaque(false);
        textAreaNomFil.setEditable(false);
        add(textAreaNomFil, "cell 0 0,grow");

        //======== panel2 ========
        {
            panel2.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "0[125,fill]" +
                "[fill]0",
                // rows
                "0[]0"));

            //---- labelGrp ----
            labelGrp.setText(" ");
            labelGrp.setOpaque(true);
            panel2.add(labelGrp, "cell 0 0");

            //======== panel3 ========
            {
                panel3.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[26:26,fill]0",
                    // rows
                    "0[26:26]0"));
            }
            panel2.add(panel3, "cell 1 0");
        }
        add(panel2, "cell 0 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        textAreaNomFil.setText(titre);
        labelGrp.setText(Grp);
        changeStatus(statut);
        textAreaNomFil.setVisible(true);
        labelGrp.setVisible(true);
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextArea textAreaNomFil;
    private JPanel panel2;
    private JLabel labelGrp;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void changeStatus(int newStatus){
        switch(newStatus){
            case 1 :  this.setBackground(Color.red);labelGrp.setBackground(Color.red);panel2.setBackground(Color.red);panel3.setBackground(Color.red);break;//message pas encore recu par tout le monde
            case 2 : this.setBackground(Color.orange);labelGrp.setBackground(Color.orange);panel2.setBackground(Color.orange);panel3.setBackground(Color.orange);break; //message pas encore lu par tout le monde
            case 3 : this.setBackground(Color.green);labelGrp.setBackground(Color.green); panel2.setBackground(Color.green);panel3.setBackground(Color.green);break;//Message lu par tous le monde
            default:
                this.setBackground(Color.lightGray);labelGrp.setBackground(Color.lightGray);panel2.setBackground(Color.lightGray);panel3.setBackground(Color.lightGray);break; //Message pas encore recu par le serveur
        }
    }
}
