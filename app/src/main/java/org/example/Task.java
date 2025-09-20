package org.example;

public class Task {
    private String description;
    private boolean complete;

    public Task(String description) {
        this.description = description;
        this.complete = false; 
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void markAsComplete() {
        complete = true;
    }

    @Override
    public String toString() {
        if (complete) {
            return description + " (done)";
        } else {
            return description + " (not done)";
        }
    }
}