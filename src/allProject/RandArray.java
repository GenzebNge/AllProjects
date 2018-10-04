package allProject;
import java.util.ArrayList;
import java.util.Collections;


public class RandArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=100; i<900; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<4; i++) {
            System.out.println(list.get(i ) + " ");
        }
    }

}
