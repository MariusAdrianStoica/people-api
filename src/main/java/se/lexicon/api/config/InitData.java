package se.lexicon.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.api.model.entity.Person;
import se.lexicon.api.repository.PersonRepository;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    PersonRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Person("Test1","test1","test1@test.se","TeamLeader", 123456789));
        repository.save(new Person("Test2","test2","test2@test.se","Hunter", 987654321));
        repository.save(new Person("Test3","test3","test3@test.se","Hunter", 111111111));
    }
}
