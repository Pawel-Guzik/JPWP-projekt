package kolory;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;


public class Plansza extends javax.swing.JPanel {


    Color dark_magneta =  new java.awt.Color(139, 0, 139);
    Color indigo =  new java.awt.Color(75, 0, 130);
    Color sky_blue =  new java.awt.Color(135, 206, 235);
    Color teal =  new java.awt.Color(0, 128, 128);
    Color lime = new java.awt.Color(0, 255, 0);
    Color green = new java.awt.Color(0, 128, 0);
    Color dark_olive_green = new java.awt.Color(85, 107, 47);
    Color maroon = new java.awt.Color(128, 0, 0);
    Color sandy_brown = new java.awt.Color(244, 164, 96);
    Color wheat = new java.awt.Color(245, 222, 179);
    Color sienna = new java.awt.Color(160, 82, 45);
    Color gold = new java.awt.Color(255, 215, 0);
    Color orange_red = new java.awt.Color(255, 69, 0);





    private Color[] kolory = {dark_magneta, Color.MAGENTA, indigo, Color.BLUE, sky_blue, lime, green, Color.RED, maroon, sandy_brown, wheat, sienna, gold, dark_olive_green, teal, orange_red};
    int liczba_kolorow = 16;
    static int liczba_punktow = 0;
    int wylosowany_przycisk = 2;
    boolean wybrano = false;
    static public float sekundy = 10;
    public static boolean koniec_rundy = false;
    int wybrany_kolor =0;
    int buf = 0;
    static int poziom = 0;
    int licznik_czasu = 0;
    int po_jakim_czasie_zmiana = 10;
    static boolean koniec_gry = false;

    JButton buttons[] = new JButton[16];

    public Plansza() {
        initComponents();
        gra();

    }


   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {


        jPanelButtons = new javax.swing.JPanel();
        jPanelUpSet = new javax.swing.JPanel();
        jPanelWybranyKolor = new javax.swing.JPanel();


        jTextField1 = new javax.swing.JTextField();
        jTextField1.setEditable(false);
        jTextField1.setBackground(Color.darkGray);
        jTextField1.setForeground(new java.awt.Color(230, 230, 250));


        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBackground(Color.darkGray);
        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(230, 230, 250));


        setBackground(new java.awt.Color(0, 0, 0));

        jPanelButtons.setBackground(new java.awt.Color(0, 0, 0));
        jPanelButtons.setLayout(new java.awt.GridLayout(4, 4));


        for(int i = 0; i<16; i++){

            buttons[i] = new JButton();
            buttons[i].setBackground(Color.darkGray);
            jPanelButtons.add(buttons[i]);
            buttons[i].addActionListener(this::actionPerformed);

        }

        jPanelUpSet.setBackground(Color.BLACK);



