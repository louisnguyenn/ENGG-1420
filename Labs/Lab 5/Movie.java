public class Movie {
    private String name;
    private int points;
    public enum Genre {
        HORROR,
        DRAMA,
        COMEDY,
        ACTION
    }
    private Genre genre;


    public Movie() {
        this.name = "";
        this.points = 0;
    }

    public Movie(String name, int points, Genre genre) {
        setName(name);
        setPoints(points);
        setGenre(genre);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public Genre getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return "Movie name: " + name +
                ", Genre: " + genre +
                ", Points: " + points;
    }
}
