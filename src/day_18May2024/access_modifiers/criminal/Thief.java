package day_18May2024.access_modifiers.criminal;

import day_18May2024.access_modifiers.police.Cop;

/**
 * 	                                default	protected	private	public
 * Same Class	                    yes	    yes	        yes	    yes
 * same package subclass	        yes	    yes	        no	    yes
 * same package non subclass	    yes	    yes	        no	    yes
 * different package subclass	    no	    yes	        no	    yes
 * different package non subclass	no	    no	        no	    yes
 */

public class Thief extends Cop{
    public static void main(String[] args) {
        Cop c1 = new Cop();
        c1.gun = 2;
        System.out.println(c1.gun);
//        c1.canIShoot();

    }
}
