package com.xyd.yuyinhecheng;

import android.content.Context;

/**
 * Created by :cyd
 * Time 2019/1/8
 * on:
 */
public class SoundTipUtil {
    private static KqwSpeechSynthesizer kqwSpeechSynthesizer;

    public static void soundTip(Context context, String text) {
        kqwSpeechSynthesizer = new KqwSpeechSynthesizer(context);
        kqwSpeechSynthesizer.start(text);
    }
}
