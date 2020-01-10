package fr.igruserver;

import fr.igruserver.windowsServer.MainServerWindow.MainServerWindow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Launcher {
    public static void main(String[] args) throws InterruptedException {
        JFrame ecran = new JFrame();
        ecran.setMinimumSize(new Dimension(780, 400));

        MainServerWindow mainServerWindow = new MainServerWindow();
        mainServerWindow.setVisible(true);
        ecran.add(mainServerWindow);
        ecran.setVisible(true);
        mainServerWindow.displayGrp("Chasse");
        ecran.revalidate();
        TimeUnit.SECONDS.sleep(3);
        mainServerWindow.displayGrp("Peche");
        mainServerWindow.displayUtil("Toto","Mathieu Brossard","Campus", new ArrayList<String>(Arrays.asList("Dance", "Ping Pong", "Java pour les nuls","Le Code Français ","Patate","lui")),false);
        mainServerWindow.displayUtil("Toto","Mathieu Brossard","Campus", new ArrayList<String>(Arrays.asList("Dance", "Ping Pong", "Java pour les nuls","Le Code Français ","Patate","lui")),false);
        ecran.revalidate();


    }
}
