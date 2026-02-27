
import java.util.ArrayList;

public class Cinema {
    // private Movie[] movies;
    // private Showtime[] showtimes;
    // private Ticket[] tickets;

    

    
    public static final String CREATE_MOVIE = "CREATE_MOVIE";
    public static final String SELL_TICKET = "SELL_TICKET";
    public static final String CHECK_MOVIES = "CHECK_MOVIES";
    public static final String UPDATE_MOVIE = "UPDATE_MOVIE";
    public static final String DELETE_MOVIE = "DELETE_MOVIE";
    public static final String CHECK_TICKET = "CHECK_TICKET";
    

    public static String getCREATE_MOVIE() {
        return CREATE_MOVIE;
    }

    public static String getSELL_TICKET() {
        return SELL_TICKET;
    }

    public static String getCHECK_MOVIES() {
        return CHECK_MOVIES;
    }

    public static String getUPDATE_MOVIE() {
        return UPDATE_MOVIE;
    }

    public static String getDELETE_MOVIE() {
        return DELETE_MOVIE;
    }

    public static String getVIEW_TICKETS() {
        return VIEW_TICKETS;
    }

    public static String getCHECK_TICKET() {
        return CHECK_TICKET;
    }

    private ArrayList<IStaff> staffs = new ArrayList<>();
   

    // basic info
    private String cinemaName;
    private int menuCount = 0;

// arraylist for movies, showtimes, tickets
    private ArrayList<Movie> movies;
    private ArrayList<Showtime> showtimes;
    private ArrayList<Ticket> tickets;

// logged in staff
     private IStaff loggedIStaff;

    public Cinema(String name) {
        this.cinemaName = name;
        this.movies = new ArrayList<>();
        this.showtimes = new ArrayList<>();
        this.tickets = new ArrayList<>();      
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public ArrayList<IStaff> getStaffs() {
        return staffs;
    }

    public int getMenuCount() {
        return menuCount;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Showtime> getShowtimes() {
        return showtimes;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public IStaff getLoggedIStaff() {
        return loggedIStaff;
    }

   
    }

