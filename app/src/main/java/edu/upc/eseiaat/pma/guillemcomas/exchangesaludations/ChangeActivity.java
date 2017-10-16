package edu.upc.eseiaat.pma.guillemcomas.exchangesaludations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ChangeActivity extends AppCompatActivity {
    public static int requestName= 1;
    public static String keyName= "keyName";

    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        editName= (EditText) findViewById(R.id.editName);
    }

    public void finishing(View view){
        Intent data= new Intent();
        data.putExtra(keyName,editName.getText().toString());
        setResult(RESULT_OK,data);
        finish();
    }
}
