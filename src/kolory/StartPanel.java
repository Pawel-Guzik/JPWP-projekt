
package kolory;

public class StartPanel extends javax.swing.JPanel {


    public StartPanel() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButtonStart = new javax.swing.JButton();
        jButtonStart.addActionListener(this::actionPerformed);

        setBackground(new java.awt.Color(0, 0, 0));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("COLOR GAME");

        jButtonStart.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonStart.setText("START GAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(429, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(417, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(430, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(532, Short.MAX_VALUE)
                                .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(334, 334, 334))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(213, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(655, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    public void actionPerformed(java.awt.event.ActionEvent e) {
        Object source = e.getSource();
        System.out.println(source);
        if(source == jButtonStart){
            this.setVisible(false);
            Plansza gra = new Plansza();
            Main.game_window.add(gra);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonStart;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}
