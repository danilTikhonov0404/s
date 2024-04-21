package koschei.models;

import org.springframework.stereotype.Component;


public class Egg6 {
      private Duck5 duck5;
    public Egg6(Duck5 duck5) {
        this.duck5 = duck5;
    }
    private Needle7 needle7 = new Needle7();

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
