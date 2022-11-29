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
public class IteratorBook implements Iterator {
    BookItem[] books;
    int posicao = 0;
    
    public IteratorBook(BookItem[] books){
        this.books = books;
    }
    
    public Object next() {
        BookItem bookItem = books[posicao];
        posicao++;
        return bookItem;
    }

    public boolean hasNext() {
        if (posicao >= books.length || books[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }
}
