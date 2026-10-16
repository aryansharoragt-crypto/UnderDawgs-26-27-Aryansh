
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "test", group = "Test")
public class test extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        telemetry.addData("Age:", "67");
        }
    }
}