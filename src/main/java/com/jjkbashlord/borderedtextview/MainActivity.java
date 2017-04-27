package com.jjkbashlord.borderedtextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    BorderedTextView borderedTextView,borderedTextView0,borderedTextView1,
            borderedTextView2,borderedTextView3, borderedTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        borderedTextView = (BorderedTextView) findViewById(R.id.borderedTextView);
        borderedTextView0 = (BorderedTextView) findViewById(R.id.borderedTextView0);
        borderedTextView1 = (BorderedTextView) findViewById(R.id.borderedTextView1);
        borderedTextView2 = (BorderedTextView) findViewById(R.id.borderedTextView2);
        borderedTextView3 = (BorderedTextView) findViewById(R.id.borderedTextView3);
        borderedTextView4 = (BorderedTextView) findViewById(R.id.borderedTextView4);

        borderedTextView.setTextAlign(BorderedTextView.TextAlign.top);
        borderedTextView.setTopMargin(20);
        borderedTextView.setLeftMargin(50);
        borderedTextView0.setTextAlign(BorderedTextView.TextAlign.bottom);
        borderedTextView0.setRightMargin(50);
        borderedTextView1.setTextAlign(BorderedTextView.TextAlign.left);
        borderedTextView2.setTextAlign(BorderedTextView.TextAlign.right);

        borderedTextView3.setBorderWidth(20);
        borderedTextView3.setBorderedColor(Color.WHITE);
        borderedTextView3.setInsetColor(Color.MAGENTA);
        borderedTextView3.setBottomMargin(25);

        borderedTextView2.setBorderedColor(Color.rgb(205,0,0));
        borderedTextView2.setInsetColor(Color.BLACK);

        borderedTextView4.setBorderWidth(10);
        borderedTextView4.setBorderedColor(Color.WHITE);
        borderedTextView4.setInsetColor(Color.rgb(253,185,39));
    }
}
