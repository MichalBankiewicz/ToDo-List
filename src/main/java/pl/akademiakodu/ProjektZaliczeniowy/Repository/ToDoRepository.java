package pl.akademiakodu.ProjektZaliczeniowy.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.ProjektZaliczeniowy.Model.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo,Integer> {
}
