public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firsName, middleName);
        System.out.println("ФИО сотрудника - " + fullName);


    }

    public static void task2() {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

    }

    public static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + replaceFullName);
    }
}