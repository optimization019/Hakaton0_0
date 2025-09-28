package Tea;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hakaton.MainActivity;
import com.example.hakaton.R;

import Coffee.Capuchino;

public class GreenTea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_green_tea);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            return insets;
        });
        ImageView GoHome = findViewById(R.id.GoToMain);
        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreenTea.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.button);
                Button b2 = findViewById(R.id.button2);
                Button b3 = findViewById(R.id.button3);
                TextView textField = findViewById(R.id.textView13);
                TextView price = findViewById(R.id.Price);
                price.setText("160.40");
                b1.setBackgroundColor(Color.rgb(168, 168, 168));
                b2.setBackgroundColor(Color.rgb(185, 131, 110));
                b3.setBackgroundColor(Color.rgb(168, 168, 168));
                textField.setText("Объём 250мл");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.button);
                Button b2 = findViewById(R.id.button2);
                Button b3 = findViewById(R.id.button3);
                TextView textField = findViewById(R.id.textView13);
                TextView price = findViewById(R.id.Price);
                price.setText("200.40");
                b1.setBackgroundColor(Color.rgb(168, 168, 168));
                b2.setBackgroundColor(Color.rgb(168, 168, 168));
                b3.setBackgroundColor(Color.rgb(185, 131, 110));
                textField.setText("Объём 300мл");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.button);
                Button b2 = findViewById(R.id.button2);
                Button b3 = findViewById(R.id.button3);
                TextView textField = findViewById(R.id.textView13);
                TextView price = findViewById(R.id.Price);
                price.setText("140.40");
                b1.setBackgroundColor(Color.rgb(185, 131, 110));
                b2.setBackgroundColor(Color.rgb(168, 168, 168));
                b3.setBackgroundColor(Color.rgb(168, 168, 168));
                textField.setText("Объём 150мл");
            }
        });
    }
}