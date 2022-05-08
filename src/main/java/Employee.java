public class Employee {
    Person person = new Person();
    int salary;
    boolean isSameName (Employee employee) {
        /**
         * это метод для сравнения строк
         *  else  return person.name.equals(employee.person.name;
         */

        if (person.name.equals(employee.person.name)) {
            return true;
        } else {
            return false;
        }
    }
    public int getBaseSalary () {
        return salary;
    }
    public void setBaseSalary (int salary) {
        this.salary = salary;
    }
    public double getSalary () {
        return salary;
    }


}
