package eu.senla.javaEE.task5;


public class Main {
    public static void main(String[] args) {


        RoboBody[] bodies = new RoboBody[]{
                new RoboBody(TypeBody.IRON),
                new RoboBody(TypeBody.POLIMER),
                new RoboBody(TypeBody.WOOD)
        };

        RoboHead[] heads = new RoboHead[]{
                new RoboHead(TypeHead.BIG),
                new RoboHead(TypeHead.MEDIUM),
                new RoboHead(TypeHead.SMALL)
        };

        Robot[] robots = new Robot[9];
        int n = 0;
        for (int i = 0; i < bodies.length; i++) {
            for (int j = 0; j < heads.length; j++) {
                robots[n] = new Robot("Robot" + n, heads[i], bodies[j]);
                n++;
            }

        }

//        Robot[] robots = new Robot[heads.length * bodies.length];
//        int i = 0;
//        for (RoboHead head : heads) {
//            for (RoboBody body : bodies) {
//                robots[i] = new Robot(i + 1 + "robo", head, body);
//                i++;
//            }
//        }


        for (Robot robot : robots) {
            System.out.println(robot.toString());
        }
    }
}



