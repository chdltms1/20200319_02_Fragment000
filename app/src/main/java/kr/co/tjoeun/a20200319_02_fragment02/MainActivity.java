package kr.co.tjoeun.a20200319_02_fragment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200319_02_fragment02.databinding.ActivityMainBinding;

public class MainActivity extends BassActivity {


    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        setEvent();
        setValues();
    }


    @Override
    public void setEvent() {

    }

    @Override
    public void setValues() {

    }
}
