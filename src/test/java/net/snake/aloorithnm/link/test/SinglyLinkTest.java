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
            link.appendNode(String.valueOf(i));
        }
        assertEquals(10,link.getLinkSize());
    }

    @Test
    void testGetNode(){
        SinglyLink link = new SinglyLink();
        assertEquals(0,link.getLinkSize());
        for(int i =0; i <10; i ++){
            link.appendNode(String.valueOf(i));
        }
        assertEquals("3",link.getNodeData(3));
    }

    @Test
    void testInsert(){
        SinglyLink link = new SinglyLink();
        assertEquals(0,link.getLinkSize());
        for(int i =0; i <10; i ++){
            link.appendNode(String.valueOf(i));
        }
        assertEquals("3",link.getNodeData(3));
        link.insertData("A",3);
        assertEquals("A",link.getNodeData(3));
        assertEquals("3",link.getNodeData(4));
        link.insertData("B",11);
        assertEquals("B",link.getNodeData(11));
    }

    @Test
    void testDel(){
        SinglyLink link = new SinglyLink();
        assertEquals(0,link.getLinkSize());
        for(int i =0; i <10; i ++){
            link.appendNode(String.valueOf(i));
        }
        link.del(3);
        assertEquals("4",link.getNodeData(3));

        link.del(20);
        assertEquals(8,link.getLinkSize());
    }
}
