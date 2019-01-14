package com.xyd.yuyinhecheng;


import android.widget.EditText;

public class MainActivity extends BaseActivity  {

    private EditText et_content;
    private KqwSpeechSynthesizer kqwSpeechSynthesizer;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
//        tv_name = findViewById(R.id.tv_name);
        et_content = findViewById(R.id.et_content);

    }

    @Override
    protected void getData() {
        // 初始化语音合成对象
        kqwSpeechSynthesizer = new KqwSpeechSynthesizer(MainActivity.this);
        kqwSpeechSynthesizer.start(et_content.getText().toString());


    }



}
