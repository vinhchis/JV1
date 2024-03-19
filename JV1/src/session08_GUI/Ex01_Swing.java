package session08_GUI;

import javax.swing.JFrame;

public class Ex01_Swing extends JFrame {
    public Ex01_Swing() {
        this.setTitle("JFrame");
        this.setVisible(true);
        this.setSize(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex01_Swing();
    }
}
