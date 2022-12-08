import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();

    }

    public static void Task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String midlleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + midlleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void Task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan ";
        String midlleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + midlleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void Task3() {
        System.out.println("Задача 3");
        String firstName = "Семён ";
        String midlleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + midlleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}