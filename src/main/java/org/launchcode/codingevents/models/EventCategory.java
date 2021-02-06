package org.launchcode.codingevents.models;

import javax.persistence.Entity;

@Entity
public class EventCategory extends AbstractEntity{

    private String category;

    public EventCategory(String category) {
        this.category = category;
    }

    public EventCategory() { }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
