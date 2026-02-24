
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cinema {
    private Movie[] movies;
    private Showtime[] showtimes;
    private Ticket[] tickets;

    private String name;
    private int menuCount = 0;

    public static final String CREATE_MOVIE = "CREATE_MOVIE";
    public static final String SELL_TICKET = "SELL_TICKET";
    public static final String VIEW_MOVIES = "VIEW_MOVIES";

    private ArrayList<IStaff> staffs = new ArrayList<>();
    private IStaff loggedIStaff;


    public Cinema(String name, int maxMovies){
        this.name = name;
        movies = new Movie[maxMovies];
        showtimes = new Showtime[maxMovies];
        tickets = new Ticket[maxMovies];

        staffs.add(new Manager("M001", "manager1", "pass123"));
    }


    public boolean login(String username, String password) {
        for (IStaff staff : staffs) {
            if (staff.getUsername().equals(username) && staff.getPassword().equals(password)) {
                loggedIStaff = staff;
                return true;
            }
        }
        return false;
    }

    private boolean checkPermission(String action) {
        if (loggedIStaff == null) {
            System.out.println("No staff logged in.");
            return false;
        }
        if (!loggedIStaff.can(action)) {
            System.out.println("Permission denied for action: " + action);
            return false;
        }
        return true;
    }


    public void addMovie (int id, String title, double duration, String releaseDate, String showDate, String showTime){
        if (!checkPermission(CREATE_MOVIE)) return;
        
        Movie newMovie = new Movie(id, title, duration, releaseDate);
        movies[menuCount] = newMovie;


        Showtime showtime = new Showtime(showTime, showDate, menuCount + 1, newMovie);
        showtimes[menuCount] = showtime;

        menuCount++;

        System.out.println("Movie added successfully.");

    public void printMovies() {

        if (!checkPermission(VIEW_MOVIES)) return;

        System.out.println("Movies in " + name + ":");

        for (int i = 0; i < menuCount; i++) {
            System.out.println(
                    "Movie Id: " + movies[i].getId()
                    + ", Title: " + movies[i].getTitle()
                    + ", Duration: " + movies[i].getDuration() + "h"
                    + ", Date: " + showtimes[i].getDate()
                    + ", Time: " + showtimes[i].getTime()
                    + ", Release Date: " + movies[i].getReleaseDate()
            );
        }
    }
    Movie findMovieById(int id) {
      
        for (int i = 0; i < menuCount; i++) {
            if (movies[i].getId() == id) {
                return movies[i];
            }
        }
        return null; 
    }

    public void printTickets(){
        System.out.println("Tickets : "+ name);
        for (int i = 0; i<menuCount; i++){
            System.out.println("Ticket ID: "+ tickets[i].getTicketId() + ", Movie: "+ tickets[i].getMovie().getTitle() + ", Price: " + tickets[i].getPriceSnapshot() + ", Ticket Type: " + tickets[i].getTicketType());
        }
    }

    public String getName() {
        return name;
    }

    }
}

