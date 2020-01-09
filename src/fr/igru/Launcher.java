package fr.igru;

import fr.igru.windowsclient.ConnectionDialog.connectionDialog;
import fr.igru.windowsclient.MainWindow.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        JFrame Ecran = new JFrame();
        Ecran.setMinimumSize(new Dimension(600,400));
        connectionDialog gui = new connectionDialog();
        Ecran.pack();
        gui.setVisible(true);
        Ecran.add(gui);
        Ecran.setVisible(true);
    }
}
