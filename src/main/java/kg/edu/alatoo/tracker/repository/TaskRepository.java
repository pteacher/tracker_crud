package kg.edu.alatoo.tracker.repository;

import kg.edu.alatoo.tracker.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
