import java.util.Objects;

public class Validation {
    public String validateInput(String color, Bag bag) {
        String result = "";
        if (!(color.equals("r") || color.equals("g") || color.equals("y") || color.equals("e"))) {
            result = "invalid Input";
        }
        if (bag.arrBall.size() == 12) {
            result = "Bag is full";
        }

        if (color.equals("y")) {
            int maxCount=(bag.arrBall.size()*4)/10;
            if (bag.arrBall.stream().filter(x -> Objects.equals(x.getColor(), "y")).toArray().length >= maxCount) {
                result = "Yellow Color Limit Reached(40%)";
            }
        } else if (color.equals("r")) {
            if ((bag.arrBall.stream().filter(x -> Objects.equals(x.getColor(), "r")).toArray().length + 1) > bag.arrBall.stream().filter(x -> Objects.equals(x.getColor(), "g")).toArray().length) {
                result = "Red Color Ball can Not be more than Green Balls...";
            }
        }
        return result;
    }
}
