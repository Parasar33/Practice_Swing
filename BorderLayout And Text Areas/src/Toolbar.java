import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton byeButton;
    private StringListener textlistener;
    public Toolbar()
    {
        helloButton = new JButton("hello");
        byeButton = new JButton("bye");

        helloButton.addActionListener(this);
        byeButton.addActionListener(this);
        //using flow layout manager
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(byeButton);
    }

    public void setStringListener(StringListener listener)
    {
        this.textlistener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();
        if(clicked==helloButton)
        {
            if(textlistener != null)
            {
                textlistener.textEmmited("Hello Parasar\n");
            }
        }
        else if(clicked==byeButton)
        {
            if(textlistener != null)
            {
                textlistener.textEmmited("Bye Parasar\n");
            }
        }
    }
}
