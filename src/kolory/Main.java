package kolory;


import java.util.Timer;
import java.util.TimerTask;

public class Main
{

    static Window game_window = new Window();

    public static void main(String[] args)
    {

        StartPanel menu = new StartPanel();
        game_window.add(menu);
        game_window.setVisible(true);


    }



}
