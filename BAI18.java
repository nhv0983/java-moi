package spc.edu;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class BAI18 {
    public static void main(String[] args) {
        System.out.println("Học tạo arraylist");
        ArrayList ds = new ArrayList();
        for (int i = 1; i < 10; i++) {
            ds.add(i);
        }
        ds.add("cong trang");
        ds.remove(6);
        ds.removeFirst();
        ds.removeLast();
        for (int i = 0; i < ds.size(); i++) {
            System.out.print(ds.get(i)+" ");
        }
}   }