import ch.aplu.ev3.*;

class Move
{
    forWard(int go)
    {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.forward(go);
        robot.exit();
    }

    public static void main(String[] args)
    {
        new Move();
    }
}  
