package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EventCategory extends AbstractEntity{

    @Size(min=3, message= "Must be at least 3 characters long")
    private String categoryName;

    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> events = new ArrayList<>();

    public EventCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public EventCategory() { }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {return categoryName;}
}
