import java.util.*;

public class EmployeeService {
    public EmployeeService() {
    }

    public EmployeeService(Employee[] employees) {
        this.employeesArr = employees;
    }


    int maxNumberEmployees = 5;
    int numberEmployees = 0;
    Employee[] employeesArr = new Employee[maxNumberEmployees];


    void hire(Employee employee) {
        employeesArr[0 + numberEmployees] = employee;
        numberEmployees++;
    }

    void printEmployees() {
        for (Employee employee : employeesArr) {
            System.out.println(employee);
        }
    }

    double calculateSalaryAndBonus() {
        double sumMonthSalaryBonus = 0;
        for (int i = 0; i < employeesArr.length; i++) {
            sumMonthSalaryBonus += employeesArr[i].getSalary() + employeesArr[i].fixedBugs * employeesArr[i].defaultBugRate;
        }
        return sumMonthSalaryBonus;
    }

    Employee employeeGetById(long id) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee currentEmployee = employeesArr[i];
            if (currentEmployee.getId() == id) {
                return currentEmployee;
            }
        }
        return null;
    }

    Employee[] getByName(String name) {
        int count = 0;
        for (Employee employee : employeesArr) {
            if (employee.getName() == name) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int index = 0;
        for (Employee employee : employeesArr)
            if (employee.getName() == name) {
                result[index] = employee;
                index++;
            }
        return result;
    }


    Employee[] sortByName() {
        Arrays.sort(employeesArr, Comparator.comparing(Employee::getName));
        return employeesArr;
    }

    Employee[] sortByNameAndSalary() {
        Arrays.sort(employeesArr, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        return employeesArr;
    }

    Employee edit(Employee employee) {
        Employee oldVersion;
        oldVersion = employeeGetById(employee.getId());
        for (int i = 0; i < employeesArr.length; i++) {
            if (oldVersion.getId() == employeesArr[i].getId()) {
                employeesArr[i] = employee;
            }

        }
        return oldVersion;
    }

    Employee removeById(long id) {
        int indexToRemove = -1;
        for (int i = 0; i < employeesArr.length; i++) {
            Employee employee = employeesArr[i];
            if (employee.getId() == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return null;
        }

        Employee[] newEmployeesArray = new Employee[employeesArr.length - 1];

        int newArrayCounter = 0;
        for (int i = 0; i < employeesArr.length; i++) {
            if (i != indexToRemove) {
                newEmployeesArray[newArrayCounter] = employeesArr[i];
                newArrayCounter++;
            }
        }
        Employee removedEmployee = employeesArr[indexToRemove];
        employeesArr = newEmployeesArray;
        return removedEmployee;
    }

    @Override
    public String toString() {
        return "!!!";
    }

}
