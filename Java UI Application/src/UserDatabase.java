import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDatabase {
    private List<User> users;

    public UserDatabase() throws FileNotFoundException {
        users = new ArrayList<>();
        File file = new File("users.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String username = parts[0];
            String password = parts[1];
            users.add(new User(username, password));
        }
        scanner.close();
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
