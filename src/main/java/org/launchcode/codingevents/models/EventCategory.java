package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;

    private String category;

    public EventCategory(String category) {
        this.category = category;
    }

    public EventCategory() { }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCategory that = (EventCategory) o;
        return id == that.id && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }
}
