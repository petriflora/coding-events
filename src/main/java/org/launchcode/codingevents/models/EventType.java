package org.launchcode.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    MEETUP ("MeetUp"),
    WORKSHOP ("Workshop"),
    SOCIAL("Social"),
    CLASS("Class"),
    STREAMING("Live Video Stream");

    private final String displayName;

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
