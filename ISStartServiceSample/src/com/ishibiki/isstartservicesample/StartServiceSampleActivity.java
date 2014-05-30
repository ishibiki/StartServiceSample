package com.ishibiki.isstartservicesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class StartServiceSampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        // スーパークラスのonCreateメソッド呼び出し
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_service_sample);

        Button startButton=(Button)findViewById(R.id.bt_start);
        startButton.setOnClickListener(new StartButtonClickListener());
     }
     class StartButtonClickListener implements OnClickListener {
        public void onClick(View v) {
           Intent intent = new Intent(StartServiceSampleActivity.this,
                                                             StartServiceSampleService.class);

          EditText stopcount = (EditText)findViewById(R.id.et_time);
          intent.putExtra("STOPTIME", stopcount.getText().toString());

          startService(intent);
       }
    }
     // オプションメニュー生成
/*     @Override
        public boolean onCreateOptionsMenu(Menu menu) {
           // オプションメニューを設定
           getMenuInflater().inflate(R.menu.start_service_sample, menu);
           return true;
       }
*/ }

