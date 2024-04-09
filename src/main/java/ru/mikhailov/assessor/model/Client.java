package ru.mikhailov.assessor.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "clients")
@NoArgsConstructor
public class Client {

    //id клиента генерируется автоматически
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //название компании-клиента
    @Column(nullable = false)
    private String name;

    //время добавления компании-климента в базу генерируется автоматически
    @Column(nullable = false, name = "registration_time")
    private LocalDateTime registrationTime;

    //имя контактного лица
    @Column(nullable = false, name = "contact_name")
    private String contactName;

    //фамилия контактного лица
    @Column(nullable = false, name = "contact_surname")
    private String contactSurname;

    //статус клиента генерируется автоматически как NEW
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClientStatus status;

    public enum ClientStatus {
        NEW,
        OFFER,
        CONTRACT,
        LOST
    }
}
