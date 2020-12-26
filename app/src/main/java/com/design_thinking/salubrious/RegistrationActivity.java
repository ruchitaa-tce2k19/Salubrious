package com.design_thinking.salubrious;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class RegistrationActivity extends AppCompatActivity {
    EditText edittextEmail,edittextPassword,edittextConfirmPassword;
    Button SignupWithGoogle,SignupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        edittextEmail = (EditText)findViewById(R.id.edittextEmail);
        edittextPassword = (EditText)findViewById(R.id.edittextPassword);
        edittextConfirmPassword = (EditText)findViewById(R.id.edittextConfirmPassword);
        SignupWithGoogle = (Button)findViewById(R.id.GoogleButton);
        SignupButton = (Button)findViewById(R.id.SignupButton);

        SignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegistrationActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });


        SignupWithGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittextEmail.getText().toString().equals("admin") &&
                        edittextPassword.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                            edittextEmail.setVisibility(View.VISIBLE);
                    edittextEmail.setBackgroundColor(Color.RED);
                    //counter--;
                    //edittextEmail.setText(Integer.toString(counter));

                    //if (counter == 0) {
                        SignupWithGoogle.setEnabled(false);
                    //}
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}