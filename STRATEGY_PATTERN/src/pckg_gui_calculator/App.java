package pckg_gui_calculator;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mainframe();
            }
        });
    }
}
