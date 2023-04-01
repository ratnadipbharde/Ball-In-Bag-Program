import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bag {
     public List<Ball>arrBall;

    public Bag() {
        arrBall = new ArrayList<>();
    }

    public void showBag() {

        for (int i = 0; i < arrBall.size(); i++) {
            String color = Objects.equals(arrBall.get(i).getColor(), "r") ? "Red" : Objects.equals(arrBall.get(i).getColor(), "y") ? "Yellow" : "Green";
            String strOutput = "Ball No." + arrBall.get(i).getId() + " Color - " + color;
            System.out.println(strOutput);
        }
    }

}
