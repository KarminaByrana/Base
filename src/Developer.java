import java.util.*;
public class Developer extends Employee {

    int fixedBugs;


    Developer (long id, String name, double salary, int age, String gender, int fixedBugs) {
      super (id, name,salary, age, gender);
      this.fixedBugs = fixedBugs;
    }

    @Override
    double calculateSalary () {
        Random random = new Random();
        double result = (getSalary() + fixedBugs * 2.5) * (random.nextBoolean() ? 2 : 0);
        return result;
    }
    @Override
    public String toString () {
        return "Developer {" + "id: " + getId()
                + ", full name: " + getName()
                + ", salary: "+ getSalary()
                + ", age: " + getAge()
                + ", gender: " + getGender()
                + ", fixed bugs: " + fixedBugs
                + "}";
    }
}