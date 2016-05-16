package lab.ex1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Lab1act extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void mymethod(View v){
    	
    	Toast t=Toast.makeText(this, "button clicked", 0);
    	t.show();
    }
    
}