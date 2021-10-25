public class Test {

    Test() {
        testRandom();
        testHire();
        testPrint();
        testCalculateSalaryAndBonus();
        testEmployeeGetById();
        testGetByName(); // не выводит имя, только хеш
        testSortByName();
        testSortByNameAndSalary();
        testEdit();
        testRemoveById();

    }

    EmployeeService employeeService = new EmployeeService();

    void testHire() {

        Designer designer = new Designer(23659111, "Natasha", 800, 36, "F", 15.0, 20);
        Manager manager = new Manager(45895533, "Evgen", 850, 25, "M");
        Developer developerPhp = new Developer(21254478, "Vitaliy", 700, 41, "M", 31);
        Employee employee4 = new Employee(16547845, "Vitaliy", 50, 45, "M");
        Developer developer = new Developer(12654799, "Irina", 1000, 21, "F", 352);

        employeeService.hire(designer);
        employeeService.hire(manager);
        employeeService.hire(developerPhp);
        employeeService.hire(employee4);
        employeeService.hire(developer);
    }

    void testPrint() {
//        EmployeeService employeeService = new EmployeeService();
        employeeService.printEmployees();
    }

    void testCalculateSalaryAndBonus() {
        System.out.println(employeeService.calculateSalaryAndBonus());
    }

    void testEmployeeGetById() {
        System.out.println(employeeService.employeeGetById(23659111));
    }

    void testGetByName() {
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
        Employee natashaEdit = new Employee(23659111, "Natasha", 1800, 37, "F");
        System.out.println(employeeService.edit(natashaEdit));
        employeeService.printEmployees();
    }

    void testRemoveById() {
        employeeService.removeById(23659111);
        employeeService.printEmployees();
    }

    void  testRandom(){
        EmployeeFactory factory = new EmployeeFactory() ;
        Employee [] employees =factory.generateEmployees(15);
        EmployeeService service = new EmployeeService(employees);
        service.printEmployees();
    }
}



