package hibernate.Threater.to.store;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="movies_inform")
public class Theartor_to_Store {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="Movies_id")
private int Movieid;
private String Movie1Name;
private String Movie2Name;
public int getMovie_id() {
	return Movieid;
}
public void setMovie_id(int movieid) {
	Movieid = movieid;
}
public String getMovie1Name() {
	return Movie1Name;
}
public void setMovie1Name(String movie1Name) {
	Movie1Name = movie1Name;
}
public String getMovie2Name() {
	return Movie2Name;
}
public void setMovie2Name(String movie2Name) {
	Movie2Name = movie2Name;
}
public Theartor_to_Store(int movieid, String movie1Name, String movie2Name) {
	super();
	Movieid = movieid;
	Movie1Name = movie1Name;
	Movie2Name = movie2Name;
}
}