package Coffee;

import android.content.Intent;
import android.content.res.ColorStateList;
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

public class Capuchino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_capuchino);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            return insets;
        });
        ImageView GoHome = findViewById(R.id.GoToMain);
        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capuchino.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button selectMax = findViewById(R.id.button3);
        selectMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button1 = findViewById(R.id.button);
                TextView price = findViewById(R.id.Price);
                TextView text = findViewById(R.id.textView13);
                Button button2 = findViewById(R.id.button2);
                Button button3 = findViewById(R.id.button3);
                text.setText("Объем 400мл");
                price.setText("200.40");
                button3.setBackgroundColor(Color.rgb(185, 131, 110));
                button1.setBackgroundColor(Color.rgb(168, 168, 168));
                button2.setBackgroundColor(Color.rgb(168, 168, 168));
            }
        });
        Button selectMed = findViewById(R.id.button2);
        selectMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button1 = findViewById(R.id.button);
                TextView price = findViewById(R.id.Price);
                TextView text = findViewById(R.id.textView13);
                Button button2 = findViewById(R.id.button2);
                Button button3 = findViewById(R.id.button3);
                text.setText("Объем 240мл");
                price.setText("180.40");
                button2.setBackgroundColor(Color.rgb(185, 131, 110));
                button3.setBackgroundColor(Color.rgb(168, 168, 168));
                button1.setBackgroundColor(Color.rgb(168, 168, 168));
            }
        });

        Button selectMin = findViewById(R.id.button);
        selectMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button1 = findViewById(R.id.button);
                TextView price = findViewById(R.id.Price);
                TextView text = findViewById(R.id.textView13);
                Button button2 = findViewById(R.id.button2);
                Button button3 = findViewById(R.id.button3);
                text.setText("Объем 150мл");
                price.setText("140.40");
                button1.setBackgroundColor(Color.rgb(185, 131, 110));
                button3.setBackgroundColor(Color.rgb(168, 168, 168));
                button2.setBackgroundColor(Color.rgb(168, 168, 168));
            }
        });

    }
}