package ru.mikhailov.assessor.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "leads")
@NoArgsConstructor
public class Lead {
    //id лида генерируется автоматически
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //id клиента из таблицы clients
    @Column(nullable = false, name = "id_client")
    private long idClient;

    //время создания лида генерируется автоматически
    @Column(nullable = false, name = "registration_time")
    private LocalDateTime registrationTime;

    //статус лида генерируется автоматически как NEW
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeadStatus status;


    public enum LeadStatus {
        NEW,
        QUALITATIVE,
        BAD_QUALITY,
        LOST
    }
}
