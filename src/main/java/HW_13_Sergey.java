import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println("1_2");
        // 1_2
        Iterator<String> iterator = colors.listIterator();
        while (iterator.hasNext()){
            if(iterator.next().contains("l")){
                iterator.remove();
            }
        }
        System.out.println(colors);
        /**
         *  * Задача № 2
         */

        List<Integer> integerList = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            integerList.add (i);
        }
        System.out.println(integerList);

        System.out.println("2_2");
        for(int i = integerList.size(); i-- > 0;){
            if(integerList.get(i) % 2 == 0){
                integerList.remove(i);
            }
        }
        System.out.println(integerList);

        /**
         *  * Задача № 3
         */

        System.out.println("3_2");
        for (Integer i = integerList.size(); i--> 0;){
            if (integerList.get(i) % 2 == 0){
               integerList.remove(i.intValue());
            }
        }
        System.out.println(integerList);

    }
}
