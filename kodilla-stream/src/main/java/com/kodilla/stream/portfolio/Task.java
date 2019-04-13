package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.time.Period;

public final class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;
    private Period period;
    LocalDate date = LocalDate.now();
    public Task(final String title, final String description,
                final User assignedUser, final User creator,
                final LocalDate created, final LocalDate deadline) {

                this.title = title;
                this.description = description;
                this.assignedUser = assignedUser;
                this.creator = creator;
                this.created = created;
                this.deadline = deadline;
    }
    public int getDays() {


             if (deadline.isAfter(date)) {
                period = Period.between(created, date);
            } else if (deadline.isBefore(date)) {
                period = Period.between(created, deadline);
            }


        return period.getDays();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}' + "\n";
    }
}