package bagusandinata.textfield;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;

import bagusandinata.textfield.R;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText pass;
    RelativeLayout relativeLayout;
    TextInputLayout userLayout;
    TextInputLayout passLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.username_TextField);
        userLayout = findViewById(R.id.username_TextInputLayout);
        pass = findViewById(R.id.password_TextField);
        passLayout = findViewById(R.id.password_TextInputLayout);
        relativeLayout = findViewById(R.id.activity_main);
        relativeLayout.setOnClickListener(null);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (user.getText().toString().isEmpty()){

                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username!");

                }else {

                    userLayout.setErrorEnabled(false);
                }
            }
        });

        user.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (user.getText().toString().isEmpty()){

                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username!");

                }else {

                    userLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        pass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (pass.getText().toString().isEmpty()){

                    passLayout.setErrorEnabled(true);
                    passLayout.setError("please enter your password!");

                }else {

                    passLayout.setErrorEnabled(false);
                }
            }
        });

        pass.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (pass.getText().toString().isEmpty()){

                    passLayout.setErrorEnabled(true);
                    passLayout.setError("please enter your username!");

                }else {

                    passLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        passLayout.setCounterEnabled(true);
        passLayout.setCounterMaxLength(8);

    }
}
