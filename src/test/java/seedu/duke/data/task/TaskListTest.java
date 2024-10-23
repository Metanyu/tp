package seedu.duke.data.task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import seedu.duke.commands.AddTaskCommand;
import seedu.duke.commands.MarkTaskCommand;
 
public class TaskListTest {

     public TaskListTest() {
    }

    /**
     * Test of calCompletionRate method, of class TaskList.
     */
    @Test
    public void testCalCompletionRate() {
        System.out.println("calCompletionRate");
        TaskList instance = new TaskList();
        AddTaskCommand command = new AddTaskCommand("Read book");
        command.setData(instance);
        command.execute();
        AddTaskCommand command2 = new AddTaskCommand("close book");  
        command2.setData(instance);
        command2.execute();
        MarkTaskCommand command3 = new MarkTaskCommand(1);
        command3.setData(instance);
        command3.execute();
        String expResult = "50.00%";
        String result = instance.getCompletionRate();
        assertEquals(expResult, result);
        
    }
}