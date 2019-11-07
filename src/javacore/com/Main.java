package javacore.com;

public class Main {

    public static void main(String[] args) {

        robotSay();

        System.out.println();

        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        Robot[] array = {robot, coffeRobot, robotDancer, robotCoocker};

        robotaRobota(array);

        System.out.println();

        animalParameters();

    }

    public static void robotaRobota(Robot[] robot) {
        for (int i = 0; i < robot.length; i++) {
            System.out.println(robot);
        }
    }

    public static void robotSay(){
        Robot robot = new Robot();
        robot.work();
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();
    }

    public static void animalParameters() {
        Animal animal = new Animal();
        animal.setName("Rebeka");
        animal.setAge(1);
        animal.setSpeed(5);

        String name = animal.getName();
        int age = animal.getAge();
        int speed = animal.getSpeed();

        System.out.print("Name of Animal: " + name + ";");
        System.out.print(" Age of Animal: " + age + "Year;");
        System.out.print(" Speed of Animal: " + speed + "km/h;");

    }

}