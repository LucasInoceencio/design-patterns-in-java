/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.book;

/**
 *
 * @author Lucas
 */
public class Program {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BookItem[] books = new BookItem[5];
        
        books[0] = new BookItem("Watchmen");
        books[1] = new BookItem("Universo numa casca de noz");
        books[2] = new BookItem("Buracos negros");
        books[3] = new BookItem("Sapiens");
        books[4] = new BookItem("Código limpo");
        
        Iterator bookIterator = new IteratorBook(books);
        
        while(bookIterator.hasNext()){
            BookItem bookItem = (BookItem)bookIterator.next();
            System.out.println(bookItem.name);
        }
    }
}
