package pro.springbatch.chapter2.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pro.springbatch.chapter2.vo.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{
	
    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(Person person) throws Exception {
		
		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();
		
		Person transformedPerson = new Person(firstName, lastName);
		
		log.info("Transforming: " + person + " to: " + transformedPerson);
		return transformedPerson;
	}

}
