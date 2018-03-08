/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2;

/**
 *
 * @author jdani
 */
public enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s){
        
        sound = s;
              
    };
}
