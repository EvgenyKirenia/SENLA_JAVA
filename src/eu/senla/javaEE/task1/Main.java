package eu.senla.javaEE.task1;

public class Main {

    public static void main(String[] args) {
        Second second = new Second();

        second.setBy((byte)12);
        System.out.println(second.getBy());

        second.setSh((short) 120);
        System.out.println(second.getSh());

        second.setI(1200);
        System.out.println(second.getI());

        second.setLon(12000);
        System.out.println(second.getLon());

        second.setDob(12.1);
        System.out.println(second.getDob());

        second.setFl(122.3f);
        System.out.println(second.getFl());

        second.setCh('Q');
        System.out.println(second.getCh());

        second.setBool(true);
        System.out.println(second.getBool());

        second.setStr("qwerty");
        System.out.println(second.getStr());

        second.setIn(13253);
        System.out.println(second.getIn());

        second.setDoubl(25336.6546);
        System.out.println(second.getDoubl());

        second.setChara((char) 555);
        System.out.println(second.getChara());

        System.out.println();

        byte by =127;
        short sh = 32767;
        int i = 2147483647;
        long lon = 9223372036854775807l;
        float fl = 127.22f;
        double dob = 134.43;
        char ch = 'p';
        boolean bool = by!=i;
        String str = "qwerty";
        Integer in = 9987567;
         Double doubl = 365758888.0;
         Character chara = 000;

        sh = by;
        System.out.println(sh);

        by = (byte) sh;
        System.out.println(by);

        i = (int) dob;
        System.out.println(i);

        dob = Double.parseDouble(String.valueOf(i));
        System.out.println(dob);

        i = (int)lon;
        System.out.println(i);

        fl = lon;
        System.out.println(fl);

        str = String.valueOf(ch);
        System.out.println(str);

        ch = str.charAt(0);
        System.out.println(ch);

        str = String.valueOf(bool);
        System.out.println(str);

        lon = i + sh;
        System.out.println(lon);

        bool = false;
        System.out.println(bool);

        System.out.println(in);
        System.out.println(doubl);
        System.out.println(chara);


    }


}
