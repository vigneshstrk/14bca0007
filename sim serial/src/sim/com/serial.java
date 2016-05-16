package sim.com;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class serial extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView tv =(TextView)findViewById(R.id.TextView01);
        TelephonyManager tm= (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        String id = tm.getDeviceId();
        String sim = tm.getSimSerialNumber();
        String ln = tm.getLine1Number();
        boolean r = tm.isNetworkRoaming();
        String st = id+"\n"+sim+"\n"+ln+"\n"+r;
        tv.setText(st);
        
        
        
    }
}