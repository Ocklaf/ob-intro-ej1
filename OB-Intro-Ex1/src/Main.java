
public class Main {

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3));

        Car myCar = new Car();
        myCar.modifyDoorsNumber(1);

        System.out.println(myCar.doors);
    }
}

class Car {
    public int doors = 2;

    public void modifyDoorsNumber(int newDoors) {
        this.doors += newDoors;
    }
}