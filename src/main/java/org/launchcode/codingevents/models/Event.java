package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;

@Entity
public class Event extends AbstractEntity{

    @NotBlank (message = "Name is a required field.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank (message = "Contact Email is a required field.")
    @Email (message = "Invalid email. Try again.")
    private String contactEmail;

    @DecimalMin(value="1", message = "Events must have more than one attendee to be scheduled.")
    private int numberOfAttendees;

    @ManyToOne
    @NotNull(message = "Category selection is required.")
    private EventCategory eventCategory;

    public Event(String name, String description, int numberOfAttendees, String contactEmail, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.numberOfAttendees = numberOfAttendees;
        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
    }

    public Event() { }

    @Override
    public String toString() {
        return name;
    }

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

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }
}
