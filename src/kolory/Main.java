package kolory;


import java.util.Timer;
import java.util.TimerTask;

public class Main
{

    static Window game_window = new Window();
    static Plansza gra;
    static Koniec koniec;
    static StartPanel menu;

    public static void main(String[] args)
    {

        System.out.println("sdadsaddddddddd");
        menu = new StartPanel();
        game_window.add(menu);

        game_window.setVisible(true);



    }



}
