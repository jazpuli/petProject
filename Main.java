import java.util.ArrayList;

import backend.ConcreteUser;
import backend.User;
import frontend.frames.MainFrame;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new ConcreteUser("jazmin", "12345"));
        new MainFrame(users);
    }
}