package br.com.axys.spring_course.sec2.bootstrap;

import br.com.axys.spring_course.sec2.entities.Author;
import br.com.axys.spring_course.sec2.entities.Book;
import br.com.axys.spring_course.sec2.entities.Publisher;
import br.com.axys.spring_course.sec2.repositories.AuthorRepo;
import br.com.axys.spring_course.sec2.repositories.BookRepo;
import br.com.axys.spring_course.sec2.repositories.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo pubRepo;


    public BootStrap(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo pubRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.pubRepo = pubRepo;
    }
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Author authorA = new Author("Adriana de Sousa do", "Espírito Santo");
        Book bookA = new Book("Amplitude do Movimento", 123431233L);
        Publisher publisherA = new Publisher("Editora USP", "Cidade Universitária", "São Paulo", "SP", 051234L );

        authorA.getBooks().add(bookA);
        bookA.getAuthors().add(authorA);

        authorRepo.save(authorA);
        bookRepo.save(bookA);
        pubRepo.save(publisherA);

        System.out.println(authorA);
        System.out.println(bookA);
        System.out.println(publisherA);
        System.out.println("Number of Books: " + bookRepo.count());
        
        Author authorB = new Author("Adriana de Sousa do", "Espírito Santo");
        Book bookB = new Book("Amplitude do Movimento", 123431233L);

        authorA.getBooks().add(bookB);
        bookA.getAuthors().add(authorB);

        authorRepo.save(authorB);
        bookRepo.save(bookB);

        System.out.println(authorB);
        System.out.println(bookB);
        System.out.println("Number of Books: " + bookRepo.count());

    }

}