        javax.swing.GroupLayout jPanelWybranyKolorLayout = new javax.swing.GroupLayout(jPanelWybranyKolor);
        jPanelWybranyKolor.setLayout(jPanelWybranyKolorLayout);
        jPanelWybranyKolorLayout.setHorizontalGroup(
                jPanelWybranyKolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanelWybranyKolorLayout.setVerticalGroup(
                jPanelWybranyKolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 224, Short.MAX_VALUE)
        );

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);



        jTextField2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");



        javax.swing.GroupLayout jPanelUpSetLayout = new javax.swing.GroupLayout(jPanelUpSet);
        jPanelUpSet.setLayout(jPanelUpSetLayout);
        jPanelUpSetLayout.setHorizontalGroup(
                jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1139, Short.MAX_VALUE)
                        .addGroup(jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpSetLayout.createSequentialGroup()
                                        .addContainerGap(289, Short.MAX_VALUE)
                                        .addComponent(jPanelWybranyKolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(288, Short.MAX_VALUE)))
                        .addGroup(jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpSetLayout.createSequentialGroup()
                                        .addContainerGap(869, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(38, Short.MAX_VALUE)))
                        .addGroup(jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpSetLayout.createSequentialGroup()
                                        .addContainerGap(39, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(872, Short.MAX_VALUE)))
        );
        jPanelUpSetLayout.setVerticalGroup(
                jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 236, Short.MAX_VALUE)
                        .addGroup(jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpSetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanelWybranyKolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
                        .addGroup(jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpSetLayout.createSequentialGroup()
                                        .addContainerGap(46, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(46, Short.MAX_VALUE)))
                        .addGroup(jPanelUpSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpSetLayout.createSequentialGroup()
                                        .addContainerGap(50, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(44, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanelUpSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 1139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelUpSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
    }// </editor-fold>


    public float gra(){
        Main.koniec = new Koniec();
        Main.koniec.setVisible(false);

        jTextField1.setText(String.valueOf(sekundy));
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            public void run() {
                

                if (sekundy > 0) {
                    jTextField2.setText(String.valueOf(liczba_punktow));
                    licznik_czasu++;
                    // formatowanie  czasu
                    sekundy = (float)(sekundy - 0.1);
                    sekundy *= 10;
                    sekundy = Math.round(sekundy);
                    sekundy /= 10;
                    // koniec formatowania czasu
                    jTextField1.setText(String.valueOf(sekundy));

                    if(licznik_czasu == po_jakim_czasie_zmiana){
                        licznik_czasu = 0;
                        for(int i = 0; i<16; i++){
                            buttons[i].setBackground(Color.darkGray);
                        }
                        //poziom_pierwszy();
                        biezacy_poziom();
                    }

                    if(wybrano == false) {
                        wybrano = true;

                        biezacy_poziom();
                    }
                        if(poziom == 2) {
                            koniec_gry = true;
                        }

                } else {


                    if(liczba_punktow >= 7 && poziom ==1){
                        sekundy = 15;
                        poziom = 2;
                        po_jakim_czasie_zmiana = 16;
                        biezacy_poziom();
                    }
                    if(liczba_punktow >=7  && poziom ==0){

                        sekundy = 3;
                        poziom = 1;
                        po_jakim_czasie_zmiana = 16;
                        biezacy_poziom();

                    }
                    if((poziom == 2 && koniec_gry == true) || (poziom==0 && liczba_punktow<7)) {
                        poziom = 0;

                        Main.gra.setVisible(false);
                        Main.koniec.setVisible(true);
                        Main.game_window.add(Main.koniec);
                        Main.koniec.revalidate();
                        Main.koniec.repaint();
                        Main.koniec.jTextField1.setText("Twoje punkty: " + String.valueOf(liczba_punktow));
                    }




                    jTextField1.setText("0");
                    koniec_rundy = true;
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,100);
        return sekundy;


    }


    public void actionPerformed(java.awt.event.ActionEvent e) {
        Object source = e.getSource();
        if(source == buttons[wylosowany_przycisk] && sekundy> 0){
            licznik_czasu = 0;
            for(int i = 0; i<16; i++){
                buttons[i].setBackground(Color.darkGray);
            }
            liczba_punktow++;
            jTextField2.setText(String.valueOf(liczba_punktow));
            biezacy_poziom();
            //poziom_pierwszy();
            //poziom_drugi();
        }
    }

    public int losowanie_przycisku() {
        int los = 0;
        los = new Random().nextInt(16);
        System.out.println("wylosowany = " + los);
        return los;
    }





    public void poziom_pierwszy() {
        wybrany_kolor = new Random().nextInt(liczba_kolorow);
        jPanelWybranyKolor.setBackground(kolory[wybrany_kolor]);
        wylosowany_przycisk = losowanie_przycisku();
        buttons[wylosowany_przycisk].setBackground(kolory[wybrany_kolor]);

        List<Color> uzyte_kolory = new ArrayList<>();               // kolory ktorych mozna uzyc na inne przyciski

        for(int i = 0; i<liczba_kolorow; i++){
            uzyte_kolory.add(kolory[i]);
        }

        uzyte_kolory.remove(wybrany_kolor);                     // usuwa kolor ktory został wybrany dla przycisku


        int ile_przeszkod = 0;
        ile_przeszkod = new Random().nextInt(3);
        ile_przeszkod++;                                    // losuje ile dodatkowych przyciskow (utrudniaczy sie wyswietli)

        int ktory_kolor = 0;

        List<Integer> swiecace_przyciski = new ArrayList<Integer>();
        swiecace_przyciski.add(wylosowany_przycisk);        // dodaje przycisk ktory wyswietla prawidlowy kolor do tablicy z czynnymi przyciskami

        int kolejny_przycisk = 0;

        for(int i=0; i<ile_przeszkod; i++){
            boolean pom = false;
            ktory_kolor = new Random().nextInt(uzyte_kolory.size());    // losuje ktory z kolorow zostanie wyswietlony na przcisku przeszkadzajacym
            kolejny_przycisk = new Random().nextInt(16);
            while(pom == false) {
                if (swiecace_przyciski.contains(kolejny_przycisk) == true) {
                    kolejny_przycisk = new Random().nextInt(16);
                }else {
                    pom = true;
                }
            }

            swiecace_przyciski.add(kolejny_przycisk);
            buttons[kolejny_przycisk].setBackground(uzyte_kolory.get(ktory_kolor));
            uzyte_kolory.remove(ktory_kolor);
        }

    }



    public void poziom_drugi(){
        wybrany_kolor = new Random().nextInt(liczba_kolorow);
        jPanelWybranyKolor.setBackground(kolory[wybrany_kolor]);
        wylosowany_przycisk = losowanie_przycisku();

        List<Color> uzyte_kolory = new ArrayList<>();               // kolory ktorych mozna uzyc na inne przyciski

        for(int i = 0; i<liczba_kolorow; i++){
            uzyte_kolory.add(kolory[i]);
        }

        Collections.shuffle(uzyte_kolory);

        int j = 0;
        for(int i=0; i<16; i++){

            if(i == wylosowany_przycisk){
                buttons[i].setBackground(kolory[wybrany_kolor]);
                continue;
            }
            if(uzyte_kolory.get(j) ==kolory[wybrany_kolor]){
                j++;
            }
            buttons[i].setBackground(uzyte_kolory.get(j));
            j++;
        }
    }

    public void biezacy_poziom(){
        if(poziom == 0){
            poziom_pierwszy();
        }else if(poziom == 1){
            przerwa();
        }else if(poziom == 2){
            poziom_drugi();
        }
    }

    public void przerwa(){
        for(int i = 0; i<16; i++){
            buttons[i].setBackground(Color.darkGray);
        }

        jPanelWybranyKolor.setBackground(Color.BLACK);

    }


    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelUpSet;
    private javax.swing.JPanel jPanelWybranyKolor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
}
