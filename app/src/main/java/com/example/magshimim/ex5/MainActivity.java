package com.example.magshimim.ex5;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl);
        TextView tvIntro = (TextView) findViewById(R.id.tvIntro);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.ll1_Id);
        ll1.setBackgroundResource(R.drawable.border);
        ll1.setOrientation(LinearLayout.VERTICAL);
        RelativeLayout.LayoutParams llp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, toPxel(180));
        llp.setMargins(0, toPxel(20), 0, 0);
        llp.addRule(RelativeLayout.BELOW, R.id.tvIntro);



        ll1.setLayoutParams(llp);
        rl1.addView(ll1);
        TextView tvIntro2 = new TextView(this);
        tvIntro2.setId(R.id.tvIntro2);
        tvIntro2.setText(R.string.intro2);
        LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp2.gravity = Gravity.CENTER_HORIZONTAL;
        tvIntro2.setLayoutParams(llp2);
        ll1.addView(tvIntro2);

        LinearLayout ll2 = new LinearLayout(this);
        ll2.setId(R.id.ll2_Id);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams llp3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp3.gravity = Gravity.CENTER;
        ll2.setLayoutParams(llp3);
        ll1.addView(ll2);

        CheckBox c1 = new CheckBox(this);
        c1.setId(R.id.checkBox1);
        LinearLayout.LayoutParams checklp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        c1.setLayoutParams(checklp);
        c1.setText(R.string.checkBox1);
        ll2.addView(c1);
        CheckBox c2 = new CheckBox(this);
        c2.setId(R.id.checkbox2);
        LinearLayout.LayoutParams checklp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        c2.setLayoutParams(checklp2);
        c2.setText(R.string.checkBox2);
        ll2.addView(c2);



    }
    private int toPxel(int dp)
    {
        Resources r = getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 14, r.getDisplayMetrics());
        return (int)px;
    }




}

