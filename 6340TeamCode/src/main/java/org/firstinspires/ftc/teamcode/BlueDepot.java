package org.firstinspires.ftc.teamcode;

//TODO further testing of rev robotics hex motor encoders
//TODO Test on Field

//Import FTC modules

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Define as Autonomous
//@Disabled
@Autonomous(name = "Depot", group = "Linear Opmode")
public class BlueDepot extends Team6340Controls {

    @Override
    public void runOpMode() throws InterruptedException {
        // Initialize the hardware
        initializeHardware();


        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Waiting for Start.");
        telemetry.update();
        waitForStart();

        // Insert Autonomous Code Here

        //Land
        gyroTurn(TURN_SPEED, 50, 5);                     //Turn 50 degrees left
        gyroDrive(DRIVE_SPEED, 40, 50, 10 );    //Move forward 43 inches
        gyroTurn(TURN_SPEED, 320, 5);                    //turn 320 degrees right
        gyroDrive(DRIVE_SPEED, 50, 320, 10);    //move forward 43 inches
        gyroTurn(TURN_SPEED, 235, 5);                   //turn 90 degrees right
        trophy.setPosition(.7);                                       // drop trophy set servo .7/up
        gyroHold(TURN_SPEED,235,1);                                             //Wait 1.5 second
        gyroDrive(DRIVE_SPEED, 110,235,20);     //move forward 108 inches
        trophy.setPosition(1.0);                                         //set servo to .40/down

   }
}
