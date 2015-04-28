import ch.aplu.ev3.*;

class Bot
{
    forWard(int ms)
    //Duration in ms
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.forward(ms);
        robot.exit();
    } 
    turnLeft(int ms)
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.left(ms);
        robot.exit();
    }
    turnRight(int ms)
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.left(ms);
        robot.exit();
    }

    public static void main(String[] args)
    {
        Bot = new Bot();
        Bot.forWard()
    }
}  
