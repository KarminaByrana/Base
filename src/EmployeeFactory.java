import java.math.*;
import java.util.*;

public class EmployeeFactory {

    Employee[] generateEmployees(int size) {
        Employee[] randomEmployees = new Employee[size];
        Random random = new Random();
        String[] maleName = {"Аарон", "Аарон", "Бронислав", "Аарон",
                "Эдуард", "Вальдемар", "Ефрей", "Карен",
                "Харитон", "Юнус", "Хаким", "Бронислав"};
        String[] femaleName = {"Берта", "Арианда", "Вилена", "Лейла",
                "Цецилия", "Ума", "Эвелина", "Франшишка",
                "Хилари", "Ираида", "Лиана", "Лиана"};
        for (int i = 0; i < randomEmployees.length; i++) {
            String gender;
            String name;
            boolean genderRandom = random.nextBoolean();
            if (genderRandom) {
                gender = "M";
                name = maleName[random.nextInt(maleName.length)];
            } else {
                gender = "F";
                name = femaleName[random.nextInt(femaleName.length)];
            }
            long id = i + 12000;
            int age = random.nextInt(47) + 18;
            double salary = new BigDecimal(random.nextDouble() * 10000 + 5000).setScale(2, RoundingMode.HALF_UP).doubleValue();
            int fixedBugs = random.nextInt(324) + 1;
            double rate = new BigDecimal(random.nextDouble() * 10000 + 5000).setScale(2, RoundingMode.HALF_UP).doubleValue();
            int workedDays = random.nextInt(30);
            int randomizer = random.nextInt(3) + 1;
            if (randomizer == 1) {
                randomEmployees[i] = new Developer(id, name, salary, age, gender, fixedBugs);
            } else if (randomizer == 2) {
                randomEmployees[i] = new Designer(id, name, salary, age, gender, rate, workedDays);
            } else if (randomizer == 3) {
                randomEmployees[i] = new Manager(id, name, salary, age, gender);
            } else {
                randomEmployees[i] = new Employee(id, name, salary, age, gender);
            }

        }

        return randomEmployees;
    }
}