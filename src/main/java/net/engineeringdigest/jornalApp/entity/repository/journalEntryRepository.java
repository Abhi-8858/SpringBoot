package net.engineeringdigest.jornalApp.entity.repository;

import net.engineeringdigest.jornalApp.entity.JornalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface journalEntryRepository  extends MongoRepository<JornalEntry,String>{
}
