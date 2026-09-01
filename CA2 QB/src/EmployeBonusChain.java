class Employee{
    int salary;
    final String CompanyName;

    Employee(String CompanyName, int salary) {
        this.CompanyName = CompanyName;
        this.salary = salary;
    }
        double calculateBonus(){
            return salary * .05;
        }
}
    class Manager extends Employee{
        Manager(String CompanyName, int salary){
            super(CompanyName, salary);
        }
        @Override
        double calculateBonus(){
            return salary * .10;
        }
    }
    class SeniorManager extends Manager{
        double retentionbonus;
        SeniorManager(String CompanyName, int salary, double retentionbonus){
            super(CompanyName, salary);
            this.retentionbonus = retentionbonus;
        }
        @Override
        double calculateBonus(){
            return salary * .15 + retentionbonus;
        }
    }


    public class EmployeBonusChain{
        public static void main(String[] args){
            Employee e = new Employee("XL Dynamics", 20000);
            Manager m = new Manager("XL Dynamics", 20000);
            SeniorManager s = new SeniorManager("XL Dynamics", 20000, 1000);

            System.out.println("Employee : " +e.calculateBonus());
            System.out.println("Manager : " +m.calculateBonus());
            System.out.println("Senior Manager : " +s.calculateBonus());

        }
    }





