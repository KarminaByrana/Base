public class Employee {

    private long id;
    private String name;
    private int age;
    private double salary;
    private String gender;
    int fixedBugs;
    double defaultBugRate;

    Employee () {


    }

    Employee (long id, String name, double salary, int age, String gender, int fixedBugs, double defaultBugRate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;

        }
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString () {
        return "Employee {" + "id: " + id
                + ", full name: " + name
                + ", salary: "+ salary
                + ", age: " + age
                + ", gender: " + gender
                + ", fixedBugs: " + fixedBugs
                + ", defaultBugRates: " + defaultBugRate
                + "}";
        }
    }
