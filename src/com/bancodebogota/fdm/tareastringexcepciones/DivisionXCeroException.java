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
public class DivisionXCeroException extends Exception{

    public DivisionXCeroException(String message) {
        super("Esta es la exception division por cero:\n"+message);
    }
    
    
    
}
