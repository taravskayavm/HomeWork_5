package HomeWork_5;

public class HomeWork_5 {

    public static void main(String[] args) {

        Employee[] persone = new Employee[5]; //массив с использованием конструктора
        persone[0] = new Employee("Дубынин Иван Иванович", "Переворачиватель пингвинов", "penguin@pochta.ru", "450326", 120000, 32);
        persone[1] = new Employee("Серая Ольга Борисовна", "Менеджер", "greyolga@pochta.ru", "46531", 70000, 30);
        persone[2] = new Employee("Будков Анатолий Леонидович", "Бухгалтер", "budkoff@pochta.ru", "41316", 70000, 45);
        persone[3] = new Employee("Алешин Артем Евгеньевич", "Директор", "aleshinAE@pochta.ru", "41216", 150000, 51);
        persone[4] = new Employee("Акулова Марина Витальевна", "Связист", "marinaakula@pochta.ru", "44532", 50000, 25);

        for (Employee employee : persone)
            if (employee.getAge() > 40) // цикл для сотрудников старше 40
                System.out.println(employee);

    }

}


package HomeWork_5;

class Employee {

    private String name; // ФИО
    private String position; // должность
    private String email; // адрес электронной почты
    private String phoneNumber; // номер телефона
    private int salary; // зарплата
    private int age; // возраст


    Employee() {

    }

    public Employee (String name, String position, String email, String phoneNumber, int salary, int age) {
    //конструктор
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override //переопределенный метод
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phoneNumber + "\n-"
                + salary + "\n-"
                + age);

    }


    public int getAge() {
        return age; // вывод возраста на консоль
    }


    void displayInfo() {
        System.out.printf("Имя: %s; Должность: %s; E-mail: %s; Телефонный номер: %s; Зарплата: %d; Возраст: %d\n",
                name,
                position,
                email,
                phoneNumber,
                salary,
                age);

    }


}
