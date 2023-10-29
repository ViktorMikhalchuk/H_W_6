public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkNumber(4,6));
        positiveOrNegativeNumber(-4);
        System.out.println(positivNegative(-6));
        printString("My string.", 3);
        System.out.println(isLeapYear(1980));
        System.out.println(isLeapYear(1981));
        System.out.println(isLeapYear(2020));

        }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 2;
        int b = 5;
        int res;
        res = a + b;
        if (res >= 0)
            System.out.println("Сума позитивна.");
        else
            System.out.println("Сума негативна");
    }
    public static void printColor() {
        int value = 12;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    public static void compareNumbers(){
        int a = 2;
        int b = 4;
        if(a>=b){
            System.out.println("\"a>=b\"");
        }else {
            System.out.println("\"a < b\"");
        }
    }
    //6. Написати метод, який приймає на вхід два цілих числа і перевіряє,
    // що їхня сума лежить в межах від 10 до 20 (включно), якщо так – повернути true,
    // інакше – false.
    public static boolean checkNumber(int a, int b){
        int sum = a+b;
        return sum>=10 && sum<=20;
    }
    public static void positiveOrNegativeNumber(int a){
        if(a>=0){
            System.out.println("Positive number");
        }else{
            System.out.println("Number is negagive");
        }
    }
    //8. Написати метод, якому як параметр передається ціле число.
    // Метод повинен повернути true, якщо число є негативним,
    // і повернути false якщо позитивне.
    public static boolean positivNegative(int num){
        return num < 0;
    }
//9. Написати метод, якому як аргументи передається рядок і число,
// метод повинен надрукувати в консоль зазначений рядок,
// вказану кількість разів;
    public static void printString(String str, int num){
        for(int i=0;i<num;i++){
            System.out.println(str);
        }
    }
    //10. * Написати метод, який визначає, чи є рік високосним,
    // і повертає boolean (високосний – true, не високосний – false).
    // Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
