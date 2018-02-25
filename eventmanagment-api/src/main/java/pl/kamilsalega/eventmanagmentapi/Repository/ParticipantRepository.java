package pl.kamilsalega.eventmanagmentapi.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.kamilsalega.eventmanagmentapi.entities.Organizer;
import pl.kamilsalega.eventmanagmentapi.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
