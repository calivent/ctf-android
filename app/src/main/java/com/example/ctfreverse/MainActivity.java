package com.example.ctfreverse;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etInput;
    private TextView tvResult;

    private final String part1 = "CTF{r3v3rs3_";
    private final String part2 = "eng1n33r1ng_";
    private final String part3 = "m4st3r}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
        tvResult = findViewById(R.id.tvResult);
        Button btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etInput.getText().toString();
                if (verifyKey(input)) {
                    String flag = getFlag();
                    tvResult.setText("¡Correcto! Flag: " + flag);
                } else {
                    tvResult.setText("Clave incorrecta. Sigue intentando.");
                }
            }
        });
    }

    private boolean verifyKey(String key) {
        return key.equals("p4ssw0rd_s3cr3t4");
    }

    private String getFlag() {
        return part1 + part2 + part3;
    }
}
