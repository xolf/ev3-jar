import ch.aplu.ev3.*;

class Fun
{

    Fun()
      {
        LegoRobot robot = new LegoRobot();
        Motor motA = new Motor(MotorPort.A);
        robot.addPart(motA);
        motA.forward();
        Tools.delay(1000);
        LCD.drawString("Grap a coffee!", 0, 4);
        robot.exit();
    }
    
    public static void main(String[] args)
    {
        new Fun();
    }
}
