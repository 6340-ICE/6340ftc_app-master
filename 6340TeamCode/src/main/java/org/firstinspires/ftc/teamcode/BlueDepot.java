package org.firstinspires.ftc.teamcode;

//TODO further testing of rev robotics hex motor encoders

//Import FTC modules

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Define as Autonomous
@Disabled
@Autonomous(name = "AutoTemplate", group = "Linear Opmode")
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
        gyroTurn(TURN_SPEED, 45, 5)        //Turn 45 degrees left
        gyroDrive(DRIVE_SPEED, 18, 45, 10 )//Move forward 18 inches
        gyroTurn(TURN_SPEED, 315, 5)//turn 90 degrees right
        gyroDrive(DRIVE_SPEED, 18, 315, 10)//move forward 18inches
        // drop trophy
        gyroTurn(TURN_SPEED, 235, 5)//turn 90 degrees right
        //move forward 7 feet


   }
}
