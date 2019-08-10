package com.jsalazar.dialoganimationsample;

import android.graphics.Typeface;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.jsalazar.dialoganimationlibrery.GifDialog;
import com.jsalazar.dialoganimationlibrery.GifDialogListener;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Typeface typeface = ResourcesCompat.getFont(this, R.font.courgette_regular);
        new GifDialog.Builder(this)
                .setTitle("Granny eating chocolate dialog box")
                .setColorTitle("#000000")
                .setMessage("This is a granny eating chocolate dialog box. This library is used to" +
                        " help you easily create fancy gify dialog.")
                .setMessageColor("#000000")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnText("Cancel")
                .setNegativeBtnBackground("#FFA9A7A8")
                .setGifResource(R.drawable.gif1)
                .setFont(typeface)
                .isCancellable(true)
                .OnPositiveClicked(new GifDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT)
                                .show();
                    }
                })
                .OnNegativeClicked(new GifDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT)
                                .show();
                    }
                })
                .build();


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
