package comconnordeloachmy_app_portfolio.github.www.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    /**
     * Method to receive button clicks from activity_main.xml
     *
     * @param v is the Button view
     */
    public void lnchAppBtn(View v) {

        if (v.getId() == R.id.spotify_button) {
            Toast.makeText(getApplicationContext(), "This button will launch my Spotify app!", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.scores_button) {
            Toast.makeText(getApplicationContext(), "This button will launch my scores app!", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.library_button) {
            Toast.makeText(getApplicationContext(), "This button will launch my library app!", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.buildb_button) {
            Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.reader_button) {
            Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.my_app_button) {
            Toast.makeText(getApplicationContext(), "This button will launch my own personal app!", Toast.LENGTH_SHORT).show();
        }
    }
}
