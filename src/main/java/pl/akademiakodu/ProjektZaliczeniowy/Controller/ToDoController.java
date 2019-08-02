package pl.akademiakodu.ProjektZaliczeniowy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.ProjektZaliczeniowy.Model.ToDo;
import pl.akademiakodu.ProjektZaliczeniowy.Repository.ToDoRepository;

@Controller
public class ToDoController {


    @Autowired
    private ToDoRepository toDoRepository;
    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/")
    public String home(ModelMap map) {
        map.put("todo", toDoRepository.findAll());
        map.put("thing", new ToDo());
        return "home";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute ToDo toDo) {
        toDoRepository.save(toDo);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String showElements(ModelMap map) {
        map.put("toDo", toDoRepository.findAll());
        return "show";
    }

    @GetMapping("/list/{id}")
    public String show(@PathVariable Integer id, ModelMap map) {
        map.put("thing", toDoRepository.findById(id).get());
        return "showDetailes";
    }

 /*    @GetMapping("/list/{id}/showDescription")
    public String showDescriptions(@PathVariable Integer id, ModelMap map) {
        ToDo thing = toDoRepository.findById(id).get();
        map.put("thing", thing);
        return "show";
    }*/
    @GetMapping("/list/{id}/delete")
    public String delete(@PathVariable Integer id, ModelMap map){
        toDoRepository.deleteById(id);
        return "redirect:/list";
    }
    }

