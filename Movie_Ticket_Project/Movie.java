public class Movie{
   private  int id;
    private String title;
    private double duration;
    private String releaseDate;
    private String genre;
    

    public Movie(int id, String title, double duration, String releaseDate){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
        
    }

   
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}