package android.example.weatherupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class BatteryManager extends Object {

    IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
    private Context context;

    Intent batteryStatus = context.registerReceiver(null, ifilter);

    // Are we charging / charged?
    int status = batteryStatus.getIntExtra(android.os.BatteryManager.EXTRA_STATUS, -1);
    boolean isCharging = status == android.os.BatteryManager.BATTERY_STATUS_CHARGING ||
            status == android.os.BatteryManager.BATTERY_STATUS_FULL;

    // How are we charging?
    int chargePlug = batteryStatus.getIntExtra(android.os.BatteryManager.EXTRA_PLUGGED, -1);
    boolean usbCharge = chargePlug == android.os.BatteryManager.BATTERY_PLUGGED_USB;
    boolean acCharge = chargePlug == android.os.BatteryManager.BATTERY_PLUGGED_AC;



}
