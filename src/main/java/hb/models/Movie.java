package hb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Entity mapping the "movies" collection in the database.
 * <p>
 * {@link Document} indicates to spring's component scan that
 * this class is a database document entity,
 * and {@link Id} specifies this entity's primary key.
 * <p>
 * With MongoDB would be better use the object {@link org.bson.types.ObjectId}
 * as the type of this object's id but in this case we can use String
 * wich ObjectId <-> String conversion is pretty natural
 */
@Document
public class Movie {
	
	@Id
	private String id;
	
	private String name;
	
	
	public Movie(String name) {
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
}
