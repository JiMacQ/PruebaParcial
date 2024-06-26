package com.example.pruebaparcial;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class Product {
    private String Categoria;
    private String Precio;
    private String Image;
    private String Description;

    public String getCategoria() {
        return Categoria;
    }

    public String getPrecio() {
        return Precio;
    }

    public String getImage() {
        return Image;
    }

    public String getDescription() {
        return Description;
    }

    public Product(JSONObject a) throws JSONException {
        Categoria = a.getString("category");
        Precio = a.getString("price");
        Image = a.getString("image");
        Description = a.getString("description");  // Clave corregida
    }

    public static ArrayList<Product> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Product> productos = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            productos.add(new Product(datos.getJSONObject(i)));
        }
        return productos;
    }
}