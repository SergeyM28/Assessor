package ru.mikhailov.assessor.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "managers")
@NoArgsConstructor
public class Manager {
    //id лида генерируется автоматически
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //имя менеджера
    @Column(nullable = false, name = "manager_name")
    private String name;

    //фамилия менеджера
    @Column(nullable = false, name = "manager_surname")
    private String surname;

    //город (филиал) менеджера
    @Column(nullable = false)
    private String city;

    //отдел менеджера
    @Column(nullable = false)
    private String department;

    //время регистрации менеджера генерируется автоматически
    @Column(nullable = false, name = "registration_time")
    private LocalDateTime registrationTime;
}
