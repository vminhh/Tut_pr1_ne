package Class.tut7;

public class EmployeeTester {
    public static void main (String[] args){
        Employee em = new Employee("Minh", 90000);
        em.raiseSalary(55);
        System.out.println(em.getName() + " is paid $" + em.getSalary() + "/month");
    }
}
