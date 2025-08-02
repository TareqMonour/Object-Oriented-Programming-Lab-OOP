import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point>{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p){
        if(this.x > p.x) return -100;
        else if(this.x < p.x) return 20;
        else{
            if(this.y > p.y) return -1;
            else if(this.y < p.y) return 1;
            return 0;
        }
    }
}

public class ArraylistCheck {
    public static void main(String[] args) {

        ArrayList<Point> pl = new ArrayList<>();
        pl.add(new Point(1, 2));
        pl.add(new Point(4, -1));
        pl.add(new Point(1, -3));

        for(int i = 0; i < pl.size(); i++){
            System.out.println(pl.get(i).x + " " + pl.get(i).y);
        }

        Collections.sort(pl);
        System.out.println("after sorting");

        for(int i = 0; i < pl.size(); i++){
            System.out.println(pl.get(i).x + " " + pl.get(i).y);
        }

//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(1);
////        System.out.println(al.size());
//        al.add(10);
////        System.out.println(al.size());
//
//        al.set(0, 6);
//        al.add(2);
//        al.add(-2);
//        for(int i = 0; i < al.size(); i++){
//            System.out.print(al.get(i) + " ");
//
//        }
//
//        Collections.sort(al);
//        System.out.println("\nafter sorting");
//
//        for(int i = 0; i < al.size(); i++){
//            System.out.print(al.get(i) + " ");
//
//        }
//        System.out.println();
    }
}