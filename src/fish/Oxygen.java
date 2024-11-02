package fish;

import java.util.Scanner;

public class Oxygen {
    private double oxygenPressure;

    public Oxygen() {
    }
    public void checkDangerOxygen(){
        double oxy = inputOxygen();
        if (oxy < 80){
            System.out.println("Внимание низкий уровень кислорода");
        } else if (oxy > 120){
            System.out.println("Внимание высокий уровень кислорода");
        } else System.out.println("Кислород в норме!");
    }
    public double inputOxygen(){
        System.out.println("введите показание кислорода");
        return new Scanner(System.in).nextDouble();
    }
}
