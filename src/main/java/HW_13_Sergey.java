import java.util.ArrayList;
import java.util.List;

public class HW_13_Sergey {

    public static void main(String[] args) {
        /**
         *  * Задача № 1
         */
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
        /**
         *  * Задача № 2
         */

        List<Integer> integerList = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            integerList.add (i);
        }
        System.out.println(integerList);

        /**
         *  * Задача № 3
         */
        for (int i = 100; i <= integerList.size(); i ++) {
            if (i % 2 == 0) {
                Integer j = integerList.get(i);
                System.out.println(j);
            }
        }
    }
}
