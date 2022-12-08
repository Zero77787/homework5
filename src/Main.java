import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();

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
    public static void Task4() {
        System.out.println("Задача 4");
        Scanner name1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = name1.next();
        {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void Task5() {
        System.out.println("Задача 5");
        Scanner t = new Scanner(System.in);
        System.out.println("Введите число:");
        int t1 = t.nextInt();
        {
            System.out.println("Температура воздуха сегодня: " + t1 + " градусов");
        }
    }
    public static void Task6() {

        System.out.println("Задача 6");
        Scanner day = new Scanner(System.in);
        System.out.println("Введите день в формате ДД ");
        int d = day.nextInt();
        Scanner month = new Scanner(System.in);
        System.out.println("Введите месяц в формате ММ ");
        int m = month.nextInt();
        Scanner year = new Scanner(System.in);
        System.out.println("Введите день в формате ГГГГ ");
        int y = year.nextInt();
        String dayMonthYear = (d + "." + m + "." + y);
        System.out.println(dayMonthYear);
    }
    public static void Task7() {
        System.out.println("Задача 6");
        Scanner userName = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String uN = userName.nextLine();
        Scanner assistantName = new Scanner(System.in);
        System.out.println("Введите имя помощника: ");
        String aN = assistantName.nextLine();
        Scanner messadge = new Scanner(System.in);
        System.out.println("Введите количество сообщений: ");
        String mes = messadge.nextLine();
        String finalMessadge = ("Привет, " +uN+" ! "+ "Это твой помощник "+aN+" . "+ "У тебя "+ mes+ " новых писем.");
        System.out.println(finalMessadge);

    }
}