import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textpanel;
//    private JButton b1;
    private Toolbar toolbar;
    public MainFrame()
    {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
        setLayout(new BorderLayout());//using the BorderLayout layout manager

        textpanel = new TextPanel();
        toolbar = new Toolbar();

        toolbar.setStringListener(new StringListener() {
            public void textEmmited(String text) {
                textpanel.appendText(text);
            }
        });

        add(textpanel,BorderLayout.CENTER);
        add(toolbar,BorderLayout.NORTH);


    }
}
