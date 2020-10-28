package com.example.pruebasretrofir;

public class Datos {
    private String atm_inventario_cont_unidades;
    private int atm_inventario_año;
    private String atm_inventario_sector;
    private String atm_inventario_cont_desc;
    private double atm_inventario_cont_cantidad;
    private String atm_inventario_grupo_cont;

    public Datos(String atm_inventario_cont_unidades, int atm_inventario_año, String atm_inventario_sector, String atm_inventario_cont_desc, double atm_inventario_cont_cantidad, String atm_inventario_grupo_cont) {
        this.atm_inventario_cont_unidades = atm_inventario_cont_unidades;
        this.atm_inventario_año = atm_inventario_año;
        this.atm_inventario_sector = atm_inventario_sector;
        this.atm_inventario_cont_desc = atm_inventario_cont_desc;
        this.atm_inventario_cont_cantidad = atm_inventario_cont_cantidad;
        this.atm_inventario_grupo_cont = atm_inventario_grupo_cont;
    }

    public String getAtm_inventario_cont_unidades() {
        return atm_inventario_cont_unidades;
    }

    public int getAtm_inventario_año() {
        return atm_inventario_año;
    }

    public String getAtm_inventario_sector() {
        return atm_inventario_sector;
    }

    public String getAtm_inventario_cont_desc() {
        return atm_inventario_cont_desc;
    }

    public double getAtm_inventario_cont_cantidad() {
        return atm_inventario_cont_cantidad;
    }

    public String getAtm_inventario_grupo_cont() {
        return atm_inventario_grupo_cont;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "atm_inventario_cont_unidades='" + atm_inventario_cont_unidades + '\'' +
                ", atm_inventario_año=" + atm_inventario_año +
                ", atm_inventario_sector='" + atm_inventario_sector + '\'' +
                ", atm_inventario_cont_desc='" + atm_inventario_cont_desc + '\'' +
                ", atm_inventario_cont_cantidad=" + atm_inventario_cont_cantidad +
                ", atm_inventario_grupo_cont='" + atm_inventario_grupo_cont + '\'' +
                '}';
    }
}
