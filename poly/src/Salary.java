class Employe{
    String name;

    Employe(String name){
        this.name = name;
    }

    public void calculateSalary(){
        System.out.println(name + "'s Salary = Not Defined");
    }
}
class Managerr extends Employe{
    Managerr(String name){
        super(name);
    }


    @Override
    public void calculateSalary(){
        System.out.println(name + "'s Salary = 70000");
    }
}
class Developerr extends Employe {
    Developerr(String name) {
        super(name);
    }


    @Override
    public void calculateSalary() {
        System.out.println(name + "'s Salary = 80000");
    }
}
class Internn extends Employe {
    Internn(String name) {
        super(name);
    }


    @Override
    public void calculateSalary() {
        System.out.println(name + "'s Salary = 5000");
    }
}

public class Salary {
    public static void main(String[] args) {
        Employe emp;

        emp = new Managerr("Alphin");
        emp.calculateSalary();
        emp = new Developerr("Megha");
        emp.calculateSalary();
        emp = new Internn("Tinu");
        emp.calculateSalary();
    }
}
