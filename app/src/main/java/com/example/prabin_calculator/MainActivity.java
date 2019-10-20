package com.example.prabin_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btn0, btnadd, btndiv, btnsub, btnmulti,btnequl;
    TextView txtinput;
    double var1 , var2;
    boolean add , sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
        btn0= (Button) findViewById(R.id.btn0);
        btnadd= (Button) findViewById(R.id.btnadd);
        btnsub= (Button) findViewById(R.id.btnsub);
        btnmulti= (Button) findViewById(R.id.btnmulti);
        btndiv= (Button) findViewById(R.id.btndiv);
        btndot= (Button) findViewById(R.id.btndot);
        btnequl = (Button) findViewById(R.id.btnequl) ;


        txtinput = (TextView) findViewById(R.id.txtinput);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinput.getText()+"");
                add=true;
                txtinput.setText(null);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinput.getText()+"");
                sub=true;
                txtinput.setText(null);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinput.getText()+"");
                mul=true;
                txtinput.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinput.getText()+"");
                div=true;
                txtinput.setText(null);
            }
        });
        btnequl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 =  Double.parseDouble(txtinput.getText()+"");
                if(add==true)
                {
                    txtinput.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    txtinput.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    txtinput.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    txtinput.setText(var1/var2+"");
                    div=false;
                }
            }
        });


        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText("");
            }
        });

    }
}
