package com.nathanielcassidy.bugtrackerv2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE2")
public class Ticket {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String priority;
    private String status;

    protected Ticket() {
    }

    public Ticket(String name, String description, String priority, String status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
