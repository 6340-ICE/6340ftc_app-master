package org.firstinspires.ftc.teamcode;

//TODO further testing of rev robotics hex motor encoders
//TODO test on wednesday...

//Import FTC modules

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Define as Autonomous
//@Disabled
@Autonomous(name = "RedCrater", group = "Linear Opmode")
public class
RedCrater extends Team6340Controls {

    @Override
    public void runOpMode() {
        // Initialize the hardware
        initializeHardware();


        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Waiting for Start.");
        telemetry.update();
        waitForStart();

        // Insert Autonomous Code Here

       gyroTurn(TURN_SPEED, 45, 5);         // Turn 45 Degrees Left
       gyroDrive(DRIVE_SPEED, 42, 45);      // Move Forward 42 Degrees
       gyroTurn(TURN_SPEED, 135, 5);        // Turn Left 90 Degrees (Heading 130 Inches)
       gyroDrive(DRIVE_SPEED, 66, 135);     // Move Forward 66 Inches
       trophy.setPosition(.75);                           // Deliver Trophy
       gyroDrive(DRIVE_SPEED, -100, 135);   // Move Reverse 100 Inches


   }
}
