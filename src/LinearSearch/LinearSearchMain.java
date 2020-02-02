/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

/**
 *
 * @author Brandon
 */
public class LinearSearchMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinearSearch ble = new LinearSearch();

        ble.Fill_arr();
       ble.display();
        ble.Findmax();
       ble.Findmin();
        System.out.println("--------------------------");
        ble.Searchall();
       
        
    }
}
