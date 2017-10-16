package edu.upc.eseiaat.pma.guillemcomas.exchangesaludations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textName;
    private String main_word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName= (TextView) findViewById(R.id.NameText);
        main_word = getString(R.string.world);
        String message= String.format(getString(R.string.MainText),main_word);
        textName.setText(message);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode== ChangeActivity.requestName){
            if (resultCode==RESULT_OK){
                main_word= data.getExtras().getString(ChangeActivity.keyName);
                String message= String.format(getString(R.string.MainText),main_word);
                textName.setText(message);
            }
        }
    }

    public void customuze_msg(View view){
        Intent intent = new Intent(this, ChangeActivity.class);
        startActivityForResult(intent, ChangeActivity.requestName);
    }
}

//request rebut es igual al que demanavem?
//extreure el nom de l'intent
//posar el nom al text