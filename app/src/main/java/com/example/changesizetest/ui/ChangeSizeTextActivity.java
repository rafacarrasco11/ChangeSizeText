package com.example.changesizetest.ui;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.changesizetest.ChangeSizeApplication;
import com.example.changesizetest.databinding.ActivityChangeSizeTextBinding;
import com.example.changesizetest.model.Message;

/**
 * Clase que pide al usuario un texto y un tamano mediante el componente Seekbar
 * Despues se inicializa un TextView @see {@Link ViewMessageActivity.bundle}
 */
public class ChangeSizeTextActivity extends AppCompatActivity {

    ActivityChangeSizeTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityChangeSizeTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btSend.setOnClickListener(view -> {
            //1. Crear objeto Bundle
            Bundle bundle = new Bundle();
            //2. Anadir mensaje al Bundle
            Message message = new Message(((ChangeSizeApplication) getApplication()).getUser(), binding.edMessage.getText().toString(), binding.skSize.getProgress());
            bundle.putSerializable("message",message);
            //3. Enviar Intent con el Bundle
            Intent intent = new Intent(this,ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}