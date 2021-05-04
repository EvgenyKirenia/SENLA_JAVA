package eu.senla.task6;

import eu.senla.task3.Cat;

import java.util.*;

public class Main extends Cat {
    public static void main(String[] args) {


    List<Cat> list =new ArrayList<>();
    list.add(new Cat("Tom", 2));
    list.add(new Cat("Atom", 6));
    list.add(new Cat("Dom", 1));
    list.add(new Cat("Rom", 4));
    System.out.println(list);

        List<Cat> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);

        list1.addAll(3,list);
        System.out.println(list1);

        list1.set(4,new Cat("Bill",7));
        list1.set(5,new Cat("Bob",3));
        list1.set(6,new Cat("Willi",7));
        list1.set(7,new Cat("Vasili",5));
        System.out.println(list1);

        list1.remove(3);
        System.out.println(list1);

        list1.sort(new AgeComparator());
        System.out.println(list1);

        list1.sort(new NameComparator());
        System.out.println(list1);

   ArrayList<String> newList = new ArrayList<>(10);
        System.out.println(newList);

        ArrayList<Cat> newList1 = new ArrayList<Cat>(list1);
        System.out.println(newList1);

        Iterator<Cat> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



}}
