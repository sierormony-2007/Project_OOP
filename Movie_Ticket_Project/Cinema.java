/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cinema {
    Movie[] movies ;
    Showtime[] showtimes;
    Ticket[] tickets;
    Customer[] customers;
    BuyTicket[] buyTickets;
    Staff[] staffs;
    private String name;
    int menuCount=0;


    public Cinema(String name, int maxMovies){
        this.name = name;
        movies = new Movie[maxMovies];
        showtimes = new Showtime[maxMovies];
        menuCount = 0;
    }
    public void addMovie(int id, String title, double duration, String date, String time, String releaseDate){
        Movie movie = new Movie(id, title, duration, releaseDate);
        movies[menuCount] = movie;

        Showtime showtime = new Showtime(time, date, menuCount + 1, movie);
        showtimes[menuCount] = showtime;

        menuCount++;
        
    }

    public void printMovies(){
        System.out.println("Movies in " + name + ":");
        for(int i=0; i<menuCount; i++){
            System.out.println("Movie Id:" + movies[i].getId()+ ", Title: " + movies[i].getTitle() + ", Duration: " + movies[i].getDuration() + "h, Date: " + showtimes[i].getDate() + ", Time: " + showtimes[i].getTime() + ", Release Date: " + movies[i].getReleaseDate());
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

