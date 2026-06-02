package com.sharetechworks.muse.service;

import com.sharetechworks.muse.DOA.Task;
import com.sharetechworks.muse.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> findAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> findTaskById(long id){
        return taskRepository.findById(id);
    }
    public List<Task> findTaskByTitleAndCompanyId(String title, long id){
        return taskRepository.findTaskByTitleAndCompanyId(title, id);
    }

    public List<Task> findTaskByCompanyId(long companyId){
        return taskRepository.findTaskByCompanyId(companyId);
    }

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    public void deleteTaskById(long id){
        taskRepository.deleteById(id);
    }
}
