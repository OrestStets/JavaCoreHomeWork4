package javacore.com;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCoocker.work();

        Robot[] array = {robot, robotCoocker, robotDancer, coffeRobot};

        robotaRobota(array);

        Animal animal = new Animal();

        animal.setName("Rebeka");
        animal.setAge(1);
        animal.setSpeed(5);

        String name = animal.getName();
        int age = animal.getAge();
        int speed = animal.getSpeed();

        System.out.println();
        System.out.print("Name of Animal: " + name + ";");
        System.out.print(" Age of Animal: " + age + "Year;");
        System.out.print(" Speed of Animal: " + speed + "km/h;");


    }

    public static void robotaRobota(Robot[] robot) {
        for (int i = 0; i < robot.length; i++) {
            System.out.println(robot[i]);
        }
    }
}