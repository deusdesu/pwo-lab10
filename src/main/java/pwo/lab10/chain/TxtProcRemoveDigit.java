/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author macie
 */
public class TxtProcRemoveDigit extends TxtProc {

    public static String ACTION = "REMOVEDIGIT";

    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {
            //zamiana cyfr na pusty string.
            return request.text.replaceAll("\\d", "");
        } else {
            return next(request);
        }
    }
}
