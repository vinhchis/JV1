package session08_GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex02_Swing_Event extends JFrame implements ActionListener {
    JPanel panel;
    JButton btnOK;
    JButton btnCancel;

    public Ex02_Swing_Event() {
        this.setTitle("JFrame");
        this.setVisible(true);
        this.setSize(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.initComponents();
    }

    private void initComponents() {
        panel = new JPanel();
        btnOK  = new JButton("OK");
        btnCancel = new JButton("Cancel");

        panel.add(btnOK);
        panel.add(btnCancel);

        this.add(panel);

        btnOK.addActionListener(this);
        btnCancel.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == btnOK){
        JOptionPane.showMessageDialog(this, "Welcome my Application");
      }
      else{
        JOptionPane.showMessageDialog(this, "Goodbye!!");

      }
    }

    public static void main(String[] args) {
        new Ex02_Swing_Event();
    }

   
}
