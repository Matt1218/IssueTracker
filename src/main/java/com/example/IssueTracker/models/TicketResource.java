package com.example.IssueTracker.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TicketResource {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String priority;
    private String description;
    private String category;

    public TicketResource(){
    }

    public TicketResource(String name, String priority, String description, String category) {
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }


}
