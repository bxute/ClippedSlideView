package xute.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import xute.clippedslideview.ClippedSlideView;

public class MainActivity extends AppCompatActivity {

    private ClippedSlideView clippedSlideView;
    private TextView backBtn;
    private TextView nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clippedSlideView = findViewById(R.id.clippedSlideView);
        int[] ids = new int[]{R.drawable.rose,R.drawable.lily,R.drawable.rainbow};
        clippedSlideView.setImageResource(ids);

        clippedSlideView.setSlideListener(new ClippedSlideView.SlideListener() {
            @Override
            public void onReachedFirst() {
                Toast.makeText(MainActivity.this,"Reached 1st Position!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onReachedLast() {
                Toast.makeText(MainActivity.this,"Reached last Position!",Toast.LENGTH_LONG).show();
            }
        });

        backBtn = findViewById(R.id.back);
        nextBtn = findViewById(R.id.next);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clippedSlideView.slideRight();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clippedSlideView.slideLeft();
            }
        });


    }
}
