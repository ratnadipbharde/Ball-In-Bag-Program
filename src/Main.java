import java.util.Scanner;

public class Main {
    static Bag bag = new Bag();

    static String addBall() {
        System.out.println("Enter Your Ball Color (r-Red ,g-Green, y-Yellow, e-Exit)");
        Scanner sc = new Scanner(System.in);
        String color = sc.next().toLowerCase();
        if (color.equals("e")) {
            return color;
        }
        Validation validation = new Validation();
        String result = validation.validateInput(color, bag);
        if (result.equals("")) {
            Ball ball = new Ball(bag.arrBall.size() + 1, color);
            bag.arrBall.add(ball);
            System.out.println("Ball is added...");
        } else System.out.println(result);
        return color;
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String color = addBall();
        if (!color.equals("e")) {
            String continueI = "y";
            while (continueI.equals("y")) {
                System.out.println("do you want to continue? (y/n)");
                Scanner sc = new Scanner(System.in);
                continueI = sc.next().toLowerCase();
                if (continueI.equals("n")) {
                    bag.showBag();
                } else {
                   color= addBall();
                   if (color.equals("e"))
                       break;
                }
            }
        }
    }
}