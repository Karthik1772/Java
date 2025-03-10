import java.util.ArrayList;
import java.util.List;

public class string14 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(10);
        
        s.add(20);
        s.add(30);
        s.add(40);
        s.remove(2);
        s.set(2, 30);
        System.out.println(s);
        String st = "karthik ,s ,kashyap";

        System.out.println(st.startsWith("ka"));
        System.out.println(st.endsWith("ap"));
        System.out.println();
    }

}
