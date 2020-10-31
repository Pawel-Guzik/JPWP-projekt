package kolory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener
{
    public Window()
    {
        setSize(1280,1024);
        setTitle("GRA W KOLORY");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void menu()              // funkcja dodaje przycisk menu
    {

        JButton start = new JButton("PLAY");
        start.setBackground(Color.CYAN);

        start.setPreferredSize(new Dimension(200,100));
        JPanel p = new JPanel();

        p.add(start);
        p.setBackground(Color.BLACK);

        this.add(p);

    }



    @Override
    public void actionPerformed(ActionEvent arg0)









}
