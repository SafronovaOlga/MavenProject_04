public class Person {
    String name;
    char gender;
    int age;
    String getName () {
        if (gender == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
}
