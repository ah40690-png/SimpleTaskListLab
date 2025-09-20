package org.example;

public class TaskListApp {
    public static void main(String[] args) {
        TaskList list = new TaskList();

        list.addTask("Take out garbage");
        list.addTask("Do dishes");
        list.addTask("Treadmill");
        list.addTask("Workout");
        list.addTask("Homework");

        System.out.println("All tasks:");
        list.all();

        list.complete("Take out garbage");
        list.complete("Homework");

        System.out.println("\nCompleted tasks:");
        list.complete();

        System.out.println("\nIncomplete tasks:");
        list.incomplete();

        System.out.println("\nClearing list...");
        list.clear();

        System.out.println("\nAll tasks after clear:");
        list.all();
    }
}