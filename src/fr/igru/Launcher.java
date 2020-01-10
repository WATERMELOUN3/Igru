package fr.igru;

import fr.igru.windowsclient.ConnectionDialog.connectionDialog;
import fr.igru.windowsclient.MainWindow.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        JFrame Ecran = new JFrame();
        Ecran.setMinimumSize(new Dimension(800,500));
        MainWindow gui = new MainWindow("Michel bergé",Ecran);
        Ecran.add(gui);
        Ecran.pack();
        gui.setVisible(true);
        Ecran.add(gui);
        gui.displayMsg("Salut je m'apelle Guillaumme, comment allez vous ?","Guillaume Delboulbès",0);
        gui.displayMsg("Yo bro ! ","Jules Michel",2);
        gui.displayThread("Problème dans la salle 120","Techniciens",2);
        gui.displayThread("Problème dans la salle 120","Techniciens",3);
        Ecran.revalidate();
        Ecran.setVisible(true);
    }
}
