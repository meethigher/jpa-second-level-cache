package top.meethigher.jpasecondlevelcache.runner;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.map.IMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import top.meethigher.jpasecondlevelcache.persistence.Book;
import top.meethigher.jpasecondlevelcache.persistence.BookRepository;

import java.util.Set;

@Component
public class Runner implements CommandLineRunner {
    private final BookRepository bookRepository;

    public Runner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        IMap<Object, Object> map = Hazelcast.getAllHazelcastInstances().stream()
//                .findAny().orElseThrow(() -> new RuntimeException("哈哈哈哈哈哈哈"))
//                .getMap(Book.class.getName());
//
//        System.out.println(map.size());
        Book book = new Book(1L, "book");
        bookRepository.save(book);

        while(true) {
            Thread.sleep(1000);
//            System.out.println(map.size());
            Book book1 = bookRepository.findById(1L).get();
            System.out.println(book1.getName());
        }

    }
}
