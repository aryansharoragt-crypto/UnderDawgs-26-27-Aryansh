package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class RobotLocationPractice {
    double angle;

    //constructor method

    public RobotLocationPractice(double angle) {
        this.angle = angle;

    }

    public double getHeading() {
        double angle = this.angle;
        while (angle>180) {
            angle -= 360;
        }

        while (angle<=-180) {
            angle += 360;
        }
        return angle;

    }
}
