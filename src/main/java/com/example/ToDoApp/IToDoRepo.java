package com.example.ToDoApp;

import com.example.ToDoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IToDoRepo extends JpaRepository<ToDo, Long> {
}
