import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame jFrame = new JFrame();
    JLabel l1 = new JLabel("0");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    int count = 0;

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == plus){
            System.out.println("plus is presseed");
            count++;
            l1.setText(String.valueOf(count));

        }
        else if(e.getSource() == minus){
            System.out.println("minus is pressed");
            count--;
            l1.setText(String.valueOf(count));

        }
    }

    public GUI(){

        l1.setBounds(200, 50, 100, 50);
        plus.setBounds(100, 200, 100, 50);
        minus.setBounds(250, 200, 100, 50);

        jFrame.add(l1);
        jFrame.add(plus);
        jFrame.add(minus);


        plus.addActionListener(this);
        minus.addActionListener(this);

        jFrame.setLocation(0,0);
        jFrame.setSize(700, 700);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        //setting the size
        new GUI();
    }
}