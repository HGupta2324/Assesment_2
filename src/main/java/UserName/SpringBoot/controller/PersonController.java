package UserName.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import UserName.SpringBoot.Repository.PersonRepository;
import UserName.SpringBoot.entity.Person;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

   @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        // Generate password
        String password = generatePassword(person.getFirstName(), person.getMiddleName(), person.getLastName());
        person.setPassword(password);

        return personRepository.save(person);
    }

    private String generatePassword(String firstName, String middleName, String lastName) {
        // Generate password logic
        // Assuming names are not null and have at least 2 characters each
        String password = (firstName.substring(0, 2) + middleName.substring(0, 2) + lastName.substring(0, 2))
                .toUpperCase();
        password += String.format("%03d", (int) (Math.random() * 1000));
        return password;
    }
    }
