package javaB.task1;

public class Student {

    public void studentVova() {
        String studentClassV = "5th grade student";
        String studentNameV = "Vova Sidorov";
        int studentAgeV = 10;
        String ageText = "years old";
        String studentCartV = "##############################\n" +
                studentClassV + "\n" +
                studentNameV + "\n" +
                studentAgeV + " " + ageText + "\n" +
                "##############################\n";
        System.out.println(studentCartV);
    }

    public void StudentMasha() {
        String studentClassM = "9th grade student";
        String studentNameM = "Masha Semenova";
        int studentAgeM = 14;
        String ageText = "years old";
        String studentCartM = "##############################\n" +
                studentClassM + "\n" +
                studentNameM + "\n" +
                studentAgeM + " " + ageText + "\n" +
                "##############################\n";
        System.out.println(studentCartM);
    }
}
