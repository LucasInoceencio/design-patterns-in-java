/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable.ticket;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Lucas
 */
public class Client1 implements Observer{
    Observable observableTicket;
    
    int idNewStatusTicket;
    
    public Client1(Observable observableTicket){
        this.observableTicket = observableTicket;
        observableTicket.addObserver(this);
    }
    
    @Override
    public void update(Observable observableSubject, Object arg1){
        if(observableSubject instanceof ObservableTicket){
            ObservableTicket observableTicket2 = (ObservableTicket) observableSubject;
            idNewStatusTicket = observableTicket2.getStatusTicket();
            System.out.println("O status do pedido foi atualizado para: " + idNewStatusTicket);
        }
    }
}
