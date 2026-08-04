import java.util.ArrayList;
import java.util.List;

public class string {
    public static void main(String[] args) {
       List<Integer> s = new ArrayList<>();
       s.add(10);
       s.add(20);
       s.add(30);
       s.add(40);
       s.remove(2);
       s.set(2,30);
       System.out.println(s);
       String st= "roshan,kundar";
       String[] parts = st.split(",");
      System.out.println( st.startsWith("Ro"));
      System.out.println( st.endsWith("ar"));
      System.out.println(parts[0]);
      System.out.println(parts[1]);
      System.out.println(st.replace("h","H"));
      System.out.println(st.replaceAll("Roshan", "Rakesh"));
      System.out.println(st.replaceFirst("kundar", "S"));
      System.out.println(st.toUpperCase());
      System.out.println(st.toLowerCase());
      System.out.println(st.indexOf("a"));
      System.out.println(st.lastIndexOf("a"));
    }
}
