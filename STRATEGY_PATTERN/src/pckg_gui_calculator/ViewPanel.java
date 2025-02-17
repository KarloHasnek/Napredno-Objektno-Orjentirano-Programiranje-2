package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    public void appendText(String result) {
        textArea.append(result + "\n");
    }

    public void clearText() {
        textArea.setText("\n");
    }
}
