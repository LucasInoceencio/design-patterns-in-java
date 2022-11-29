/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable.ticket;

import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ObservableTicket extends Observable {
    private int statusTicket;
    
    public void setStatusTicket(int statusTicket){
        this.statusTicket = statusTicket;
        
        setChanged();
        notifyObservers();
    }
    
    public int getStatusTicket(){
        return this.statusTicket;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int newStatus = 4;
        ObservableTicket observableTicket = new ObservableTicket();
        Client1 client1 = new Client1(observableTicket);
        
        while(newStatus > 0){
            System.out.println("Digite um número maior que zero ou digite zero para sair!");
            newStatus = scan.nextInt();
            System.out.println("");
            
            observableTicket.setStatusTicket(newStatus);
        }
        
        scan.close();
    }
}


