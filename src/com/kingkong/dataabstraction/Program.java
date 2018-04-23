/*
** *****************kiranmaharjan8888@gmail.com
*Concept of:----
*override
* Abstraction:

* Concept of override:

*Constructor:

*Inheritence:
 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.entities.BaseGuitar;
import com.kingkong.dataabstraction.entities.Guitar;

/**
 *
 * @author kiran
 */
public class Program {

    
    public static void main(String[] args) {
        
        //..guitar is a parent class
        Guitar g=new Guitar();
        g.play(); //..it calls guitar class function
        
        //--BaseGuitar is child class
        BaseGuitar bg=new BaseGuitar();
        bg.play();//--Again it calls guitar class function
        
        //--so override the play method of guitar parrent class
        
    }
    
}
