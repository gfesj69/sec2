package br.com.axys.spring_course.sec2.bootstrap;

import br.com.axys.spring_course.sec2.entities.Author;
import br.com.axys.spring_course.sec2.entities.Book;
import br.com.axys.spring_course.sec2.repositories.AuthorRepo;
import br.com.axys.spring_course.sec2.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BootStrap(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Author autores = new Author("Adriana de Sousa do", "Espírito Santo");
        Book livros = new Book("Amplitude do Movimento", 123431233L);

        autores.getBooks().add(livros);
        livros.getAuthors().add(autores);

        authorRepo.save(autores);
        bookRepo.save(livros);

        System.out.println(autores);
        System.out.println(livros);
        System.out.println("Number of Books: " + bookRepo.count());

        ////
        ///

        Author autores2 = new Author("Adriana de Sousa do", "Espírito Santo");
        Book livros2 = new Book("Amplitude do Movimento", 123431233L);

        autores.getBooks().add(livros2);
        livros.getAuthors().add(autores2);

        authorRepo.save(autores2);
        bookRepo.save(livros2);

        System.out.println(autores2);
        System.out.println(livros2);
        System.out.println("Number of Books: " + bookRepo.count());

    }

}
