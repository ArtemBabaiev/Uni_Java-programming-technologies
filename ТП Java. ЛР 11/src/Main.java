import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 11
 * @date 12.04.2022 19:48
 * @class Main
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("***********************PART 1***********************");
        System.out.println("Assigning time difference: " + (TimeMeasurment.getAssigningTime(list) - TimeMeasurment.getAssigningTime(linkedList)) + " milliseconds\n");

        System.out.println("***********************PART 2***********************");
        System.out.println("Insert on the beginning time difference: " + (TimeMeasurment.getBeggingInsertTime(list) - TimeMeasurment.getBeggingInsertTime(linkedList)) + " nanoseconds\n");
        System.out.println("Insert on the middle time difference: " + (TimeMeasurment.getMiddleInsertTime(list) - TimeMeasurment.getMiddleInsertTime(linkedList)) + " nanoseconds\n");
        System.out.println("Insert on the middle time difference: " + (TimeMeasurment.getEndInsertTime(list) - TimeMeasurment.getEndInsertTime(linkedList)) + " nanoseconds\n");
        System.out.println();

        System.out.println("***********************PART 3***********************");
        System.out.println("Update from the middle time difference: " + (TimeMeasurment.getBeggingUpdateTime(list) - TimeMeasurment.getBeggingUpdateTime(linkedList)) + " nanoseconds\n");
        System.out.println("Update from the middle time difference: " + (TimeMeasurment.getMiddleUpdateTime(list) - TimeMeasurment.getMiddleUpdateTime(linkedList)) + " nanoseconds\n");
        System.out.println("Update from the middle time difference: " + (TimeMeasurment.getEndUpdateTime(list) - TimeMeasurment.getEndUpdateTime(linkedList)));

        System.out.println();
        System.out.println("***********************PART 4***********************");
        System.out.println("Delete from the middle time difference: " + (TimeMeasurment.getBeggingDeleteTime(list) - TimeMeasurment.getBeggingDeleteTime(linkedList)) + " nanoseconds\n");
        System.out.println("Delete from the middle time difference: " + (TimeMeasurment.getMiddleDeleteTime(list) - TimeMeasurment.getMiddleDeleteTime(linkedList)) + " nanoseconds\n");
        System.out.println("Delete from the middle time difference: " + (TimeMeasurment.getEndDeleteTime(list) - TimeMeasurment.getEndDeleteTime(linkedList)) + " nanoseconds\n");
        System.out.println();
        System.out.println();
        System.out.println("USING ITERATOR");
        System.out.println();
        System.out.println();

        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> linkedList2 = new LinkedList<Integer>();
        System.out.println("***********************PART 1***********************");
        System.out.println("Assigning time difference: " + (TimeMeasureIterator.getAssigningTime(list2) - TimeMeasureIterator.getAssigningTime(linkedList2)) + " milliseconds");

        System.out.println("***********************PART 2***********************");
        System.out.println("Insert on the beginning time difference: " + (TimeMeasureIterator.getBeggingInsertTime(list2) - TimeMeasureIterator.getBeggingInsertTime(linkedList2)) + " nanoseconds\n");
        System.out.println("Insert on the middle time difference: " + (TimeMeasureIterator.getMiddleInsertTime(list2) - TimeMeasureIterator.getMiddleInsertTime(linkedList2)) + " nanoseconds\n");
        System.out.println("Insert on the middle time difference: " + (TimeMeasureIterator.getEndInsertTime(list2) - TimeMeasureIterator.getEndInsertTime(linkedList2)) + " nanoseconds\n");
        System.out.println();

        System.out.println("***********************PART 3***********************");
        System.out.println("Update from the middle time difference: " + (TimeMeasureIterator.getBeggingUpdateTime(list2) - TimeMeasureIterator.getBeggingUpdateTime(linkedList2)) + " nanoseconds\n");
        System.out.println("Update from the middle time difference: " + (TimeMeasureIterator.getMiddleUpdateTime(list2) - TimeMeasureIterator.getMiddleUpdateTime(linkedList2)) + " nanoseconds\n");
        System.out.println("Update from the middle time difference: " + (TimeMeasureIterator.getEndUpdateTime(list2) - TimeMeasureIterator.getEndUpdateTime(linkedList2)));

        System.out.println();
        System.out.println("***********************PART 4***********************");
        System.out.println("Delete from the middle time difference: " + (TimeMeasureIterator.getBeggingDeleteTime(list2) - TimeMeasureIterator.getBeggingDeleteTime(linkedList2)) + " nanoseconds\n");
        System.out.println("Delete from the middle time difference: " + (TimeMeasureIterator.getMiddleDeleteTime(list2) - TimeMeasureIterator.getMiddleDeleteTime(linkedList2)) + " nanoseconds\n");
        System.out.println("Delete from the middle time difference: " + (TimeMeasureIterator.getEndDeleteTime(list2) - TimeMeasureIterator.getEndDeleteTime(linkedList2)) + " nanoseconds\n");


    }




}
