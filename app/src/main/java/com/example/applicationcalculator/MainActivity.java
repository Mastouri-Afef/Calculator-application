 package com.example.applicationcalculator;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnsum, btnsub,btnre,btndiv, btnmul,btnmod;
    TextView re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        re = (TextView) findViewById(R.id.re);
        btnsum = (Button) findViewById(R.id.btnsum);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnre = (Button) findViewById(R.id.btnre);
        btnmod = (Button) findViewById(R.id.btnmod);
        btnmul = (Button) findViewById(R.id.btnmul);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+"9");
            }
        });
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+" + ");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+" - ");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+" / ");
            }
        });
        btnre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = re.getText().toString();
                String [] nums = s.split(" ");
                int r = Integer.parseInt(nums[0]);
                int j = 0;
                for(int i=1; i<nums.length;i+=2) {
                    if (nums[i].equals("+"))
                        r += Integer.parseInt(nums[j += 2]);

                    else if (nums[i].equals("-"))
                        r -= Integer.parseInt(nums[j += 2]);

                    else if (nums[i].equals("*"))
                        r *= Integer.parseInt(nums[j += 2]);

                    else if (nums[i].equals("/"))
                        r /= Integer.parseInt(nums[j += 2]);
                }
                    re.setText(" "+r);


            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re.setText(re.getText().toString()+" * ");
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 re.setText("");
            }
        });
    }
}