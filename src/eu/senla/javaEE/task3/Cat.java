package eu.senla.javaEE.task3;

import java.util.Objects;

public class Cat {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getName().equals(cat.getName()) &&
                getAge().equals(cat.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }



    @Override
    public String toString() {
        return name + ", " + "Age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String name = "New Cat";
    public Integer age = 0;

    public Cat() {

    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
