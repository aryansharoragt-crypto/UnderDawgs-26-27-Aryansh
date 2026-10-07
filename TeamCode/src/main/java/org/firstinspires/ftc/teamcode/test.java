package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Forward Motor Test", group = "Test")
public class test extends OpMode {

    private DcMotor motor;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor_0");
        motor.setPower(0);
        telemetry.addData("Motor Power:", motor.getPower());
        telemetry.update();
    }

    @Override
    public void loop() {
        double y = -gamepad1.left_stick_y;
        motor.setPower(y);
        telemetry.addData("Motor Power:", motor.getPower());
        telemetry.update();
    }

    @Override
    public void stop() {
        motor.setPower(0);
    }
}
