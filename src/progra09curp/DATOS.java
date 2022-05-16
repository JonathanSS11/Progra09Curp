/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra09curp;

import java.util.Random;

/**
 *
 * @author HP
 */
class DATOS {
    
    private String nombre;
    private String paterno;
    private String materno;
    private String genero;
    private String anio;
    private String mes;
    private String dia;
    private String lugar;
    private String resultado;
    Random random = new Random();

    public DATOS() {
    }

    public DATOS(String nombre, String paterno, String materno, String genero, String anio, String mes, String dia, String lugar) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.genero = genero;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getResultado() {

        String la = String.valueOf(paterno.charAt(0));
        la = la.toUpperCase();
        String l2 = String.valueOf(paterno.charAt(1));
        l2 = l2.toUpperCase();
        String l3 = String.valueOf(materno.charAt(0));
        l3 = l3.toUpperCase();
        String l4 = String.valueOf(nombre.charAt(0));
        l4 = l4.toUpperCase();
        String an = String.valueOf(anio.charAt(2));
        String an2 = String.valueOf(anio.charAt(3));
        String m = String.valueOf(mes.charAt(0));
        String m2 = String.valueOf(mes.charAt(1));
        String n = String.valueOf(dia.charAt(0));
        String n2 = String.valueOf(dia.charAt(1));
        String g = String.valueOf(genero.charAt(0));
        g = g.toUpperCase();
        String lug = String.valueOf(lugar.charAt(0));
        lug = lug.toUpperCase();
        String lugar1 = String.valueOf(lugar.charAt(1));
        lugar1 = lugar1.toUpperCase();
        String conso = String.valueOf(paterno.charAt(2));
        conso = conso.toUpperCase();
        String conso1 = String.valueOf(materno.charAt(2));
        conso1 = conso1.toUpperCase();
        String conso2 = String.valueOf(nombre.charAt(2));
        conso2 = conso2.toUpperCase();
        char randomcaracter = (char) (random.nextInt(26) + 'A');
        int na = (int) (Math.random() * 10 + 1);
        resultado=la + l2 + l3 + l4 + an + an2 + m + m2 + n + n2 + g + lug + lugar1 + conso + conso1 + conso2 + randomcaracter + na;
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
}
