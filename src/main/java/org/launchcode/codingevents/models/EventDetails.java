package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity{

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Contact Email is a required field.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @DecimalMin(value="1", message = "Events must have more than one attendee to be scheduled.")
    private int numberOfAttendees;

    @OneToOne(mappedBy = "eventDetails")
    private Event event;

    public EventDetails(@Size(max = 500, message = "Description too long!") String description, @NotBlank(message = "Contact Email is a required field.") @Email(message = "Invalid email. Try again.") String contactEmail, @DecimalMin(value = "1", message = "Events must have more than one attendee to be scheduled.") int numberOfAttendees) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventDetails() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

}
