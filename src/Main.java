public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа. 1 курс");
        employeeArray[0] = new Employee("Андреева Ирина Анатольевна", 1, 500_515.00);
        employeeArray[1] = new Employee("Иванов Андрей Иванович", 3, 400_414.00);
        employeeArray[2] = new Employee("Петрова Елена Аркадьевна", 2, 300_313.00);
        employeeArray[3] = new Employee("Веселова Наталья Николаевна", 1, 400_420.00);
        employeeArray[4] = new Employee("Гладышева Вера Борисовна", 5, 500_211.00);
        employeeArray[5] = new Employee("Годунов Олег Витальевич", 4, 400_000.00);
        employeeArray[6] = new Employee("Романов Роман Романович", 5, 250_515.00);
        employeeArray[7] = new Employee("Уткин Николай Николаевич", 4, 380_415.00);
        employeeArray[8] = new Employee("Голубев Сергей Савельевич", 2, 500_414.00);
        employeeArray[9] = new Employee("Шатилова Алиса Дмитриевна", 1, 500_566.00);
        System.out.println("Список всех сотрудников с указанием ФИО, номера отдела, зарплаты и ID:");
        printList();
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + sumSalary());
        System.out.println("Минимальная зарплата у сотрудника: " + findEmployeeMinSalary());
        System.out.println("Максимальная зарплата у сотрудника: " + findEmployeeMaxSalary());
        System.out.println("Среднее значение зарплат составляет " + averageSalary());
        System.out.println("Список всех сотрудников с указанием ФИО:");
        printNameEmp();
    }
    public static void printList() {
        for (Employee emp : employeeArray) {
            System.out.println(emp);
        }
    }
    public static double sumSalary() {
        double sum = 0;
        for (Employee emp : employeeArray) {
            sum = emp.getSalary()+ sum;
        }
        return sum;
    }
    public static String findEmployeeMinSalary() {
        double min = employeeArray[0].getSalary();
        int ind =0;
        for (int i = 1; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < min) {
                min = employeeArray[i].getSalary();
                ind = i;
            }
        }
        return employeeArray[ind].getNameEmp() + " - " + min;
    }
    public static String findEmployeeMaxSalary() {
        double max = employeeArray[0].getSalary();
        int ind=0;
        for (int i = 1; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() > max) {
                max = employeeArray[i].getSalary();
                ind = i;
            }
        }
        return employeeArray[ind].getNameEmp() + " - " + max;
    }
    public static double averageSalary() {
        return sumSalary()/ employeeArray.length;
    }
    public static void printNameEmp() {
        for (Employee emp : employeeArray) {
            System.out.println(emp.getNameEmp());
        }
    }
}