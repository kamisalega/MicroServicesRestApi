package pl.kamilsalega.eventmanagmentapi.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.kamilsalega.eventmanagmentapi.entities.Participant;
import pl.kamilsalega.eventmanagmentapi.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
