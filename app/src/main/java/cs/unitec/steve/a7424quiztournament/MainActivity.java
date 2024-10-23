package cs.unitec.steve.a7424quiztournament;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private LinearProgressIndicator progressIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance();

        // Initialize UI components
        progressIndicator = findViewById(R.id.main_progress);
        progressIndicator.setIndeterminate(true);

        // Check user authentication status
        checkUserStatus();
    }

    private void checkUserStatus() {
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser != null) {
            // User is logged in, proceed to PlayerHomeActivity or other main screen
            navigateToHome();
        } else {
            // No user is logged in, navigate to LoginActivity
            navigateToLogin();
        }
    }

    private void navigateToHome() {
        progressIndicator.setIndeterminate(false);
        Intent intent = new Intent(MainActivity.this, PlayerHomeActivity.class);
        startActivity(intent);
        finish();
    }

    private void navigateToLogin() {
        progressIndicator.setIndeterminate(false);
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Recheck user authentication status when activity restarts
        checkUserStatus();
    }

    @Override
    protected void onStop() {
        super.onStop();
        progressIndicator.setIndeterminate(false);
    }
}
