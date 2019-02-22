package hw;

import static org.junit.Assert.*;

import org.junit.Test;




import static org.junit.Assert.*;


import org.junit.Test;


public class onlinecardtest {

	
	public void test1() {
		onlinecard c=new onlinecard();
	    function f=new function();
		assertEquals(0,f.nobook(c).getn());
		assertEquals(0,f.nobook(c).getc());
	}
	public void test2() {
		onlinecard c=new onlinecard();
	    function f=new function();
		assertEquals(1,f.nobook(c).getn());
		assertEquals(127,f.nobook(c).getc());
	}
	public void test3() {
		onlinecard c=new onlinecard();
	    function f=new function();
		assertEquals(2,f.nobook(c).getn());
		assertEquals(227,f.nobook(c).getc());
	}
	
}
