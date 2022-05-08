public class Test {

    public static void main(String[] args) {


    Employee employee1 = new Employee();
    employee1.person.name = "Sergey";
    employee1.salary = 150000;

    Employee employee2 = new Employee();
    employee2.person.name = "Olga";
    employee2.salary = 200000;

    Salary salary = new Salary();

    // employeesArray просто название переменной любое можно просто назвать array.
    Employee[] employeesArray = {employee1, employee2};
    // sum считаеться сумма двух работников
        System.out.println(salary.getSum(employeesArray));

        System.out.println(employee1.isSameName(employee2));
    }
}
