

public class Main {
    public static void main(String[] args) {
        Candy[][] box = new Candy[4][3];
        box[0][1] = new Candy("lime");
        box[1][1] = new Candy("orange"); 
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");
        System.out.println(box);

        BoxOfCandy b = new BoxOfCandy(box);
        System.out.println(b);

        System.out.println(b.moveCandyToFirstRow(0));
        System.out.println(b.moveCandyToFirstRow(1));
        System.out.println(b.moveCandyToFirstRow(2));
        System.out.println(b);

        Candy[][] box2 = new Candy[3][5];
        box2[0][0] = new Candy("lime"); 
        box2[0][1] = new Candy("lime");
        box2[0][3] = new Candy("lemon"); 
        box2[1][0] = new Candy("orange");
        box2[1][3] = new Candy("lime");
        box2[1][4] = new Candy("lime");
        box2[2][0] = new Candy("cherry");
        box2[2][2] = new Candy("lemon");
        box2[0][4] = new Candy("orange"); 
        System.out.println(box2);
        BoxOfCandy c = new BoxOfCandy(box2);
        System.out.println(c);
        System.out.println(c.removeNextByFlavor("cherry"));
        System.out.println(c);
        System.out.println(c.removeNextByFlavor("lime"));
        System.out.println(c);
        System.out.println(c.removeNextByFlavor("grape"));
        System.out.println(c);
    }
}