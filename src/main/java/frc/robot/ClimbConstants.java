/**
 * Simple class containing constants used throughout project
 */
package frc.robot;

public class ClimbConstants {
    // CAN motor IDs
    public final static int buddyWinchBackID = 15;
    public final static int buddyWinchFrontID = 12;
    public final static int hookMotorID = 10;
    public final static int winchClimbID = 14;    

	// Hook Height constants
	public final static double hookUpEncoderUnits = 36300;
	//52977 is full height encoder units
	public final static double hookDownEncoderUnits = 0;

    public static final int kPIDLoopIdx = 0; // Check how it is done with talon

    /**
	 * Set to zero to skip waiting for confirmation. Set to nonzero to wait and
	 * report to DS if action fails.
	 */
	public final static int kTimeoutMs = 30;

	/*
	 * Firmware currently supports slots [0, 3] and can be used for either PID Set
	 */
	public final static int SLOT_0 = 0;
	public final static int SLOT_1 = 1;
	public final static int SLOT_2 = 2;
	public final static int SLOT_3 = 3;
	/* ---- Named slots, used to clarify code ---- */
	public final static int kSlot_Distanc = SLOT_0;
	public final static int kSlot_Turning = SLOT_1;
	public final static int kSlot_Velocit = SLOT_2;
	public final static int kSlot_MotProf = SLOT_3;

    /*
	 * Gains(kp, ki, kd, kf, izone, peak output);
	 */
	public static final Gains kGains_hookMotor = new Gains(0.2, 0.001, 0.0, 0.2, 0, 1.0);
	public static Object kGains_hoodMotor;

	public static final boolean kEnableCurrentLimiting_BS = true;

	// Current (amp) limit
	public static final double currentLimit = 20;

	// Threshold that must be exceeded for current limiting to occur
	public static final double thresholdLimit = 30;

	// How long the current has to be above the threshold to trigger limiting
	public static final double thresholdTime = 0;

	public static final boolean test = false;
	public static final boolean debug = false;

}