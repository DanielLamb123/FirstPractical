package my.edu.taruc.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        textViewMessage=findViewById(R.id.textViewMessage);


    }
    public void showMessage(View v){

        textViewMessage.setText("Hello");
    }
    public void clearScreen(View v){

    }

}
