public class Manager extends Employee {

    Manager (long id, String name, double salary, int age, String gender) {
        super (id, name, salary, age, gender);

    }



    @Override
    public String toString () {
        return "Manager {" + "id: " + getId()
                + ", full name: " + getName()
                + ", salary: "+ getSalary()
                + ", age: " + getAge()
                + ", gender: " + getGender()
                + "}";
    }
    }


