import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point>{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p){
        if(this.y > p.y) return -1;
        else if(this.y < p.y) return 1;
        else{
            if(this.x > p.x) return 1;
            else if(this.x < p.x) return -1;
            return 0;
        }
    }
}
