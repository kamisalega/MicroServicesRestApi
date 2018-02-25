package pl.kamilsalega.eventmanagmentapi.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.kamilsalega.eventmanagmentapi.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
}
