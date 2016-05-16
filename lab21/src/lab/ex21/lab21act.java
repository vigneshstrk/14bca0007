package lab.ex21;

import Img.Proc.ImgFiltr;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class lab21act extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView iv = (ImageView)findViewById(R.id.ImageView02);
        Bitmap src = BitmapFactory.decodeResource(getResources(), R.drawable.vvicky);
        ImgFiltr f1 = new ImgFiltr();
        iv.setImageBitmap(f1.applyBrightnessEffect(src, 50));
        /*here we can change the effect after apply */
        
    }
}