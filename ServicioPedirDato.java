package com.example.pruebasretrofir;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioPedirDato {
    @GET("atmosfera_inventario_emisiones.json")
    Call<ListaDatos> listRepos();
}
