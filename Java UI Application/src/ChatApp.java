import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChatApp extends JFrame implements ActionListener {
    private UserDatabase userDatabase;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton serverButton;
    private JButton clientButton;

    public ChatApp() throws FileNotFoundException {
        super("Chat App");

        userDatabase = new UserDatabase();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel, BorderLayout.WEST);

        usernameField = new JTextField(20);
        panel.add(usernameField, BorderLayout.CENTER);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel, BorderLayout.WEST);

        passwordField = new JPasswordField(20);
        panel.add(passwordField, BorderLayout.CENTER);

        serverButton = new JButton("Server");
        serverButton.addActionListener(this);
        panel.add(serverButton, BorderLayout.WEST);

        clientButton = new JButton("Client");
        clientButton.addActionListener(this);
        panel.add(clientButton, BorderLayout.EAST);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        User user = userDatabase.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            if (event.getSource() == serverButton) {

            } else if (event.getSource() == clientButton);
        }
    }
}