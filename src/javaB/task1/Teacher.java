package javaB.task1;

public class Teacher {
    public void teacherObj() {
        String teacherClass = "Math teacher";
        String teacherName = "Ivan Petrovich Serebryakov";
        int teacherAge = 55;
        String ageText = "years old";
        String teacherCart = "##############################\n" +
                teacherClass + "\n" +
                teacherName + "\n" +
                teacherAge + " " + ageText + "\n" +
                "##############################\n";
        System.out.println(teacherCart);
    }
}
