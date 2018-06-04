package android.mild.rpc.mildapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button bt3;
    Button bt4;
    Button bt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt3= (Button) findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(Main2Activity.this,GameActivity.class);
              //  startActivity(intent);
            }
        });

        bt4= (Button) findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bt9= (Button) findViewById(R.id.button9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(Main2Activity.this,LedActivity.class);
              //  startActivity(intent);
            }
        });
    }
}
