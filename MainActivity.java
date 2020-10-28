package com.example.pruebasretrofir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
String ruta="http://datos.comunidad.madrid/catalogo/dataset/7aba58f0-01f6-472e-b048-158e8543c77f/resource/98c4f0f2-c259-40c4-aa2b-d3930a0c07a4/download/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hacerPeticion();
    }
    private void hacerPeticion()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ruta).addConverterFactory(GsonConverterFactory.create())
                .build();

        ServicioPedirDato servicio = retrofit.create(ServicioPedirDato.class);
        Call<ListaDatos> llamada=servicio.listRepos();
        llamada.enqueue(new Callback<ListaDatos>() {
            @Override
            public void onResponse(Call<ListaDatos> call, Response<ListaDatos> response) {
                Log.d("MainActiviuty", response.body().toString()+"\n");
            }

            @Override
            public void onFailure(Call<ListaDatos> call, Throwable t) {

            }
        });
    }
}