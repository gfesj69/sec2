package br.com.axys.spring_course.sec2.repositories;

import br.com.axys.spring_course.sec2.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {

}
