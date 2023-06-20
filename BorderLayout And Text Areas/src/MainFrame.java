import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textpanel;
    private JButton b1;
    public MainFrame()
    {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
        setLayout(new BorderLayout());//using the BorderLayout layout manager

//        textarea = new TextArea();//creating instances of the private declarations;
        b1 = new JButton("Click me vro!");
        textpanel = new TextPanel();
        add(textpanel,BorderLayout.CENTER);
        add(b1,BorderLayout.SOUTH);//added locations

        //creating the action listener interface for the button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textpanel.appendText("Hello Parasar\n");
            }
        });
    }
}
