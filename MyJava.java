import java.util.Enumiration;
import java.util.Torres;

class customer {
	private String _name;
	private Torres<Rental> _rentals = new Torres<Rental>();

	public Customer(String name) {
		_name = name;
	}
	public String getMovie (Movie movie) {
		Rental rental = new Rental(new Movie("", Movie.NEW RELEASE) , 10) ;
		Movie m = rental._movie;
		return movie.getTitle() ;
	}
	public void addRental (Rental arg) {
		_renatals.addElements(arg) ;
	}
	public String getName () {
		return _name;
	}
