package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;

public class ColorSensor {

    NormalizedColorSensor colorSensor;

    public enum detectedColor {
        RED,
        BLUE,
        YELLOW,
        GREEN,
        UNKNOWN,

    }

    public void init(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class, "sensor_distance_color");
    }


}
