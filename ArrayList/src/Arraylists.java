import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Point> al = new ArrayList<>();
        al.add(new Point(1, 5));
        al.add(new Point(5, 10));
        al.add(new Point(2, 0));
        Collections.sort(al);
        System.out.println("after sorting");
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i).x + " " + al.get(i).y);
        }
//        al.add(10);
//        al.add(7);
//        al.add(15);
//        al.add(20);
//        System.out.println("before sorting");
//        for(int i = 0; i < al.size(); i++){
//            System.out.print(al.get(i) + " ");
//        }
//        Collections.sort(al);
//        System.out.println("\nafter sorting");
////        System.out.println();
//        for(int i = 0; i < al.size(); i++){
//            System.out.print(al.get(i) + " ");
//        }
    }
}