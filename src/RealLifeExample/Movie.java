package RealLifeExample;

public class Movie {
	
	private String movieName;
	private Integer ratings;
	
	public String getMovieName() {
		return movieName;
	}
	
	public Movie(String movieName, Integer ratings) {
		super();
		this.movieName = movieName;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", ratings=" + ratings + "]";
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getRatings() {
		return ratings;
	}
	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}
	
	

}
