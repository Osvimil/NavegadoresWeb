package com.hotmail.oswaldoadidas.navegadoresweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        imageView = (ImageView)findViewById(R.id.imagen);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.chrome){
                    Toast.makeText(getApplicationContext(),"Navegador chrome",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.ic_done_black_24dp);
                }
                else if(checkedId == R.id.firefox){

                    Toast.makeText(getApplicationContext(),"Navegador firefox",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.ic_lock_open_black_24dp);
                }
                else if(checkedId== R.id.explorer){
                    Toast.makeText(getApplicationContext(),"Navegador explorer",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.ic_record_voice_over_white_24dp);

                }
                else if(checkedId == R.id.opera){

                    Toast.makeText(getApplicationContext(),"Navegador opera",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.ic_video_call_white_24dp);
                }
                else if(checkedId == R.id.safari){

                    Toast.makeText(getApplicationContext(),"Navegador safari",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.ic_video_label_white_24dp);
                }
            }
        });
    }
}
