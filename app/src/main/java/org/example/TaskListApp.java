package org.example;

import java.util.Scanner;

public class TaskListApp {
    public static void main(String[] args) {
        TaskList list = new TaskList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Task List App!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a task");
            System.out.println("2. Mark task as complete");
            System.out.println("3. Show all tasks");
            System.out.println("4. Show completed tasks");
            System.out.println("5. Show incomplete tasks");
            System.out.println("6. Clear all tasks");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    list.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task to mark complete: ");
                    String taskToComplete = scanner.nextLine();
                    list.complete(taskToComplete);
                    break;
                case 3:
                    System.out.println("All tasks:");
                    list.all();
                    break;
                case 4:
                    System.out.println("Completed tasks:");
                    list.complete();
                    break;
                case 5:
                    System.out.println("Incomplete tasks:");
                    list.incomplete();
                    break;
                case 6:
                    list.clear();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}