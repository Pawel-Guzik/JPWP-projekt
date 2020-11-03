package kolory;

import java.util.Timer;
import java.util.TimerTask;

public class Czas {

    static int sekundy = 10;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run(){
            sekundy--;
           //System.out.println(sekundy);
        }
    };

    public void start(){

        timer.scheduleAtFixedRate(task,1000,1000);

    }





}
