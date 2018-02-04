package id.co.namasa.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText foodEditText, porsiEditText;
    private Button eatbusBtn, abnormalBtn;
    private String food, porsi;

    public	static	final	String	EXTRA_MESSAGE	=
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodEditText = findViewById(R.id.foodEditText);
        porsiEditText = findViewById(R.id.porsiEditText);
        eatbusBtn =findViewById(R.id.eatbusBtn);
        abnormalBtn = findViewById(R.id.abnormalBtn);

    }

    public void placeEatbus(View view){
        Intent intent = new Intent(this,SecondAvtivity.class);

        food = foodEditText.getText().toString();
        porsi = porsiEditText.getText().toString();
        String place = eatbusBtn.getText().toString();


        if (food.isEmpty()){
            Toast.makeText(this, "Lengkapi Formnya", Toast.LENGTH_SHORT).show();
        }else{
            intent.putExtra("food",food);
            intent.putExtra("porsi",porsi);
            intent.putExtra("place",place);
            startActivity(intent);
        }

    }

    public void placeAbnormal(View view){
        Intent intent =new Intent(this, SecondAvtivity.class);

        food = foodEditText.getText().toString();
        porsi = porsiEditText.getText().toString();
        String place = abnormalBtn.getText().toString();

        if (food.isEmpty()||porsi.isEmpty()){
            Toast.makeText(this, "Lengkapi Formnya", Toast.LENGTH_SHORT).show();
        }else{
            intent.putExtra("food",food);
            intent.putExtra("porsi",porsi);
            intent.putExtra("place",place);
            startActivity(intent);
        }

    }
}
