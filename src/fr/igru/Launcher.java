package fr.igru;

import fr.igru.windowsclient.ConnectionDialog.ConnectionDialog;
import fr.igru.windowsclient.MainWindow.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        JFrame ecran = new JFrame();
        ecran.setMinimumSize(new Dimension(780, 400));

        ConnectionDialog connectionDialog = new ConnectionDialog();
        connectionDialog.setVisible(true);
        ecran.add(connectionDialog);
        ecran.setVisible(true);
    }
}
