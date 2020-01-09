package fr.igruserver;

import fr.igruserver.windowsServer.MainServerWindow.MainServerWindow;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        JFrame ecran = new JFrame();
        ecran.setMinimumSize(new Dimension(780, 400));

        MainServerWindow mainServerWindow = new MainServerWindow();
        mainServerWindow.setVisible(true);
        ecran.add(mainServerWindow);
        ecran.setVisible(true);
        mainServerWindow.displayGrp("Chasse");
    }
}
