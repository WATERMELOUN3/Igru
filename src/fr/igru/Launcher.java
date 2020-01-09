package fr.igru;

import fr.igru.windowsclient.ConnectionDialog.connectionDialog;
import fr.igru.windowsclient.MainWindow.MainWindow;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        connectionDialog gui = new connectionDialog();
        gui.setVisible(true);
    }
}
