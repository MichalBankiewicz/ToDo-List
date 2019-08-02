package pl.akademiakodu.ProjektZaliczeniowy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.ProjektZaliczeniowy.Model.ToDo;
import pl.akademiakodu.ProjektZaliczeniowy.Repository.ToDoRepository;

@RequestMapping("api")
@RestController
public class ToDoApiController {
    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping("/todos/{id}")
    public ToDo done(@PathVariable Integer id, @RequestParam boolean done, ModelMap map) {
        /* toDoRepository.save(toDo).isDone();*/
        ToDo toDo = toDoRepository.findById(id).get();
        toDo.setDone(done);
        toDoRepository.save(toDo);
        return toDo; //{id: 5,name: }
    }
}
