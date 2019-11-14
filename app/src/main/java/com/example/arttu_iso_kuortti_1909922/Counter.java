package com.example.arttu_iso_kuortti_1909922;


public class Counter {
    private int laskuri;

    public Counter(int laskuri){
       this.laskuri = laskuri;
    }
    public int lisaus(){
        laskuri++;
        if(laskuri > 10){
            laskuri = 10;
        }
        return laskuri;
    }

}
