public class Program {
    public static void main(String[] args) {
        ManageUsers userList = new ManageUsers();

//        create the movie
        Movie movie = new Movie();
        movie.setName("Bleach");
        movie.setPoints(200);
        movie.setGenre(Movie.Genre.ACTION);

//        create playlist and add the movie object
        Playlist playlist = new Playlist();
        playlist.setName("Vibing");
        playlist.addMovie(movie);

//        create user and add the list of objects of type playlist to the user
        User user = new User();
        user.setUsername("Louis");
        user.setPassword("admin");
        user.setCredit(100);
        user.addPlaylist(playlist);

//        add the user to the list of user objects
        userList.addUser(user);

        System.out.println(userList);
    }
}
