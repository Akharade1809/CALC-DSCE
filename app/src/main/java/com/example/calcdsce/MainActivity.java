package com.example.calcdsce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdiv,bmul,binv,bsqr,bsqrt,bb1,bb2,bequal,bdec,btan,bsin,bcos,blog,bln,bc,bac,bpi;
    TextView tmain,tsub;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        badd = findViewById(R.id.badd);
        bsub = findViewById(R.id.bsub);
        bdiv = findViewById(R.id.bdiv);
        bmul = findViewById(R.id.bmul);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsqr = findViewById(R.id.bsqr);
        bsin = findViewById(R.id.bsin);
        bequal = findViewById(R.id.bequal);
        bdec = findViewById(R.id.bdec);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bcos = findViewById(R.id.bcos);
        bln = findViewById(R.id.bln);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        bpi = findViewById(R.id.bpi);

        tmain = findViewById(R.id.tmain);
        tsub = findViewById(R.id.tsub);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"9");
            }
        });

        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+".");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText("");
                tsub.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tmain.getText().toString();
                val = val.substring(0,val.length() - 1);
                tmain.setText(val);
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"+");
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"-");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"*");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"/");
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tmain.getText().toString();
                Double r  = Math.sqrt(Double.parseDouble(val));
                tmain.setText(String.valueOf(r));
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"(");
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tsub.setText(bpi.getText());
                tmain.setText(tmain.getText()+pi);
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"sin");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"cos");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"tan");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"^"+"-1");
            }
        });
        bsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tmain.getText().toString());
                int fact = factorial(val);
                tmain.setText(String.valueOf(fact));
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"ln");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmain.setText(tmain.getText()+"log");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tmain.getText().toString();
                String replaced = val.replace("/","/").replace("*","*");
                double result = eval(replaced);
                tmain.setText(String.valueOf(result));
                tsub.setText(val);
            }
        });

    }

    int factorial(int n){
        return (n==0 || n==1)? 1 : n*factorial(n-1);
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }



            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}