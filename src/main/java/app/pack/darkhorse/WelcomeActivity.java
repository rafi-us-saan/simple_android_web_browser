package app.pack.darkhorse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class WelcomeActivity extends AppCompatActivity {

    private ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        image1 = (ImageView)findViewById(R.id.welcome_logo);
        YoYo.with(Techniques.RubberBand).duration(3000).repeat(1).playOn(image1);

        Thread th = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(5000);
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finally{
                    Intent home = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(home);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}