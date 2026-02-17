import java.util.ArrayList;

public class Playlist {
    private String name;
    private int numFilms;
    private ArrayList<Movie> listOfFilms;

    public Playlist() {
        this.name = "";
        this.listOfFilms = new ArrayList<Movie>();
    }

    public Playlist(String name, ArrayList<Movie> listOfFilms) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumFilms() {
        return listOfFilms.size();
    }

    public ArrayList<Movie> getPlaylist() {
        return new ArrayList<>(listOfFilms);
    }

    public void addMovie(Movie movie) {
        listOfFilms.add(movie);
    }

    public double averageScore(ArrayList<Movie> listOfFilms) {
        int mean = 0;

        for (Movie movie : listOfFilms) {
            mean += movie.getPoints();
        }

        return (double) mean / listOfFilms.size();
    }

    @Override
    public String toString() {
        String res = getName() + ", Number of movies: " + getNumFilms() + '\n';

        for (Movie movie : listOfFilms) {
            res += " " + movie.toString() + "\n";
        }

        return res;
    }
}
