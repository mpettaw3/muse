package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Task;
import com.sharetechworks.muse.service.TaskService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @GetMapping("/all")
    public List<Task> getAllTasks(){return taskService.findAllTasks();}

    @GetMapping("/delete")
    public void deleteTask(long id){
        taskService.deleteTaskById(id);
    }

    @GetMapping("/add")
    public Task addTask(Task task){
        return taskService.saveTask(task);
    }

    @SneakyThrows
    @GetMapping("/findByID")
    public Task findTaskById(long id){
        Optional<Task> task = taskService.findTaskById(id);
        if(task.isPresent()){
            return task.get();
        }else{
            throw new Exception("Could not find task with given Id");
        }
    }

    @GetMapping("/findByCompanyId")
    public List<Task> findTasksByCompanyId(long companyId){
        return taskService.findTaskByCompanyId(companyId);
    }

    @GetMapping("/findByTitleAndCompanyId")
    public List<Task> findTaskByTitleAndCompanyId(String title, long id){
        return taskService.findTaskByTitleAndCompanyId(title, id);
    }
}
