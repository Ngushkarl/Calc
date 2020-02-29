package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean isOpPressed= false;
    private  double   firstNumber= 0;
    private  int secondNumberIndex = 0;
    private char currentOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        final TextView calculatorscreen= findViewById(R.id.calculatorscreen);
        final Button zero = findViewById(R.id.zero);
        final Button n1 = findViewById(R.id.N1);
        final Button n2 = findViewById(R.id.N2);
        final Button n3 = findViewById(R.id.N3);
        final Button n4 = findViewById(R.id.N4);
        final Button n5 = findViewById(R.id.N5);
        final Button n6 = findViewById(R.id.N6);
        final Button n7 = findViewById(R.id.N7);
        final Button n8 = findViewById(R.id.N8);
        final Button n9 = findViewById(R.id.N9);
        final Button dot = findViewById(R.id.dot);
        final Button ad = findViewById(R.id.addition);
        final Button div = findViewById(R.id.divison);
        final Button sub = findViewById(R.id.subtraction);
        final Button equa = findViewById(R.id.equals);
        final Button mult = findViewById(R.id.multiplication);

        final View.OnClickListener calclistner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int id = view.getId();
                switch (id){

                    case R.id.zero:
                        calculatorscreen.append("0");
                        break;

                    case R.id.N1:
                        calculatorscreen.append("1");
                        break;

                    case R.id.N2:
                        calculatorscreen.append("2");
                        break;

                    case R.id.N3:
                        calculatorscreen.append("3");
                        break;

                    case R.id.N4:
                        calculatorscreen.append("4");
                        break;

                    case R.id.N5:
                        calculatorscreen.append("5");
                        break;
                    case R.id.N6:
                        calculatorscreen.append("6");
                        break;
                    case R.id.N7:
                        calculatorscreen.append("7");
                        break;
                    case R.id.N8:
                        calculatorscreen.append("8");
                        break;
                    case R.id.N9:
                        calculatorscreen.append("9");
                        break;

                    case R.id.dot:

                        break;
                    case R.id.addition:
                        String screencontent = calculatorscreen.getText().toString();
                        secondNumberIndex= screencontent.length() + 1 ;
                        firstNumber= Double.parseDouble(screencontent);

                calculatorscreen.append("+");
                isOpPressed = true;
                currentOp = '+';
                        break;
                    case R.id.subtraction:

                        break;
                    case R.id.multiplication:

                        break;
                    case R.id.equals:
                        if(isOpPressed){
                               if(currentOp=='+'){
                                screencontent = calculatorscreen.getText().toString();
                                String secondNumberString=screencontent.substring(secondNumberIndex, screencontent.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber+=firstNumber;
                                calculatorscreen.setText(String.valueOf(secondNumber));
                            }

                        }

                        break;

                    case R.id.divison:

                        break;

                }


            }


        };
            zero.setOnClickListener(calclistner);
        n1.setOnClickListener(calclistner);

        n2.setOnClickListener(calclistner);

        n3.setOnClickListener(calclistner);
        n4.setOnClickListener(calclistner);
        n5.setOnClickListener(calclistner);
        n6.setOnClickListener(calclistner);
        n7.setOnClickListener(calclistner);
        n8.setOnClickListener(calclistner);
        n9.setOnClickListener(calclistner);
        dot.setOnClickListener(calclistner);
        ad.setOnClickListener(calclistner);
        sub.setOnClickListener(calclistner);
        mult.setOnClickListener(calclistner);
        equa.setOnClickListener(calclistner);
        div.setOnClickListener(calclistner);

        final Button Del = findViewById(R.id.del);
        Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedElements = calculatorscreen.getText().toString();
                int length = displayedElements.length();
                if(length>0){
                    displayedElements= displayedElements.substring(0,length-1);
                    calculatorscreen.setText(displayedElements);
                }
            }
        });

        final Button clearEverything = findViewById(R.id.cleareverything );
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorscreen.setText("");
            }
        });



    }
}
