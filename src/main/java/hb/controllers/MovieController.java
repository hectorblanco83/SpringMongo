package hb.controllers;

import hb.models.Movie;
import hb.models.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Only controller that we need, listening to requests on the
 * context-path's root "/".
 * <p>
 * The {@link RequestMapping} annotations on the methods, will indicate
 * which urls any method will respond to.
 * The {@link ResponseBody} annotations will indicate that the return
 * values of the methods should be bound
 * to the web response body
 */
@Controller
public class MovieController {
	
	@Autowired
	MovieRepository repository;
	
	
	@ResponseBody
	@RequestMapping("all")
	public List<Movie> findAll() {
		return repository.findAll();
	}
	
	
	@ResponseBody
	@RequestMapping("byName")
	public List<Movie> findByName(@RequestParam String name) {
		return repository.findByName(name);
	}
	
	
	@ResponseBody
	@RequestMapping("new")
	public Movie create(@RequestParam String name) {
		return repository.insert(new Movie(name));
	}
	
	
	@RequestMapping("remove")
	public void remove(@RequestParam String name) {
		repository.delete(repository.findByName(name));
	}
	
}
