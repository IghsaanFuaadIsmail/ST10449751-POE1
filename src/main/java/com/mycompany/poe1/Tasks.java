/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author RC_Student_lab
 */


public class Tasks {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    private static ArrayList<Tasks> tasks = new ArrayList<>();
    static int totalHours = 0;
    static int taskCounter = 0;

    // Static arrays to hold developers, task names, task IDs, task durations, and task statuses
    private static ArrayList<String> developers = new ArrayList<>();
    private static ArrayList<String> taskNames = new ArrayList<>();
    private static ArrayList<String> taskIDs = new ArrayList<>();
    private static ArrayList<Integer> taskDurations = new ArrayList<>();
    private static ArrayList<String> taskStatuses = new ArrayList<>();

    // Constructor
    public Tasks(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskCounter++;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
        totalHours += taskDuration;

        // Add details to static arrays
        developers.add(developerDetails);
        taskNames.add(taskName);
        taskIDs.add(taskID);
        taskDurations.add(taskDuration);
        taskStatuses.add(taskStatus);
    }

    // Method to ensure task description is less than 50 characters
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // Method to create task ID
    public String createTaskID() {
        String devLastName = developerDetails.split(" ")[1];  // Assume developer name is "First Last"
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + devLastName.substring(devLastName.length() - 3).toUpperCase();
    }

    // Method to print task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
                "Developer: " + developerDetails + "\n" +
                "Task Number: " + taskNumber + "\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + taskDescription + "\n" +
                "Task ID: " + taskID + "\n" +
                "Task Duration: " + taskDuration + " hours";
    }

    // Method to return total hours of all tasks
    public static int returnTotalHours() {
        return totalHours;
    }

    /**
     * Prompts the user to add multiple tasks and stores them in the static tasks list.
     * Each task requires user input for name, description, developer name, duration, and status.
     */
    public static void addTasks() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to add?"));

        for (int i = 0; i < numTasks; i++) {
            // Input task details from user
            String taskName = JOptionPane.showInputDialog("Enter Task Name:");
            String taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 characters):");

            // Check if description is valid
            if (taskDescription.length() > 50) {
                JOptionPane.showMessageDialog(null, "Task description too long! Please enter less than 50 characters.");
                i--;   // Retry task input if description is invalid
                continue;
            }

            String developerDetails = JOptionPane.showInputDialog("Enter Developer First and Last Name:");
            String[] nameParts = developerDetails.split(" ");
            if (nameParts.length < 2) {
                JOptionPane.showMessageDialog(null, "Please provide both first and last name.");
                i--;   // Retry task input if developer name format is invalid
                continue;
            }

            String devLastName = nameParts[1];  // Use the last name for Task ID generation
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
            String taskStatus = JOptionPane.showInputDialog("Select Task Status:\n1) To Do\n2) Doing\n3) Done");

            // Convert numeric input to meaningful status
            switch (taskStatus) {
                case "1":
                    taskStatus = "To Do";
                    break;
                case "2":
                    taskStatus = "Doing";
                    break;
                case "3":
                    taskStatus = "Done";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid status! Defaulting to 'To Do'.");
                    taskStatus = "To Do";
            }

            // Create and store the task
            Tasks newTask = new Tasks(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
            tasks.add(newTask);  // Add new task to the static tasks list

            // Display task details
            JOptionPane.showMessageDialog(null, newTask.printTaskDetails());
        }

        // Show total hours of all tasks added
        JOptionPane.showMessageDialog(null, "All tasks added successfully! Total hours: " + returnTotalHours());

        // Display the developers, task names, task IDs, durations, and statuses
        StringBuilder developersList = new StringBuilder("Developers: ");
        for (String developer : developers) {
            developersList.append(developer).append("\n");
        }

        StringBuilder taskNamesList = new StringBuilder("Task Names: ");
        for (String taskName : taskNames) {
            taskNamesList.append(taskName).append("\n");
        }

        StringBuilder taskIDsList = new StringBuilder("Task IDs: ");
        for (String taskID : taskIDs) {
            taskIDsList.append(taskID).append("\n");
        }

        StringBuilder taskDurationsList = new StringBuilder("Task Durations: ");
        for (Integer taskDuration : taskDurations) {
            taskDurationsList.append(taskDuration).append(" hours\n");
        }

        StringBuilder taskStatusesList = new StringBuilder("Task Statuses: ");
        for (String taskStatus : taskStatuses) {
            taskStatusesList.append(taskStatus).append("\n");
        }

        // Show all the details in a single message
        JOptionPane.showMessageDialog(null, developersList.toString() +
                taskNamesList.toString() +
                taskIDsList.toString() +
                taskDurationsList.toString() +
                taskStatusesList.toString());
    }
}
