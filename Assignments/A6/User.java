import java.sql.Array;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private int credit;
    private ArrayList<Playlist> listOfPlaylists;

    public User() {
        this.username = "";
        this.password = "";
        this.credit = 0;
        this.listOfPlaylists = new ArrayList<Playlist>();
    }

    public User(String username, String password, int credit, ArrayList<Playlist> listOfPlaylists) {
        setUsername(username);
        setPassword(password);
        setCredit(credit);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public int getCredit() {
        return this.credit;
    }

    public ArrayList<Playlist> getListOfPlaylists() {
        return new ArrayList<>(listOfPlaylists);
    }

    public void addPlaylist(Playlist playlist) {
        this.listOfPlaylists.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        this.listOfPlaylists.remove(playlist);
    }

    public void increaseCredit(int amount) {
        this.credit += amount;
    }

    public void decreaseCredit(int amount) {
        this.credit -= amount;
    }

    @Override
    public String toString() {
        String res = "User: " + username +
                "\nCredit: " + credit +
                "\nPlaylists:\n";

        for (Playlist playlist : listOfPlaylists) {
            res += playlist.toString();
        }

        return res;
    }
}
