package justin.ad.services.boot.controller;

import java.util.List;

import justin.ad.services.boot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import justin.ad.services.boot.aspect.annotation.CountOn;
import justin.ad.services.boot.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@GetMapping
	public List<Person> findAll() {

		return personRepository.findAll();
	}

	@GetMapping("/{id}")
	public Person findById(@RequestParam("id") String id)
	{
		return personRepository.findOne(id);
	}

	@CountOn
	@PostMapping
	public Person add(@RequestBody Person p) {
		return personRepository.save(p);
	}

	@CountOn
	@DeleteMapping("/{id}")
	public void delete(@RequestParam("id") String id) {
		personRepository.delete(id);
	}

	@GetMapping("/lastname/{lastName}")
	public List<Person> findByLastName(@RequestParam("lastName") String lastName) {
		return personRepository.findByLastName(lastName);
	}

	@GetMapping("/age/{age}")
	public List<Person> findByAgeGreaterThan(@RequestParam("age") int age) {
		return personRepository.findByAgeGreaterThan(age);
	}

}
