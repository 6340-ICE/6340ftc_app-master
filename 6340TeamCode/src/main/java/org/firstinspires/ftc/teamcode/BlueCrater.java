package org.firstinspires.ftc.teamcode;

//TODO further testing of rev robotics hex motor encoders

//Import FTC modules

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Define as Autonomous
@Disabled
@Autonomous(name = "BlueCrater", group = "Linear Opmode")
public class
BlueCrater extends Team6340Controls {

    @Override
    public void runOpMode() {
        // Initialize the hardware
        initializeHardware();


        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Waiting for Start.");
        telemetry.update();
        waitForStart();

        // Insert Autonomous Code Here
        gyroTurn(TURN_SPEED, 45, 5);                     // Turn 45 degrees left
        gyroDrive(DRIVE_SPEED, 42, 45, 10);     // Move Forward 42"
        gyroTurn(TURN_SPEED, 130, 5);                   // Turn Left 90 degrees (Heading 130)
        gyroDrive(DRIVE_SPEED, 66, 130, 10);   // Move forward 66"
        trophy.setPosition(.75);                                     // Deliver Trophy
        gyroDrive(DRIVE_SPEED, -100, 130, 10); // Move Reverse 100"
        trophy.setPosition(.40);                                    //Resets the servo
        //program written but not tested
}
