import java.math.*;
import java.util.*;

public class EmployeeFactory {

    static Employee[] generateEmployees(int size) {
        Employee[] randomEmployees = new Employee[size];
        Random random = new Random();
        String[] maleName = {"Аарон", "Аарон", "Бронислав", "Аарон",
                "Эдуард", "Вальдемар", "Ефрей", "Карен",
                "Харитон", "Юнус", "Хаким", "Бронислав"};
        String[] femaleName = {"Берта", "Арианда", "Вилена", "Лейла",
                "Цецилия", "Ума", "Эвелина", "Франшишка",
                "Хилари", "Ираида", "Лиана", "Лиана"};
        for (int i = 0; i < randomEmployees.length; i++) {
            Employee employee = new Employee();
            boolean genderRandom = random.nextBoolean();
            if (genderRandom) {
                employee.setGender("M");
                employee.setGender(maleName[random.nextInt(maleName.length)]);
            } else {
                employee.setGender("F");
                employee.setName(femaleName[random.nextInt(femaleName.length)]);
            }
            employee.setId(i + 12000);
            employee.setAge(random.nextInt(47) + 18);
            employee.setSalary(new BigDecimal(random.nextDouble() * 10000 + 5000).setScale(2, RoundingMode.HALF_UP).doubleValue());
            employee.fixedBugs = random.nextInt(324) + 1;
            employee.defaultBugRate = new BigDecimal(random.nextDouble() * 10000 + 5000).setScale(2, RoundingMode.HALF_UP).doubleValue();

            randomEmployees[i] = employee;
        }

        return randomEmployees;
    }
}