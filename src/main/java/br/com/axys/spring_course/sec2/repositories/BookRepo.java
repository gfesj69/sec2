package br.com.axys.spring_course.sec2.repositories;

import br.com.axys.spring_course.sec2.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
