package com.example.pruebasretrofir;

import java.util.List;

public class ListaDatos {
    private List<Datos> data;

    public ListaDatos(List<Datos> data) {
        this.data = data;
    }

    public List<Datos> getData() {
        return data;
    }

    public void setData(List<Datos> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ListaDatos{" +
                "data=" + data +
                '}';
    }
}
