package org.example;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<Task>();
    }

    
    public void addTask(String description) {
        if (description == null || description.trim().equals("")) {
            System.out.println("Task cannot be blank.");
            return;
        }
        tasks.add(new Task(description));
    }

  
    public void complete(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description) && !t.isComplete()) {
                t.markAsComplete();
                return;
            }
        }
        System.out.println("Task not found or already complete: " + description);
    }

    
    public void all() {
        if (tasks.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Task t : tasks) {
                System.out.println(t);
            }
        }
    }

    
    public void complete() {
        boolean found = false;
        for (Task t : tasks) {
            if (t.isComplete()) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No completed tasks.");
        }
    }

    
    public void incomplete() {
        boolean found = false;
        for (Task t : tasks) {
            if (!t.isComplete()) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No incomplete tasks.");
        }
    }

    
    public void clear() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }
}