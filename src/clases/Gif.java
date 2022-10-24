package clases;

import javax.swing.JLabel;

public class Gif extends Thread {

    private int posicionX;
    private int limite;
    private JLabel gif;

    public Gif(int posicionX, int limite, JLabel gif) {
        this.posicionX = posicionX;
        this.limite = limite;
        this.gif = gif;
    }

    public int getlimite() {
        return limite;

    }

    @Override
    public void run() {
        for (int i = posicionX; i < limite; i++) {
            gif.setBounds(i, posicionX - 120, 1276, 766);
            try {
                sleep(20);
            } catch (Exception e) {
            }
        }
    }
}
