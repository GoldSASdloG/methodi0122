package fish;

import java.util.Scanner;

public class Oxygen {
    private double oxygenPressure;

    public Oxygen(double oxygenPressure) {
        this.oxygenPressure = oxygenPressure;
    }
    public void checkDangerOxygen(){
        if (oxygenPressure < 80){
            System.out.println("Внимание низкий уровень кислорода");
        }if (oxygenPressure > 120){
            System.out.println("Внимание высокий уровень кислорода");
        }else {
            System.out.println("Кислород в норме!");
        };
    }
    public double inputOxygen(){
        System.out.println("введите показание кислорода");
        return new Scanner(System.in).nextDouble();
    }
}
