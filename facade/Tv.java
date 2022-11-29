/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Tv {
    private Processor processor = null;
    private Memory memory = null;
    private Screen screen = null;

    public Tv(Processor processor,
            Memory memory,
            Screen screen) {
        this.processor = processor;
        this.memory = memory;
        this.screen = screen;
    }
    
    public void powerTv(){
        processor.start();
        memory.load();
        screen.start();
        screen.showContent();
    }
}
