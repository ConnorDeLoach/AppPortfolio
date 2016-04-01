package comconnordeloachmy_app_portfolio.github.www.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mSpotify = (Button) findViewById(R.id.spotify_button);
        Button mScores = (Button) findViewById(R.id.scores_button);
        Button mLibrary = (Button) findViewById(R.id.library_button);
        Button mBuildb = (Button) findViewById(R.id.buildb_button);
        Button mReader = (Button) findViewById(R.id.reader_button);
        Button mMyApp = (Button) findViewById(R.id.my_app_button);


    }
}
