package com.example.pratical42homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private CheckBox chocolate_syrup,Sprinkles,crushed_nuts,cherries,orio_cookie_crumbles;
    private Button show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick()
    {
        chocolate_syrup = (CheckBox)findViewById(R.id.chocolate_syrup);
        Sprinkles = (CheckBox)findViewById(R.id.Sprinkles);
        crushed_nuts = (CheckBox)findViewById(R.id.crushed_nuts);
        cherries = (CheckBox)findViewById(R.id.cherries);
        orio_cookie_crumbles = (CheckBox)findViewById(R.id.orio_cookie_crumbles);
        show_toast = (Button)findViewById(R.id.show_toast);
        show_toast.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                StringBuffer result = new StringBuffer();
                result.append("Toppings:");

                        if (chocolate_syrup.isChecked())
                        {
                            result.append(getString(R.string.chocolate_syrup) + " ");
                        }

                        if (Sprinkles.isChecked())
                        {
                            result.append(getString(R.string.Sprinkles) + " ");
                        }

                        if (crushed_nuts.isChecked()) {
                            result.append(getString(R.string.crushed_nuts)).append(" ");
                        }

                        if (cherries.isChecked()) {
                            result.append(getString(R.string.cherries) + " ");
                        }

                        if (orio_cookie_crumbles.isChecked()) {
                            result.append(getString(R.string.orio_cookie_crumbles) + " ");
                        }

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


            }
        });


    }}