package book.learning.my.mediaworks;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button video = (Button) findViewById(R.id.video);
        Button sing = (Button) findViewById(R.id.audio);

        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer audio = MediaPlayer.create(MainActivity.this,R.raw.song);
                audio.start();

            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vide

            }
        });



    }



}
