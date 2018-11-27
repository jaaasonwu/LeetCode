package problems;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CloneOfComplexLinkedListTest {

    @Test
    public void Clone() {
        CloneOfComplexLinkedList co = new CloneOfComplexLinkedList();
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.random = node3;
        node2.random = node5;
        node4.random = node2;
        co.Clone(node1);
    }
}