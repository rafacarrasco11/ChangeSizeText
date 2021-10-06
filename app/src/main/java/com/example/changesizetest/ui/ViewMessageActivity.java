package com.example.changesizetest.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.changesizetest.ChangeSizeApplication;
import com.example.changesizetest.R;
import com.example.changesizetest.databinding.ActivityViewMessageBinding;
import com.example.changesizetest.model.Message;

/**
 * Esta clase visualiza un mensaje que se ha inicializado en ChangeSizeTextActivity.
 * Se configura el componente TextView con un texto y un tamano de fuente
 * @author Rafa CS
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {

    private static final String TAG = "ChangeSizeProject";
    ActivityViewMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //1. Recoger intent
        Intent intent = getIntent();
        //2. Recoger el mensaje
        Message message = (Message) intent.getExtras().getSerializable("message");
        //3. Actualizamos la vista
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());
        /**
         * Todas las Activity tienen acceso a la informacion de la clase Application
         * desde el metodo getApplication(). Se debe realizar u casting explicito
         * cuando hayamos cambiado la clase Application
         */
        Log.d(TAG,((ChangeSizeApplication)getApplication()).getUser().toString());
    }
}