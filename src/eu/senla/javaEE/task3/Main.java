package eu.senla.javaEE.task3;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            i++;

            System.out.println(cat.name + i + ", " + "Age: " + cat.age + i);
        }
        System.out.println("=============================");
        for (i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setAge(i);
            cat.setName("Cat" + i);
            System.out.println(cat.toString());
        }
        System.out.println("=============================");
        i = 0;
        do {
            Cat cat = new Cat("Cat " + i, i);
            System.out.println(cat.toString());
            i++;
        }
        while (i < 10 - 1);
        {
        }
        System.out.println("=============================");
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat 1", 1);
        cats[1] = new Cat("Cat 2", 2);
        cats[2] = new Cat("Cat 3", 3);
        cats[3] = new Cat("Cat 4", 4);
        cats[4] = new Cat("Cat 5", 5);
        for (Cat cat : cats) {
            System.out.println(cat);

        }
    }
}
