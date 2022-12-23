class Employee {
    public static int counter = 1;

    private String nameEmp;   // ФИО сотрудника

    private int department;    // номер отдела

    private double salary;     // зарплата сотрудника

    public int id;             // ID номер

    public Employee(String nameEmp, int department, double salary) {
        this.nameEmp = nameEmp;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ФИО: " + nameEmp + ", отдел: " + department + ", " +
                "зарплата: " + salary + ", ID: " + id;
    }
}
