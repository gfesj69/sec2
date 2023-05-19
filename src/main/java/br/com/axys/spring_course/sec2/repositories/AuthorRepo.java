package br.com.axys.spring_course.sec2.repositories;

import br.com.axys.spring_course.sec2.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
