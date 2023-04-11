// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LedColor;

public class LedSubsystem extends SubsystemBase {

    public LedColor color;
    private Spark blinkin;

    public LedSubsystem(Spark blinkin) {
        this.blinkin = blinkin;
    }

    public void setAllianceColor() {
    if (DriverStation.getAlliance() == Alliance.Blue)
        blinkin.set(LedColor.BLUE_ALLIANCE.color());
    else 
        blinkin.set(LedColor.RED_ALLIANCE.color());
    }

    public void setBalancingColor() {
        blinkin.set(LedColor.BALANCING.color());
    }

    public void setDockedColor() {
        blinkin.set(LedColor.DOCKED.color());
    }

    public void setGrabberOpen() {
        blinkin.set(LedColor.GRABBER_OPEN.color());
    }

    public void setGrabberClosed() {
        blinkin.set(LedColor.GRABBER_CLOSED.color());
    }

}
