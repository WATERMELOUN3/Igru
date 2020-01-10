/*
 * Created by JFormDesigner on Thu Jan 09 10:00:02 CET 2020
 */

package fr.igru.windowsclient.Champs.ch_Message;

import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

import java.awt.*;

/**
 * @author unknown
 */
public class ch_Message extends JPanel {
    public ch_Message(String txtMessage, int statut) {
        initComponents(txtMessage,statut);
    }

    private void initComponents(String txtMessage, int statut) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textArea1 = new JTextArea();

        //======== this ========
        setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , " ", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        //---- textArea1 ----
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textArea1.setBorder(null);
        add(textArea1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        textArea1.setText(txtMessage);
        textArea1.setVisible(true);
        System.out.println(txtMessage);
        changeStatus(statut);
        this.revalidate();
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void changeStatus(int newStatus){
        System.out.println(newStatus);
        switch(newStatus){
            case 1 :  textArea1.setBackground(Color.red);break;//message pas encore recu par tout le monde
            case 2 :  textArea1.setBackground(Color.orange);break; //message pas encore lu par tout le monde
            case 3 : textArea1.setBackground(Color.green);break;//Message lu par tous le monde
            default:
                this. textArea1.setBackground(Color.LIGHT_GRAY);break; //Message pas encore recu par le serveur
        }
    }
}
