package com.example.colorassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

   private TextView one;
   private TextView two;
   private TextView three;
   private TextView four;
   private TextView five;
   private EditText enterthenumber;
   private Button btncolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        linearLayout.setPadding(20,20,20,20);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        linearLayout.setLayoutParams(layoutParams);

        ViewGroup.LayoutParams paramsForView = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        one = new TextView(this);
        one.setBackgroundColor(Color.YELLOW);
        one.setPadding(30,30,30,30);
        one.setLayoutParams(paramsForView);
        linearLayout.addView(one);

        two = new TextView(this);
        two.setBackgroundColor(Color.RED);
        two.setPadding(30,30,30,30);
        two.setLayoutParams(paramsForView);
        linearLayout.addView(two);

        three = new TextView(this);
        three.setBackgroundColor(Color.BLUE);
        three.setPadding(30,30,30,30);
        three.setLayoutParams(paramsForView);
        linearLayout.addView(three);

        four = new TextView(this);
        four.setPadding(30,30,30,30);
        four.setBackgroundColor(Color.GRAY);
        four.setLayoutParams(paramsForView);
        linearLayout.addView(four);

        five = new TextView(this);
        five.setPadding(30,30,30,30);
        five.setBackgroundColor(Color.GREEN);
        five.setLayoutParams(paramsForView);
        linearLayout.addView(five);

        enterthenumber = new EditText(this);
        enterthenumber.setHint("Enter color code");
        enterthenumber.setLayoutParams(paramsForView);
        enterthenumber.setTextSize(30);
        linearLayout.addView(enterthenumber);

        btncolor = new Button(this);
        btncolor.setText("change color");
        btncolor.setTextSize(25);
        btncolor.setBackgroundColor(Color.MAGENTA);
        btncolor.setPadding(50,50,50,50);
        linearLayout.addView(btncolor);

         setContentView(linearLayout);
         btncolor.setOnClickListener(new btnEvent());

    }
    class btnEvent implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            String checkColorCode = enterthenumber.getText().toString();
            switch (checkColorCode)
            {
                case "1" :
                    one.setBackgroundColor(Color.RED);
                    break;

                case "2" :
                    two.setBackgroundColor(Color.RED);
                    break;

                case "3" :
                    three.setBackgroundColor(Color.RED);
                    break;

                case "4" :
                    four.setBackgroundColor(Color.RED);
                    break;

                case "5" :
                    five.setBackgroundColor(Color.RED);
                    break;

                default:
                    enterthenumber.setBackgroundColor(Color.RED);
                    break;
            }

        }
    }
}