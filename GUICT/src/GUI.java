import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI implements ActionListener {

    JFrame jFrame = new JFrame();

    JLabel display = new JLabel();
    JButton one = new JButton();
    JButton two = new JButton();
    JButton three = new JButton();
    JButton four = new JButton();
    JButton plus = new JButton();
    JButton minus = new JButton();
    JButton equal = new JButton();
    JLabel output = new JLabel();
    String s = "";

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == one){
            s = s + "1";
            display.setText(s);
        }
        else if(e.getSource() == two) {
            s = s + "2";
            display.setText(s);
        }
        else if(e.getSource() == three) {
            s = s + "3";
            display.setText(s);
        }
        else if(e.getSource() == four) {
            s = s + "4";
            display.setText(s);
        }
        else if(e.getSource() == plus) {
            s = s + " + ";
            display.setText(s);
        }
        else if(e.getSource() == minus) {
            s = s + " - ";
            display.setText(s);
        }
        else{
            String s1[] = s.split(" ");
            if(s1[1].equals("+")){
                int a = Integer.parseInt(s1[0]) + Integer.parseInt(s1[2]);
                output.setText(String.valueOf(a));
            }
            else if(s1[1].equals("-")){
                int a = Integer.parseInt(s1[0]) - Integer.parseInt(s1[2]);
                output.setText(String.valueOf(a));
            }
        }
    }

    public GUI(){

        //setting location and size for the components
        display.setBounds(50, 50, 150, 50);
        one.setBounds(50, 150, 50, 50);
        two.setBounds(100, 150, 50, 50);
        three.setBounds(50, 250, 50, 50);
        four.setBounds(100, 250, 50, 50);
        plus.setBounds(50, 350, 50, 50);
        minus.setBounds(100 ,350, 50, 50);
        equal.setBounds(50, 450, 50, 50);
        output.setBounds(50, 550, 50, 50);

        //adding button for action listening
        jFrame.add(display);
        jFrame.add(one);
        jFrame.add(two);
        jFrame.add(three);
        jFrame.add(four);
        jFrame.add(plus);
        jFrame.add(minus);
        jFrame.add(equal);
        jFrame.add(output);

        //setting the text
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        plus.setText("+");
        minus.setText("-");
        equal.setText("=");

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        equal.addActionListener(this);



        jFrame.setLocation(50, 50);
        jFrame.setSize(700, 700);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }
}