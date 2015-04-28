import ch.aplu.ev3.*;

class Bot
{
    public static void forWard(int ms)
    //Duration in ms
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.forward(ms);
        robot.exit();
    } 
    public static void turnLeft(int ms)
    //Duration in ms
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.left(ms);
        robot.exit();
    }
    public static void turnRight(int ms)
    //Duration in ms
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.right(ms);
        robot.exit();
    }

    public static void main(String[] args)
    {
        Bot = new Bot();
        Bot.forWard(1000);
    }
}  
