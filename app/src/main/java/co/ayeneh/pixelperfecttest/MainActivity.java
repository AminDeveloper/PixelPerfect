package co.ayeneh.pixelperfecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.ayeneh.pixelperfect.PixelPerfectTestClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String x = new PixelPerfectTestClass().testField;
        float a = getResources().getDimension(co.ayeneh.pixelperfect.R.dimen._wpp0_1);
    }
}