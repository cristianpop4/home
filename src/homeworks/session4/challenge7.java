package homeworks.session4;

public class challenge7 {
    public static void main(String[] args) {
        int sideOne = 4;
        int sideTwo = 4;
        int sideThree = 6;
        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("The triangle is equilateral");
        } else if ((sideOne == sideTwo && sideThree != sideOne) || (sideOne == sideThree && sideOne != sideTwo) || (sideTwo == sideThree && sideTwo!= sideOne)) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }
    }
}
