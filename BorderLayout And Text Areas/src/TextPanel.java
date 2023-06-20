import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textarea;

    public TextPanel() {
        textarea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textarea), BorderLayout.CENTER);
    }
    public void appendText(String text){
        textarea.append(text);
    }
}

