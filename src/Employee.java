package day06;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        //calculate tax!
        if(this.salary>=1000) {
                return this.salary*0.03;
        }
        return 0;
    }
    public double bonus() {
        if(this.workHours>40) {
            return (this.workHours-40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear =2022;

        if (currentYear- this.hireYear < 10) {

            return this.salary*0.05;

        }else if(currentYear - this.hireYear >= 10 && currentYear - this.hireYear<20) {

            return this.salary*0.10;

        }else if(currentYear - this.hireYear >=20) {

            return this.salary*0.15;

        }else {
            System.out.println("Out of range!");
            return 0;
        }
    }
    public void printEmployee() {
        //print what is known about employee
        System.out.println("Employee name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Work Hours : "+this.workHours);
        System.out.println("Hire Year : "+this.hireYear);
        System.out.println("Tax : "+this.tax());
        System.out.println("Bonus : "+this.bonus());
        System.out.println("Salary Increase : "+this.raiseSalary());
        double totalSalary = this.salary + this.bonus() + this.raiseSalary() - this.tax();
        System.out.println("Salary with Taxes and Bonuses : "+(this.salary + this.bonus()-this.tax()));
        System.out.println("Total Salary : "+totalSalary);
    }
}