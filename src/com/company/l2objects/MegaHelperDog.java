package com.company.l2objects;

public class MegaHelperDog extends HelperDog{
    MegaHelperDog(String name){
        super(name);
    }
    public void megaHelp(){
        System.out.println("We helped a lot");
    }

    public String toString(){
        return "mega" + super.toString();
    }
}
