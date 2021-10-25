import java.util.Random;

public class Designer extends Employee {
    double rate;
    int workedDays;



    Designer (long id, String name, double salary, int age, String gender, double rate, int workedDays) {
        super (id, name, salary, age, gender);
        this.rate = rate;
        this.workedDays = workedDays;
}
//    ставка + rate * workedDays

    @Override
double calculateSalary () {
    Random random = new Random();
    double result = getSalary() + rate * workedDays;
    return result;
}
@Override
    public String toString (){
    return "Designer {" + "id: " + getId()
            + ", full name: " + getName()
            + ", salary: "+ getSalary()
            + ", age: " + getAge()
            + ", gender: " + getGender()
            + ", rate: " + rate
            + ", worked days: " + workedDays
            + "}";
}
}