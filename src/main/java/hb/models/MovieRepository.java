package hb.models;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


/**
 * CrudRepository for the Movies entity.
 * <p>
 * MovieRepository extends the MongoRepository interface and plugs in the
 * type of values and id it works with: Movie and String.
 * Out-of-the-box, this interface comes with many operations, including standard
 * CRUD operations (create-read-update-delete).
 * <p>
 * It's possibile to define other queries as needed by simply declaring their method signature.
 * In this case, we defined findByName, which essentially seeks documents of type Movie and
 * finds the one that matches on name.
 * <p>
 * In a typical Java application, we write a class that implements MovieRepository
 * and craft the queries yourself. What makes Spring Data MongoDB so useful is the fact that you
 * don’t have to create this implementation.
 * Spring Data MongoDB creates it on the fly when you run the application.
 */
public interface MovieRepository extends MongoRepository<Movie, String> {
	
	/**
	 * Simply find movies by their names
	 */
	List<Movie> findByName(String name);
	
}
