package eu.senla.task6;

import eu.senla.task3.Cat;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return 0;
    }
}
