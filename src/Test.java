public class Test {

    Test () {
        testHire();
        testPrint();
        testCalculateSalaryAndBonus();
        testEmployeeGetById ();
        testGetByName (); // не выводит имя, только хеш
        testSortByName();
        testSortByNameAndSalary();
        testEdit();
        testRemoveById ();

    }
    EmployeeService employeeService = new EmployeeService();
    void testHire() {

        Employee employee1 = new Employee(23659111, "Natasha", 800, 36, "F", 15, 0.10);
        Employee employee2 = new Employee(45895533, "Evgen", 850, 25, "M", 25, 0.10);
        Employee employee3 = new Employee(21254478, "Vitaliy", 700, 41, "M", 31, 0.10);
        Employee employee4 = new Employee(16547845, "Vitaliy", 50, 45, "M", 1, 0.10);
        Employee employee5 = new Employee(12654799, "Irina", 1000, 21, "F", 352, 0.10);

        employeeService.hire(employee1);
        employeeService.hire(employee2);
        employeeService.hire(employee3);
        employeeService.hire(employee4);
        employeeService.hire(employee5);
    }
    void testPrint(){
//        EmployeeService employeeService = new EmployeeService();
        employeeService.printEmployees();
    }
    void testCalculateSalaryAndBonus(){
        System.out.println(employeeService.calculateSalaryAndBonus());
    }

    void testEmployeeGetById (){
        System.out.println(employeeService.employeeGetById(23659111));
    }
void testGetByName () {
    System.out.println(employeeService.getByName("Irina"));
}
    void testSortByName() {
        employeeService.sortByName();
        employeeService.printEmployees();
    }
    void testSortByNameAndSalary() {
        employeeService.sortByNameAndSalary();
        employeeService.printEmployees();
    }
    void testEdit() {
        Employee natashaEdit = new Employee(23659111, "Natasha", 1800, 37, "F", 754, 0.17);
        System.out.println(employeeService.edit(natashaEdit));
        employeeService.printEmployees();
    }
    void testRemoveById () {
        employeeService.removeById(23659111);
        employeeService.printEmployees();
    }
}


//        EmployeeFactory employeeFactory = new EmployeeFactory();
//        Employee[] randomEmployees = employeeFactory.generateEmployees(5);
//
//        EmployeeService employeeService = new EmployeeService(randomEmployees);
//    EmployeeService employeeService = new EmployeeService();
//    Employee employee1 = new Employee(23659111, "Natasha", 800, 36, "F", 15, 0.10);
//    Employee employee2 = new Employee(45895533, "Evgen", 850, 25, "M", 25, 0.10);
//    Employee employee3 = new Employee(21254478, "Vitaliy", 700, 41, "M", 31, 0.10);
//    Employee employee4 = new Employee(16547845, "Vitaliy", 910, 45, "M", 1, 0.10);
//    Employee employee5 = new Employee(12654799, "Irina", 1000, 21, "F", 352, 0.10);
//
//        employeeService.hire(employee1);
//        employeeService.hire(employee2);
//        employeeService.hire(employee3);
//        employeeService.hire(employee4);
//        employeeService.hire(employee5);
////
//        employeeService.printEmployees();
////        System.out.println("Removed employee by ID: "+ employeeService.removeById(12000));
////        employeeService.printEmployees();
//        System.out.println("Sort by name:" + employeeService.sortByName());
////        System.out.println(employeeService.calculateSalaryAndBonus());
//    // System.out.println( employeeService.employeeGetById(16547845));
//
////            for (Employee employee : employeeService.getByName("Meow")){
////                System.out.println(employee);
////                }
//
//
//    //        employeeService.getByName("Natasha");


