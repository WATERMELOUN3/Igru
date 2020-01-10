/*
 * Created by JFormDesigner on Thu Jan 09 09:55:28 CET 2020
 */

package fr.igru.windowsclient.MainWindow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import fr.igru.windowsclient.Champs.ch_FilDiscu.ch_FilDiscu;
import fr.igru.windowsclient.Champs.ch_Message.ch_Message;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JPanel {
    public MainWindow(String nom) {
        this.nom = nom;
        initComponents();
    }

    private void buttonSendActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void buttonNewThreadActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void buttonGrpActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        panel7 = new JPanel();
        labelTitre = new JLabel();
        panel2 = new JPanel();
        scrollPaneThread = new JScrollPane();
        panelFildeDiscussion = new JPanel();
        panel4 = new JPanel();
        scrollPaneMsg = new JScrollPane();
        panelMsg = new JPanel();
        panel5 = new JPanel();
        scrollPaneEditor = new JScrollPane();
        panel8 = new JPanel();
        textField1 = new JTextField();
        panel3 = new JPanel();
        buttonNewThread = new JButton();
        panel6 = new JPanel();
        buttonGrp = new JButton();
        buttonSend = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt.Color.red
            ),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName(
            )))throw new RuntimeException();}});
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "para[113:86,fill]unrel" +
                "[251:340,fill]para",
                // rows
                "[13:12]" +
                "[196:182]" +
                "[38:49]0" +
                "[30:12]"));

            //======== panel7 ========
            {
                panel7.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[]"));

                //---- labelTitre ----
                labelTitre.setText(" ");
                panel7.add(labelTitre, "cell 0 0,alignx center,growx 0");
            }
            panel1.add(panel7, "cell 0 0 2 1,growx");

            //======== panel2 ========
            {
                panel2.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
                panel2.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[fill]0",
                    // rows
                    "0[]0"));

                //======== scrollPaneThread ========
                {

                    //======== panelFildeDiscussion ========
                    {
                        panelFildeDiscussion.setLayout(new BoxLayout(panelFildeDiscussion, BoxLayout.X_AXIS));
                    }
                    scrollPaneThread.setViewportView(panelFildeDiscussion);
                }
                panel2.add(scrollPaneThread, "cell 0 0,aligny top,grow 100 0");
            }
            panel1.add(panel2, "cell 0 1 1 2,grow");

            //======== panel4 ========
            {
                panel4.setBorder(new LineBorder(SystemColor.activeCaption));
                panel4.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[280:280,fill]0",
                    // rows
                    "0[]0"));

                //======== scrollPaneMsg ========
                {

                    //======== panelMsg ========
                    {
                        panelMsg.setLayout(new BoxLayout(panelMsg, BoxLayout.X_AXIS));
                    }
                    scrollPaneMsg.setViewportView(panelMsg);
                }
                panel4.add(scrollPaneMsg, "cell 0 0,aligny top,grow 100 0");
            }
            panel1.add(panel4, "cell 1 1,grow");

            //======== panel5 ========
            {
                panel5.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[fill]0",
                    // rows
                    "0[]0"));

                //======== scrollPaneEditor ========
                {

                    //======== panel8 ========
                    {
                        panel8.setLayout(new MigLayout(
                            "fill,hidemode 3",
                            // columns
                            "0[fill]0",
                            // rows
                            "0[]0"));

                        //---- textField1 ----
                        textField1.setText("Ecrire le message ici...");
                        panel8.add(textField1, "cell 0 0,grow");
                    }
                    scrollPaneEditor.setViewportView(panel8);
                }
                panel5.add(scrollPaneEditor, "cell 0 0,grow");
            }
            panel1.add(panel5, "cell 1 2,grow");

            //======== panel3 ========
            {
                panel3.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "0[fill]",
                    // rows
                    "0[21!]"));

                //---- buttonNewThread ----
                buttonNewThread.setText("Nouveau ticket");
                buttonNewThread.addActionListener(e -> buttonNewThreadActionPerformed(e));
                panel3.add(buttonNewThread, "cell 0 0");
            }
            panel1.add(panel3, "cell 0 3,grow");

            //======== panel6 ========
            {
                panel6.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "0[28:35:21]"));

                //---- buttonGrp ----
                buttonGrp.setText("Mes groupes");
                buttonGrp.addActionListener(e -> buttonGrpActionPerformed(e));
                panel6.add(buttonGrp, "cell 0 0");

                //---- buttonSend ----
                buttonSend.setText("Envoyer");
                buttonSend.addActionListener(e -> buttonSendActionPerformed(e));
                panel6.add(buttonSend, "cell 2 0");
            }
            panel1.add(panel6, "cell 1 3,grow");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        labelTitre.setText(nom);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JPanel panel7;
    private JLabel labelTitre;
    private JPanel panel2;
    private JScrollPane scrollPaneThread;
    private JPanel panelFildeDiscussion;
    private JPanel panel4;
    private JScrollPane scrollPaneMsg;
    private JPanel panelMsg;
    private JPanel panel5;
    private JScrollPane scrollPaneEditor;
    private JPanel panel8;
    private JTextField textField1;
    private JPanel panel3;
    private JButton buttonNewThread;
    private JPanel panel6;
    private JButton buttonGrp;
    private JButton buttonSend;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    String nom;
    String FilCourant;

    public void displayThread(String titre, String groupe, int statut){
        ch_FilDiscu instanceThread = new ch_FilDiscu(titre,groupe,statut);
        instanceThread.setVisible(true);
        panelFildeDiscussion.add(instanceThread);
        panelFildeDiscussion.revalidate();
        scrollPaneThread.revalidate();
        this.revalidate();
    }

    public void displayMsg(String texte,String Auteur){
        ch_Message instanceMsg = new ch_Message(Auteur + " a écrit : " + texte);
        instanceMsg.setVisible(true);
        panelMsg.add(instanceMsg);
        panelMsg.revalidate();
        scrollPaneMsg.revalidate();
        this.revalidate();
    }
}
