package com.pepin.nate.kegalhiit.Data;

public final class Constants {
    public static final int DEFAULT_FOCUS_TIME = 2;
    public static final int DEFAULT_FOCUS_MAX = 2;
    public static final int DEFAULT_REST_TIME = 5;
    public static final int DEFAULT_REPS = 13;
    public static final int DEFAULT_COOL_DOWN = 0;
    public static final int DEFAULT_TOTAL_TIME = GenerateWorkout.getTotalTime(DEFAULT_FOCUS_TIME, DEFAULT_REST_TIME, DEFAULT_REPS,DEFAULT_COOL_DOWN);
    public static final int DEFAULT_LEVEL = 1;

    public static final String CURRENT_WORKOUT = "CURRENT_WORKOUT";

    public static final String FOCUS = "FOCUS";
    public static final String FOCUS_MAX = "FOCUS_MAX";
    public static final String REST = "REST";
    public static final String REPS = "REPS";
    public static final String COOL_DOWN = "COOL_DOWN";
    public static final String TOTAL_TIME = "TOTAL_TIME";
    public static final String LEVEL = "LEVEL";
    public static final String XP = "XP";
}
