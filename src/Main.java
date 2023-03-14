public class Main {
    static int hw = 10;

    public static void main(String[] args) {
        hwTitle();
        task1();
        task2();
        task3();
        hwСompleted();
    }

    public static void hwTitle() {
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }

    public static void task1() {
        System.out.println("Задача 1");
        String
                firstName = "Mikhail",
                middleName = "Petrovich",
                lastName = "Stepanov",
                fullName = lastName + " " + firstName + " "+ middleName ;
        System.out.println("ФИО сотрудника: " + fullName);
        System.out.println("");
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Иванов Иван Иванович";
        System.out.println("Данные сотрудника для заполнения отчета: " + fullName.toUpperCase());
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Метёлкин Иван Семёнович";
        System.out.println("Исходные данные: " + fullName);
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные сотрудника, приведенные в соответствие с требованиями системы: " + fullName);
        System.out.println("");
    }

    public static void hwСompleted() {
        String hwStatus = " выполнено";
        System.out.print("Домашнее задание " + hw + hwStatus);
        System.out.println("");
    }

}