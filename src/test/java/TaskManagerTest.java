/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poe1.Tasks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */



import java.util.ArrayList;

public class TaskManagerTest {
    
    private ArrayList<String> developers;
    private ArrayList<String> taskNames;
    private ArrayList<Integer> taskDurations;
    private ArrayList<String> taskStatuses;
    
    // Initialize test data before each test
    @BeforeEach
    public void setUp() {
        developers = new ArrayList<>();
        taskNames = new ArrayList<>();
        taskDurations = new ArrayList<>();
        taskStatuses = new ArrayList<>();
        
        // Test data for tasks 1-4
        developers.add("Mike Smith");
        developers.add("Edward Harrison");
        developers.add("Samantha Paulson");
        developers.add("Glenda Oblehozer");
        
        taskNames.add("Create Login");
        taskNames.add("Create Add Features");
        taskNames.add("Create Reports");
        taskNames.add("Add Arrays");
        
        taskDurations.add(5);
        taskDurations.add(8);
        taskDurations.add(2);
        taskDurations.add(11);
        
        taskStatuses.add("To Do");
        taskStatuses.add("Doing");
        taskStatuses.add("Done");
        taskStatuses.add("To Do");
    }

    // 1. Test: Developer Array Correctly Populated
    @Test
    public void testDeveloperArrayPopulated() {
        assertArrayEquals(new String[] {
            "Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oblehozer"
        }, developers.toArray());
    }

    // 2. Test: Display Developer and Duration for Task with Longest Duration
    @Test
    public void testLongestTaskDuration() {
        int maxDuration = -1;
        String developer = "";
        for (int i = 0; i < taskDurations.size(); i++) {
            if (taskDurations.get(i) > maxDuration) {
                maxDuration = taskDurations.get(i);
                developer = developers.get(i);
            }
        }
        assertEquals("Glenda Oblehozer", developer);
        assertEquals(11, maxDuration);
    }

    // 3. Test: Search for Tasks
    @Test
    public void testSearchTask() {
        String searchTerm = "Create Login";
        String taskDeveloper = "";
        String taskName = "";
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(searchTerm)) {
                taskDeveloper = developers.get(i);
                taskName = taskNames.get(i);
                break;
            }
        }
        assertEquals("Mike Smith", taskDeveloper);
        assertEquals("Create Login", taskName);
    }

    // 4. Test: Search All Tasks Assigned to a Developer
    @Test
    public void testSearchTasksByDeveloper() {
        String developerName = "Samantha Paulson";
        String taskName = "";
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(developerName)) {
                taskName = taskNames.get(i);
                break;
            }
        }
        assertEquals("Create Reports", taskName);
    }

    // 5. Test: Delete Task from Array
    @Test
    public void testDeleteTask() {
        String taskToDelete = "Create Reports";
        boolean deleted = taskNames.remove(taskToDelete);
        assertTrue(deleted);
        assertFalse(taskNames.contains(taskToDelete));
    }

    // 6. Test: Display Report
    @Test
    public void testDisplayReport() {
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < taskNames.size(); i++) {
            report.append("Task Name: ").append(taskNames.get(i))
                .append(", Developer: ").append(developers.get(i))
                .append(", Duration: ").append(taskDurations.get(i))
                .append(", Status: ").append(taskStatuses.get(i))
                .append("\n");
        }
        String reportOutput = report.toString();
        assertTrue(reportOutput.contains("Create Login"));
        assertTrue(reportOutput.contains("Create Reports"));
        assertTrue(reportOutput.contains("Add Arrays"));
    }
}
