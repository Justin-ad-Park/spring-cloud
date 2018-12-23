package justin.ad.services.boot.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "person")
public class Person {

	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;


}
