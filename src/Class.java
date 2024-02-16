public class Class {
    public class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;

        public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void printInfo() {
            System.out.println("Full Name: " + fullName);
            System.out.println("Position: " + position);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age);
            System.out.println("-----------------------");
        }

        public void main(String[] args) {
            Employee[] employees = new Employee[5];
            employees[0] = new Employee("Иванов Иван", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            employees[1] = new Employee("Petrov Petr", "Manager", "petr@mailbox.com", "891234567", 40000, 45);
            employees[2] = new Employee("Sidorov Sidr", "Developer", "sidr@mailbox.com", "890987654", 35000, 50);
            employees[3] = new Employee("Kuznetsov Kuzma", "Designer", "kuzma@mailbox.com", "899876543", 32000, 35);
            employees[4] = new Employee("Smirnov Semyon", "Analyst", "semyon@mailbox.com", "896543210", 38000, 42);

            for (Employee employee : employees) {
                if (employee.age > 40) {
                    employee.printInfo();
                }
            }
        }
    }
}