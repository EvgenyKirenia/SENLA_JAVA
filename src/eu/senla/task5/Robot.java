package eu.senla.task5;

public class Robot {
    String name;
    RoboHead roboHead;
    RoboBody roboBody;

    public Robot(String name, RoboHead roboHead, RoboBody roboBody) {
        this.name = name;
        this.roboHead = roboHead;
        this.roboBody = roboBody;
    }

    @Override
    public String toString() {
        return "Robot name=" + name + " " + roboHead +" "+ roboBody;
    }
}
