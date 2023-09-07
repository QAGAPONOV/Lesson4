package src;

public class Employee {
    public int id;
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(int id, String name, String position, String email, String phone, int salary, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee(1, "Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee(2, "Ivanov Igor", "QA", "igrov@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Employee(3, "Yanex Igor", "AQA", "yanex@mailbox.com", "892312314", 50000, 45);
        persArray[3] = new Employee(4, "Vanos Yan", "Dev", "vanos@mailbox.com", "892312315", 60000, 48);
        persArray[4] = new Employee(5, "Daniels Jak", "Dev", "Daniel@mailbox.com", "892312316", 60000, 25);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print(persArray);
            }
        }
    }
}