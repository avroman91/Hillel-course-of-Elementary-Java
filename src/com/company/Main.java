package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<Task>();
        Scanner scanner = new Scanner(System.in);
        int taskId = 1;
        Q:
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("What task you want add to your To Do List? ");
                    taskList.add(new Task(scanner.nextLine(), false, taskId));
                    taskId++;
                    break;
                case "list":
                    for (Task task : taskList) {
                        System.out.println(task);
                    }
                    break;
                case "done list":
                    for (Task task : taskList) {
                        if (task.isTaskBooleanStatus()) {
                            System.out.println(task);
                        }
                    }
                    break;
                case "to do list":
                    for (Task task : taskList) {
                        if (!task.isTaskBooleanStatus()) {
                            System.out.println(task);
                        }
                    }
                    break;
                case "done":
                    System.out.println("Enter the number of completed task: ");
                    taskList.get(scanner.nextInt() - 1).setTaskBooleanStatus(true);
                    scanner.nextLine();
                    break;
                case "stop":
                    break Q;
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }
    }
}
