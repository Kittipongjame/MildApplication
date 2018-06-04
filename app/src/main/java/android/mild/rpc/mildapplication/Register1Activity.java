package android.mild.rpc.mildapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register1Activity extends AppCompatActivity {
    Button bt5;
    MediaPlayer mp1, mp2;
    EditText username, email, passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        username=(EditText)findViewById(R.id.editText3);
        email=(EditText)findViewById(R.id.editText4);
        passwd=(EditText)findViewById(R.id.editText5);

        mp1=MediaPlayer.create(this,R.raw.phonton2);
        mp2=MediaPlayer.create(this,R.raw.phonton2);

        mp1.start();
        mp1.setLooping(true);

        bt5= (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register1Activity.this,GameActivity.class);
                mp2.start();
                startActivity(intent);
                mp1.stop();

            }
        });
    }
}
