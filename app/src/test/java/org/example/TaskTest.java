package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskStartsIncomplete() {
        Task t = new Task("Sample");
        assertFalse(t.isComplete());
    }

    @Test
    void testMarkAsComplete() {
        Task t = new Task("Sample");
        t.markAsComplete();
        assertTrue(t.isComplete());
    }

    @Test
    void testToStringFormat() {
        Task t = new Task("Homework");
        assertEquals("Homework (not done)", t.toString());
        t.markAsComplete();
        assertEquals("Homework (done)", t.toString());
    }
}