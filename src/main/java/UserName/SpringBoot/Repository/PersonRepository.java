package UserName.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UserName.SpringBoot.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}