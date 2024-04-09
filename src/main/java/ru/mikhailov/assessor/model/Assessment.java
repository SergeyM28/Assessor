package ru.mikhailov.assessor.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "assessment")
@NoArgsConstructor
public class Assessment {

    //id анкеты генерируется автоматически
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //id менеджера из таблицы managers
    @Column(nullable = false, name = "id_manager")
    private long idManager;

    //id лида из таблицы leads
    @Column(nullable = false, name = "id_lead")
    private long idLead;

    //оценка по блоку "установление контакта"
    @Column(nullable = false, name = "making_contact_score")
    private int makingContactScore;

    //обратная связь по блоку "установление контакта" заполняется по необходимости
    @Column(length = 3000, name = "making_contact_comments")
    private String makingContactComments;

    //оценка по блоку "выявление потребности"
    @Column(nullable = false, name = "identifying_needs_score")
    private int identifyingNeedsScore;

    //обратная связь по блоку "выявление потребности" заполняется по необходимости
    @Column(length = 3000, name = "identifying_needs_comments")
    private String identifyingNeedsComments;

    //оценка по блоку "презентация"
    @Column(nullable = false, name = "presentation_score")
    private int presentationScore;

    //обратная связь по блоку "презентация" заполняется по необходимости
    @Column(length = 3000, name = "presentation_comments")
    private String presentationComments;

    //оценка по блоку "работа с возражениями"
    @Column(nullable = false, name = "overcoming_objections_score")
    private int overcomingObjectionsScore;

    //обратная связь по блоку "работа с возражениями" заполняется по необходимости
    @Column(length = 3000, name = "overcoming_objections_comments")
    private String overcomingObjectionsComments;

    //оценка по блоку "кросс продажа"
    @Column(nullable = false, name = "cross_sale_score")
    private int crossSaleScore;

    //обратная связь по блоку "кросс продажа" заполняется по необходимости
    @Column(length = 3000, name = "cross_sale_comments")
    private String crossSaleComments;

    //оценка по блоку "закрытие"
    @Column(nullable = false, name = "closing_score")
    private int closingScore;

    //обратная связь по блоку "закрытие" заполняется по необходимости
    @Column(length = 3000, name = "closing_comments")
    private String closingComments;

    //Суммарная оценка по всем блокам
    @Column(nullable = false, name = "total_score")
    private int totalScore;

    //общая обратная связь заполняется по необходимости
    @Column(length = 3000, name = "total_comments")
    private String totalComments;
}
