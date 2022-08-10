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
    private String type;
    private String assignedDeveloper;
    private String status;
    private String assignedProject;

    public TicketResource(){
    }

    public TicketResource(String name, String priority, String description, String type, String assignedDeveloper, String status, String assignedProject) {
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.type = type;
        this.assignedDeveloper = assignedDeveloper;
        this.status = status;
        this.assignedProject = assignedProject;
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

    public String getType() {
        return type;
    }

    public String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedProject() {
        return assignedProject;
    }


}
