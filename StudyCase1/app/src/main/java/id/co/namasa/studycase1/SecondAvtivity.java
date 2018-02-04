package id.co.namasa.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class SecondAvtivity extends AppCompatActivity {
    String Tfood,Tporsi,Tplace,tes;
    TextView foodTxt,porsiTxt,priceTxt,placeTxt;
    int price, total;
    int uangSaku=65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = this.getIntent();
        Tfood = intent.getStringExtra("food");
        Tporsi= intent.getStringExtra("porsi");
        Tplace = intent.getStringExtra("place");

        foodTxt = findViewById(R.id.foodTxt);
        porsiTxt = findViewById(R.id.totalPorsi);
        priceTxt= findViewById(R.id.totalPrice);
        placeTxt = findViewById(R.id.place);

        foodTxt.setText(Tfood);
        porsiTxt.setText(Tporsi);
        porsiTxt.setText(Tporsi);

        switch (Tplace) {
            case "Eatbus":
                price = 50000;
                break;
            case "Abnormal":
                price = 30000;
                break;
        }

        total = parseInt(Tporsi) * price;
        String hargaTot = Integer.toString(total);
        if (total < uangSaku){
            priceTxt.setText(hargaTot);
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
        }else{
            priceTxt.setText(hargaTot);
            Toast.makeText(this, "Money is not enough", Toast.LENGTH_SHORT).show();
        }

    }
}
