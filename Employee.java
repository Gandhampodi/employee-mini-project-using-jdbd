package Employee;

public class Employee {
    private int age;
    private int salary;
    private String name;
    private int id;
    private String location ;

    public Employee(int age, int salary, String name, int id, String location) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public static void createEmployee(Object o) {
    }

    public static void UpdateCricketer(int i, String sai) {
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
