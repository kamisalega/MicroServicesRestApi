package pl.kamilsalega.eventmanagmentapi.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.kamilsalega.eventmanagmentapi.entities.Event;
import pl.kamilsalega.eventmanagmentapi.entities.Organizer;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {
}
