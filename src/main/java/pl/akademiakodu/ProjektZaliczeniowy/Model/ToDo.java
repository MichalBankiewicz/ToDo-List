package pl.akademiakodu.ProjektZaliczeniowy.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String taskToDo;
    //@Transient //to pole nie jest tworzone jako kolumna w bazie danych
    private String description;
    private boolean done;

    @Override
    public String toString(){
        return getTaskToDo() ;
    }
}
