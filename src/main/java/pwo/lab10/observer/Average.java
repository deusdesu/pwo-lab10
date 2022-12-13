/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;
import pwo.lab10.observer.MaxFinder;

/**
 *
 * @author macie
 */
public class Average implements Subscriber {

    float avg = 0;
    float help = 0;
    @Override
    public void action(int x) {
        help = x;
        avg = avg + help/3;
    }

    public float getAvg() {
        return avg;
    }
}
