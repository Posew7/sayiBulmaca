/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilisimegitim.sayibulmacaa.mb;

import java.util.Random;
import java.util.Scanner;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author BemDell1
 */
@Named(value = "anaEkranMB")
@RequestScoped
public class anaEkranMB {

    /**
     * Creates a new instance of anaEkranMB
     */
    int girilenSayi;
    int rastgeleSayi;

    Random rand = new Random();

    public anaEkranMB() {
        this.rastgeleSayi = rand.nextInt(9) + 1;
    }

    public int getGirilenSayi() {
        return girilenSayi;
    }

    public void setGirilenSayi(int girilenSayi) {
        this.girilenSayi = girilenSayi;
    }

    public String dene() {

        if (girilenSayi == rastgeleSayi) {
            return "menu.xhtml";
        } else {
            return "";
        }

    }

}
