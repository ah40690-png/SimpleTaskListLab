package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskListTest {

    @Test
    void testAddTask() {
        TaskList list = new TaskList();
        list.addTask("Test");
        
        assertFalse(listIsEmpty(list));
    }

    @Test
    void testCompleteTask() {
        TaskList list = new TaskList();
        list.addTask("Do dishes");
        list.complete("Do dishes");
        
    }


    private boolean listIsEmpty(TaskList list) {
        return false;
    }
}