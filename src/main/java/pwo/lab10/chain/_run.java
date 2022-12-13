/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author macie
 */
public class _run {

    public static void main(String[] args) {
        TxtProc procChain = new TxtProcUp();
        procChain.add(new TxtProcDown());
        procChain.add(new TxtProcReverse());
        //dodanie obiektu klasy nowej klasy.
        procChain.add(new TxtProcRemoveDigit());
        
        String Ala = "Ala ma 12 kotów i 3 psy.";
        Request request0 = new Request(Ala, "up");
        Request request1 = new Request(Ala, "down");
        Request request2 = new Request(Ala, "reverse");
        Request request3 = new Request(Ala, "removeDIgiT");

        System.out.println(procChain.processRequest(request0));
        System.out.println(procChain.processRequest(request1));
        System.out.println(procChain.processRequest(request2));
        System.out.println(procChain.processRequest(request3));
    }
}
