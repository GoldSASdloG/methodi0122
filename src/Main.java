import java.util.Scanner;

public class Main {
    private static int a = 0;
    protected static int b;
    public static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        Phone phone = new Phone("347565476473", "a67", 34.3, 500);
        Phone.madeIn = "chinaaaa";
        System.out.println(phone.model);
        System.out.println(phone.weight);
        phone.answerCall("artem", "4536473645");
        while (true){
            phone.balans();
            phone.payBalans();
        }

//        printArray();
//        array[4] = getInput();
//        printArray();
//        a = getInput();
//        b = getInput();
//        printMethod();
    }

    private static void printMethod() {
        System.out.println(summaAB() % 2 == 0 ? "chet" : "nechet");
    }

    private static int getInput() {
        System.out.println("vvedite chislo");
        return new Scanner(System.in).nextInt();
    }

    public static int summaAB(){
        System.out.println("Сумма АБ = " + (a+b));
        return a+b;
    }

    public static void printArray(){
        for (int j : array) {
            System.out.println(j);
        }
    }
}