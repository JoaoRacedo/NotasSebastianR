package com.uninorte.notassebastianr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4;
    float nota1,nota2,nota3,nota4,def=0,x;
    TextView textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        textView7 = (TextView) findViewById(R.id.textView7);

    }

    public float ConvertStr2Float(EditText nota){
       float num =Float.parseFloat(nota.getText().toString());
       return num;
    }

    public void onClick(View view) {
       /* nota1 = ConvertStr2Float(editText1);
        nota2 = ConvertStr2Float(editText2);
        nota3 = ConvertStr2Float(editText3);
        nota4 = ConvertStr2Float(editText4);*/
        String et1,et2,et3,et4;
        et1 = editText1.getText().toString();
        et2 = editText2.getText().toString();
        et3 = editText3.getText().toString();
        et4 = editText4.getText().toString();

        if(et1.isEmpty() || et2.isEmpty()|| et3.isEmpty()|| et4.isEmpty()){
            //0000
             if(et1.isEmpty() && et2.isEmpty() && et3.isEmpty() && et4.isEmpty()){
                 nota1 = (float) 3.8;
                 nota2 = (float) 3.8;
                 nota3 = (float) 3.8;
                 nota4 = (float) 3.8;
                 editText1.setText(Float.toString(nota1));
                 editText2.setText(Float.toString(nota2));
                 editText3.setText(Float.toString(nota3));
                 editText4.setText(Float.toString(nota4));
                 def = (nota1+nota2+nota3+nota4)/4;
             }
            //0001
            if(et1.isEmpty() && et2.isEmpty() && et3.isEmpty() && !et4.isEmpty()){
                nota4 =  ConvertStr2Float(editText4);
                 x = ((float) 3.8*4 - (nota4));
                editText1.setText(Float.toString(x));
                editText2.setText(Float.toString(x));
                editText3.setText(Float.toString(x));

            }
            //0010
            if(et1.isEmpty() && et2.isEmpty() && !et3.isEmpty() && et4.isEmpty()){
                nota3 =  ConvertStr2Float(editText3);
                x = ((float) 3.8*4 - (nota3));
                editText1.setText(Float.toString(x));
                editText2.setText(Float.toString(x));
                editText4.setText(Float.toString(x));
            }
            //0011
            if(et1.isEmpty() && et2.isEmpty() && !et3.isEmpty() && !et4.isEmpty()){
                nota3 =  ConvertStr2Float(editText3);
                nota4 =  ConvertStr2Float(editText4);
                x = ((float) 3.8*4 - (nota4+nota3))/2;
                editText1.setText(Float.toString(x));
                editText2.setText(Float.toString(x));

            }
            //0100
            if(et1.isEmpty() && !et2.isEmpty() && et3.isEmpty() && et4.isEmpty()){
                nota2 =  ConvertStr2Float(editText2);
                x = ((float) 3.8*4 - (nota2));
                editText1.setText(Float.toString(x));
                editText3.setText(Float.toString(x));
                editText4.setText(Float.toString(x));
            }
            //0101
            if(et1.isEmpty() && !et2.isEmpty() && et3.isEmpty() && !et4.isEmpty()){
                nota2 =  ConvertStr2Float(editText2);
                nota4 =  ConvertStr2Float(editText4);
                x = ((float) 3.8*4 - (nota4+nota2))/2;
                editText1.setText(Float.toString(x));
                editText3.setText(Float.toString(x));

            }
            //0110
            if(et1.isEmpty() && !et2.isEmpty() && !et3.isEmpty() && et4.isEmpty()){
                nota2 =  ConvertStr2Float(editText2);
                nota3 =  ConvertStr2Float(editText3);
                x = ((float) 3.8*4 - (nota2+nota3))/2;
                editText1.setText(Float.toString(x));
                editText4.setText(Float.toString(x));
            }
            //0111
            if(et1.isEmpty() && !et2.isEmpty() && !et3.isEmpty() && !et4.isEmpty()){
                nota2 =  ConvertStr2Float(editText2);
                nota3 =  ConvertStr2Float(editText3);
                nota4 =  ConvertStr2Float(editText4);
                x = ((float) 3.8*4 - (nota4+nota3+nota2))/3;
                editText1.setText(Float.toString(x));

            }
            //1000
            if(!et1.isEmpty() && et2.isEmpty() && et3.isEmpty() && et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                x = ((float) 3.8*4 - (nota1));
                editText2.setText(Float.toString(x));
                editText3.setText(Float.toString(x));
                editText4.setText(Float.toString(x));

            }
            //1001
            if(!et1.isEmpty() && et2.isEmpty() && et3.isEmpty() && !et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                nota4 =  ConvertStr2Float(editText4);
                x = ((float) 3.8*4 - (nota4+nota1))/2;
                editText2.setText(Float.toString(x));
                editText3.setText(Float.toString(x));

            }
            //1010
            if(!et1.isEmpty() && et2.isEmpty() && !et3.isEmpty() && et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                nota3 =  ConvertStr2Float(editText3);
                x = ((float) 3.8*4 - (nota1+nota3))/2;
                editText2.setText(Float.toString(x));
                editText4.setText(Float.toString(x));

            }
            //1011
            if(!et1.isEmpty() && et2.isEmpty() && !et3.isEmpty() && !et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                nota3 =  ConvertStr2Float(editText3);
                nota4 =  ConvertStr2Float(editText4);
                x = ((float) 3.8*4 - (nota4+nota3+nota1))/3;
                editText2.setText(Float.toString(x));

            }
            //1100
            if(!et1.isEmpty() && !et2.isEmpty() && et3.isEmpty() && et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                nota2 =  ConvertStr2Float(editText2);
                x = ((float) 3.8*4 - (nota1+nota2))/2;
                editText3.setText(Float.toString(x));
                editText4.setText(Float.toString(x));

            }
            //1101
            if(!et1.isEmpty() && !et2.isEmpty() && et3.isEmpty() && !et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                nota2 =  ConvertStr2Float(editText2);
                nota4 =  ConvertStr2Float(editText4);
                x = ((float) 3.8*4 - (nota4+nota2+nota1))/3;
                editText3.setText(Float.toString(x));

            }
            //1110
            if(!et1.isEmpty() && !et2.isEmpty() && !et3.isEmpty() && et4.isEmpty()){
                nota1 =  ConvertStr2Float(editText1);
                nota2 =  ConvertStr2Float(editText2);
                nota3 =  ConvertStr2Float(editText3);
                x = ((float) 3.8*4 - (nota1+nota2+nota3))/3;
                editText4.setText(Float.toString(x));
            }
            def = (nota1+nota2+nota3+nota4)/4;
        }else{
        nota1 = ConvertStr2Float(editText1);
        nota2 = ConvertStr2Float(editText2);
        nota3 = ConvertStr2Float(editText3);
        nota4 = ConvertStr2Float(editText4);
        def = (nota1+nota2+nota3+nota4)/4;
        }
        textView7.setText(Float.toString(def));
    }
}
