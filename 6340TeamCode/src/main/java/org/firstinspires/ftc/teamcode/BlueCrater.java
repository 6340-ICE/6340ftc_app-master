package org.firstinspires.ftc.teamcode;

//TODO further testing of rev robotics hex motor encoders
//TODO Test on Field
//Import FTC modules

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Define as Autonomous
//@Disabled
@Autonomous(name = "Crater", group = "Linear Opmode")
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
        gyroTurn(TURN_SPEED, 45, 5);                       // Turn 45 degrees left
        gyroDrive(DRIVE_SPEED, 47, 45, 10);      // Move Forward 42"
        gyroTurn(TURN_SPEED, 130, 5);                   // Turn Left 90 degrees (Heading 130)
        gyroDrive(DRIVE_SPEED, 66, 130, 100); // Move forward 66"
        gyroTurn(TURN_SPEED, 235, 5);               //Turn to face crater
        trophy.setPosition(.7);                                    // Deliver Trophy
        gyroDrive(DRIVE_SPEED, 108,235,20);     //move forward 108 inches
        trophy.setPosition(1.0);
    }}
