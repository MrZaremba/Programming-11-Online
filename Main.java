public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */
        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        System.out.println(5+10/2+4/3);
        System.out.println(5+5+1);
        System.out.println(11);

        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        System.out.println(23%4+(18-1));
        System.out.println(23%4+17);
        System.out.println(3+17);
        System.out.println(20);

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println((3+Math.pow(3,4)/5));
        System.out.println((3+81.0/5));
        System.out.println((3+16.2));
        System.out.println(19.2);


        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println((9 % 4) -8 + Math.pow(2,3)/8+(9.0/3));
        System.out.println(1 -8 + Math.pow(2,3)/8+3.0);
        System.out.println(-7+8.0/8+3.0);
        System.out.println(-3.0);

        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((7 + 3) * Math.sin(45) + 2) - Math.pow(5.0, 3));
        System.out.println((10 * Math.sin(45) + 2) - Math.pow(5.0, 3));
        System.out.println((10 * 0.8509035245341184 + 2) - Math.pow(5.0, 3));
        System.out.println((8.509035245341185 + 2) - Math.pow(5.0, 3));
        System.out.println(10.509035245341185  - Math.pow(5.0, 3));
        System.out.println(10.509035245341185  - 125.0);
        System.out.println(-114.49096475465882);
    }
}
