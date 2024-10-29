/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int stockDisponible;
    private double precioUnitario;
    private int cantidad;
    private double precioTotal;

    // Constructor
    public Producto(String codigo, String nombre, int stockDisponible, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stockDisponible = stockDisponible;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precioTotal = cantidad * precioUnitario;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void calcularPrecioTotal() {
        this.precioTotal = this.cantidad * this.precioUnitario;
    }
}

