/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan61.livingthing;

/**
 *
 * @author Acer
 * Nama     : Handrian Rivaldi
 * Kelas    : IF-2
 * NIM      : 10119074
 * Deskrifsi :
 */
public abstract class LivingThing {
    public abstract void walk(String nama);

    public void breath(String nama) {
        System.out.println(nama.concat(" Bernafas."));
    }    

    public void eat(String nama) {
        System.out.println(nama.concat(" Makan."));
    }    
    
}
