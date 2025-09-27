package Books;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hakaton.MainActivity;
import com.example.hakaton.Profile;
import com.example.hakaton.R;
import com.example.hakaton.SplashScreen2;

public class Books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_books);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView GoHome = findViewById(R.id.imageGoHome);
        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Books.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView GoSub = findViewById(R.id.imageGoSub);
        GoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Books.this, SplashScreen2.class);
                startActivity(intent);
            }
        });
        ImageView GoRoman = findViewById(R.id.imageGoRoman);
        GoRoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Books.this, BookRoman.class);
                startActivity(intent);
            }
        });
        ImageView GoMelodram = findViewById(R.id.imageGoMelodram);
        GoMelodram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Books.this, BookMelodrams.class);
                startActivity(intent);
            }
        });
        ImageView GoProfile = findViewById(R.id.imageGoProfile);
        GoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Books.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}