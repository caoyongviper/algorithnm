package net.snake.aloorithnm.link.test;

import net.snake.algorithnm.link.SinglyLink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkTest {

    @Test
    void testAdd(){
        SinglyLink link = new SinglyLink();
        assertEquals(0,link.getLinkSize());
        for(int i =0; i <10; i ++){
            link.addNode(String.valueOf(i));
        }
        assertEquals(10,link.getLinkSize());
    }
}
