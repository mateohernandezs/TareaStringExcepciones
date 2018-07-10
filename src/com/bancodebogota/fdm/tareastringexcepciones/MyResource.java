/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.tareastringexcepciones;

/**
 *
 * @author admin
 */
public class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Cerrando recurso");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
