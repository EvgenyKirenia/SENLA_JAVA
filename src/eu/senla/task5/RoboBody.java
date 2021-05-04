package eu.senla.task5;

public class RoboBody {
    TypeBody typeBody;

    public RoboBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public String toString() {
        return "Body" + typeBody;
    }
}
