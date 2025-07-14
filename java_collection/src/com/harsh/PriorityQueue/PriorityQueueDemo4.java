package com.harsh.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo4 {
    public static void main(String[] args) 
    {                                               
        PriorityQueue<Task> taskQueue = new PriorityQueue<>
        ((t1,t2)-> t1.priority().compareTo(t2.priority()));

        taskQueue.add(new Task("Submit report", 4));
        taskQueue.add(new Task("Find Bug", 2));
        taskQueue.add(new Task("Write Program", 1));
        taskQueue.add(new Task("Execute Program", 3));

        while (!taskQueue.isEmpty()) 
        {
            System.out.println("Executing: " + taskQueue.poll());
        }
    }

}
