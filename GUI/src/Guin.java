import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guin implements ActionListener {
    JFrame jFrame = new JFrame();
    JLabel userName = new JLabel();
    JLabel password = new JLabel();
    JTextField userNameInput = new JTextField();
    JTextField passwordInput = new JTextField();
    JButton login = new JButton();
    //implementing the method inside Actionlistener interface

    public void actionPerformed(ActionEvent e){
        if(userNameInput.getText() == "abc" && passwordInput.getText() == "123"){
            System.out.println("successful");
        }
        else System.out.println("try again");
    }
    public Guin(){

        //setting boundaries for components
        userName.setBounds(50, 50, 100, 100);
        userNameInput.setBounds(200, 50, 100, 100);
        password.setBounds(50, 200 , 100, 100);
        passwordInput.setBounds(200, 200, 100, 100);
        login.setBounds(100, 350, 100, 100);

        //adding the components to the container
        jFrame.add(userName);
        jFrame.add(userNameInput);
        jFrame.add(password);
        jFrame.add(passwordInput);
        jFrame.add(login);

        //setting text for the labels and buttons
        userName.setText("username");
        password.setText("password");
        login.setText("login");

        login.addActionListener(this);


        jFrame.setLocation(50, 50);
        jFrame.setSize(700, 700);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
//        new Guin();
        String s1 = "abc";
        String s2 = new String("abc");
        if(s1 == s2) System.out.println("yes");
        else System.out.println("no");
    }
}