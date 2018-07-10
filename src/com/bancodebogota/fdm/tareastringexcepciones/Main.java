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
public class Main {

    public int divisionPorCeroChecked(int num, int den) {
        int result=0;
        try {
            if (den==0) {
                throw new DivisionXCeroException("No se puede divir por cero");
            }else{
                result= num/den;
            }            
        } catch (DivisionXCeroException ex) {
            System.out.println(ex);
        }
        return result;
    }

    public void divisionPorCeroUnChecked() {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public int divisionPorCeroThrows(int n, int d) throws DivisionXCeroException {
        
        if (d==0) {
            throw new DivisionXCeroException("No se puede divir por cero");
        }else{
            return n/d;
        }
        
    }

    public void cerrarRecurso() {
        try (MyResource mr = new MyResource()) {
            
        } catch (Exception ex) {

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Manejo de excepciones
        Main m = new Main();        
        m.divisionPorCeroChecked(6,0);
        m.divisionPorCeroUnChecked();
        try {
            m.divisionPorCeroThrows(4,0);
        } catch (DivisionXCeroException ex) {

        }
        
        //Manejo de recursos AutoCloseable
        m.cerrarRecurso();
        
        //Manejo de Strings
        ManejoStrings ms = new ManejoStrings();
        StringBuilder sb = new StringBuilder("aaaabbaaaa");
        StringBuffer sbf = new StringBuffer("aaaabbaaaa");
        
        String s1 ="aaaabbaaaa";
        String s2 ="aaaabbaaaa";
        
        System.out.println(ms.palindromoStringBuffer(s1));
        System.out.println(ms.palindromoStringBuilder(s2));
        System.out.println(ms.parrafoStringBuffer(sbf));
        System.out.println(ms.parrafoStringBuilder(sb));
    }
}
