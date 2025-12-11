package app;

import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame lf = new JFrame();
            lf.setSize(15, 20);
            lf.setVisible(true);
        });
    }
}
