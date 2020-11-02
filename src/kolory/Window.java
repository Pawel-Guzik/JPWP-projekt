package kolory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Window extends JFrame implements ActionListener
{
    private JButton start;
    private JPanel p;
//    private JPanel g;


    public Window()
    {
        setSize(1280,1024);
        setTitle("GRA W KOLORY");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




    public void menu()              // funkcja dodaje przycisk menu
    {

        start = new JButton("PLAY");
        start.setBackground(Color.CYAN);
        start.setPreferredSize(new Dimension(200,100));
        start.addActionListener(this);

        p = new JPanel();
        p.add(start);
        p.setBackground(Color.BLACK);
        this.add(p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == start)
        {
            System.out.println("kutas");
            p.setVisible(false);
        }else {
            System.out.println("siki");
        }
    }







}
