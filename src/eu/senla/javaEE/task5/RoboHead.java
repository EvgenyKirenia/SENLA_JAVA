package eu.senla.javaEE.task5;

public class RoboHead {

    TypeHead typeHead;


    public RoboHead(TypeHead typeHead) {
        this.typeHead = typeHead;


    }
    @Override
    public String toString() {
        return "Head"+ typeHead;
}}
