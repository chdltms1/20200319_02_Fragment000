package kr.co.tjoeun.a20200319_02_fragment02;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BassActivity extends AppCompatActivity {


    public Context mcontext = this;
    public abstract void setEvent();
    public  abstract void setValues();
}
