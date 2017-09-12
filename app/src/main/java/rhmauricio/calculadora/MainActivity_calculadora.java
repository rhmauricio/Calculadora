package rhmauricio.calculadora;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_calculadora extends AppCompatActivity {
    Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,buttonR,button16;

    EditText proceso, concatenar;
    boolean ban=false,banr=false;
    double num1=0, num2=0, r=0;
    boolean men;
    String op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_main);
        button=(Button)findViewById(R.id.button);button2=(Button)findViewById(R.id.button2);button3=(Button)findViewById(R.id.button3);button4=(Button)findViewById(R.id.button4);button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);button7=(Button)findViewById(R.id.button7);button8=(Button)findViewById(R.id.button8);button9=(Button)findViewById(R.id.button9);button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);button12=(Button)findViewById(R.id.button12);button13=(Button)findViewById(R.id.button13);button14=(Button)findViewById(R.id.button14);button15=(Button)findViewById(R.id.button15);
        buttonR=(Button)findViewById(R.id.buttonR) ;button16=(Button)findViewById(R.id.button16);
        proceso=(EditText)findViewById(R.id.proceso);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"7");
                ban=true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"8");
                ban=true;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"9");
                ban=true;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"4");
                ban=true;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"5");
                ban=true;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"6");
                ban=true;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"1");
                ban=true;
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"2");
                ban=true;
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"3");
                ban=true;
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=(EditText)findViewById(R.id.proceso);
                proceso.setText(concatenar.getText().toString()+"0");
                ban=true;
            }
        });



        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ban) {
                    proceso.setText("");
                    concatenar.setText("");
                    num1 = 0;
                    num2 = 0;
                    r = 0;
                    ban=false;
                }else{
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"primero el numero",Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(men){
                    op = "+";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString())*-1;
                    banr=true;
                    proceso.setText("");
                    ban=false;
                }
                if (ban) {
                    op = "+";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString());
                    banr=true;
                    proceso.setText("");
                    ban=false;
                }
                else{
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"primero el numero",Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banr){
                    num1=num1*-1;

                }
                if(ban) {
                    op = "-";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString());
                    proceso.setText("");
                    ban=false;

                }else {
                    men=true;
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"Menos",Toast.LENGTH_SHORT);
                    t.show();

                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(men){
                    op = "mul";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString())*-1;
                    banr=true;
                    proceso.setText("");
                    ban=false;
                }
                if(ban) {
                    op = "mul";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString());
                    proceso.setText("");
                    ban=false;
                    banr=true;
                }else{
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"primero el numero",Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(men){
                    op = "div";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString())*-1;
                    banr=true;
                    proceso.setText("");
                    ban=false;
                }
                if (ban) {
                    banr=true;
                    op = "div";
                    concatenar=(EditText)findViewById(R.id.proceso);
                    num1 = Double.parseDouble(concatenar.getText().toString());
                    proceso.setText("");
                    ban=false;
                }else{
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"primero el numero",Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ban) {
                    concatenar = (EditText) findViewById(R.id.proceso);
                    proceso.setText(concatenar.getText().toString() + ".");
                    ban=false;
                }else{
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"primero el numero",Toast.LENGTH_SHORT);
                    t.show();
                }
            }

        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat f = new DecimalFormat("0.00");
                if(ban) {
                    concatenar = (EditText) findViewById(R.id.proceso);
                    num2 = Double.parseDouble(concatenar.getText().toString());

                    if (op.equals(("+"))) {

                        proceso.setText((""));
                        r = num1 + num2;

                    }
                    if (op.equals(("-"))) {
                        proceso.setText((""));
                        r = num1 - num2;
                    }
                    if (op.equals(("mul"))) {
                        proceso.setText((""));
                        r = num1 * num2;
                    }
                    if (op.equals(("div"))) {
                        proceso.setText((""));
                        if (num2 != 0) {
                            r = num1 / num2;
                        } else {
                            proceso.setText("Inf");
                        }

                    }
                    if(num2!=0) {
                        proceso.setText(String.valueOf(f.format(r)));
                        num1 = 0;
                        num2 = 0;
                        r = 0;
                        men=false;
                    }
                }else{
                    Toast t= Toast.makeText(getApplication().getApplicationContext(),"primero el numero",Toast.LENGTH_SHORT);
                    t.show();
                }

            }

        });


    }
}
