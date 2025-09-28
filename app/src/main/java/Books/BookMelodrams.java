package Books;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hakaton.LoyalCard;
import com.example.hakaton.MainActivity;
import com.example.hakaton.R;
import com.example.hakaton.SplashScreen2;

public class BookMelodrams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_melodrams);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());   //код, предназначенный для скрытия tool bar'а телефона
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button GoBooks = findViewById(R.id.GoToBooks);
        GoBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookMelodrams.this, Books.class);  //код для перехода между окнами
                startActivity(intent);
            }
        });
        ImageView GoHome = findViewById(R.id.imageGoHome);
        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookMelodrams.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView GoSub = findViewById(R.id.imageGoSub);
        GoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookMelodrams.this, SplashScreen2.class);
                startActivity(intent);
            }
        });
        ImageView GoCard = findViewById(R.id.imageGoCard);
        GoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookMelodrams.this, LoyalCard.class);
                startActivity(intent);
            }
        });
    }
}