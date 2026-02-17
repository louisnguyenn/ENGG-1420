import java.util.ArrayList;

public class ManageUsers {
    private ArrayList<User> userList;

    public ManageUsers() {
        this.userList = new ArrayList<User>();
    }

    public ArrayList<User> getUserList() {
        return new ArrayList<>(userList);
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public void removeUser(User user) {
        this.userList.remove(user);
    }

    @Override
    public String toString() {
        String res = "All Users: \n";

        for (User user : userList) {
            res += user.toString() + '\n';
        }

        return res;
    }

    public boolean checkUserExistence(String username) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }

        return false;
    }

}
