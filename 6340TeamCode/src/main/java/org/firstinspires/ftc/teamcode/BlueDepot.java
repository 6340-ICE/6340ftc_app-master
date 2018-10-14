package org.firstinspires.ftc.teamcode;

//TODO further testing of rev robotics hex motor encoders

//Import FTC modules

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Define as Autonomous
//@Disabled
@Autonomous(name = "BlueDepot", group = "Linear Opmode")
public class BlueDepot extends Team6340Controls {

    @Override
    public void runOpMode() {
        // Initialize the hardware
        initializeHardware();


        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Waiting for Start.");
        telemetry.update();
        waitForStart();

        // Insert Autonomous Code Here

        //Land
        gyroTurn(TURN_SPEED, 50, 5);                     //Turn 50 degrees left
        gyroDrive(DRIVE_SPEED, 43, 50, 10 );    //Move forward 43 inches
        gyroTurn(TURN_SPEED, 320, 5);                    //turn 320 degrees right
        gyroDrive(DRIVE_SPEED, 45, 320, 10);    //move forward 43 inches
        trophy.setPosition(.75);                                        // drop trophy
        gyroTurn(TURN_SPEED, 235, 5);                    //turn 90 degrees right
        gyroDrive(DRIVE_SPEED, 108,235,20);      //move forward 108 inches


   }
}
