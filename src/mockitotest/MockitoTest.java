/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockitotest;

/**
 *
 * @author movio
 */
public class MockitoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcService calcService=new CalcService();
        System.out.println(calcService.add(3, 3));
    }
    
}
