package android.bootcamp.androidbootcampday1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int result = getIntent().getIntExtra(Constants.RESULT_SUM, 0);

        TextView resultView = (TextView) findViewById(R.id.result);
        resultView.setText(String.valueOf(result));
    }
}
