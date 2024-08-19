package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Mr. Johnson
 * @version 8/19/2024
 */
public class TestTicketMachine
{
    @Test
    public void dumbTicketMachineTest(){
        DumbTicketMachine machine = new DumbTicketMachine(50);
        assertEquals(50, machine.getPrice());
        
    }
    
    //TODO: Add more tests
    
}
