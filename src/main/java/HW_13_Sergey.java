import java.util.ArrayList;
import java.util.List;

public class HW_13_Sergey {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Tan");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Blue");

        System.out.println(colors);

        colors.remove("Yellow");
        colors.remove("Purple");
        colors.remove("Blue");

        System.out.println(colors);

        Object[] count = colors.toArray();
        for(Object color: count) {
            System.out.println(color);
        }
    }
}
