import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textpanel;
    private Toolbar toolbar;

    private FormPanel formpanel;
    public MainFrame()
    {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
        setLayout(new BorderLayout());//using the BorderLayout layout manager

        textpanel = new TextPanel();
        toolbar = new Toolbar();
        formpanel = new FormPanel();

        toolbar.setStringListener(new StringListener() {
            public void textEmmited(String text) {
                textpanel.appendText(text);
            }
        });
        formpanel.setFormListener(new FormListener() {
            public void formEvent(FormEvent e) {
                String name = e.getName();
                String occupation = e.getOccupation();
                textpanel.appendText(name + " : "+occupation+ "\n");
            }
        });

        add(textpanel,BorderLayout.CENTER);
        add(toolbar,BorderLayout.NORTH);
        add(formpanel,BorderLayout.WEST);


    }
}
