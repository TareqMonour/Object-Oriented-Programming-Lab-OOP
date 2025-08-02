import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_theory implements ActionListener {
    JFrame jFrame = new JFrame();
    JLabel userName = new JLabel();
    JTextField userNameInput = new JTextField();
    JLabel password = new JLabel();
    JTextField passwordInput = new JTextField();
    JButton login = new JButton();
    JLabel showText = new JLabel();

    public void actionPerformed(ActionEvent e){
        if(userNameInput.getText().equals("abc") && passwordInput.getText().equals("123")){
            showText.setText("successfull");
        }
        else showText.setText("try again");
    }
    public GUI_theory(){
        //setting size of the components
        userName.setBounds(50, 50, 150, 50);
        userNameInput.setBounds(250, 50, 150, 50);
        password.setBounds(50, 150, 150, 50);
        passwordInput.setBounds(250, 150, 150, 50);
        login.setBounds(100, 250, 150, 100);
        showText.setBounds(100, 500, 150, 100);

        //adding the components
        jFrame.add(userName);
        jFrame.add(userNameInput);
        jFrame.add(password);
        jFrame.add(passwordInput);
        jFrame.add(login);
        jFrame.add(showText);

        //setting the names
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
        new GUI_theory();
    }
}
