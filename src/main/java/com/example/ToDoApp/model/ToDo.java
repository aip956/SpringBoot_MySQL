package com.example.ToDoApp.model;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.Columns;
import java.util.Date;
@Entity
@Table(name="ToDo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class ToDo {
    @Id@GeneratedValue(strategy = GenerationType.AUTO);
    private Long id;

    @Columns
    private String title;
    @Columns
    private Date date;
    @Columns
    private String status;
}
