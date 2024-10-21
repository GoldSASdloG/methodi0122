import java.util.Scanner;

public class Phone {
    public static String madeIn;
    private String number;
    protected String model;
    protected double weight;
    public int balans = 0;
    int pay = 0;


    public Phone(String number, String model, double weight, int balans) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.balans = balans;
    }

    public void answerCall(String name){
        answerCall(name, null);
    }
    public void answerCall(String name, String number) {
        System.out.println("Тебе звонит абонент: " + name + " с номером " + number);
    }
    public void balans(){
        System.out.println("навашем счету " + balans);
    }
    public void payBalans(){
        System.out.println("сколько денег вы хотите внести");
        int pay = new Scanner(System.in).nextInt();
        System.out.println("теперь на вашем счету " + (pay + balans));
    }
}

