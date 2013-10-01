package ch.zhaw.mdpjunittest;


import ch.zhaw.mdpjunit.MdpJunitDemoImpl;
import junit.framework.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import ch.zhaw.mdpjunit.MdpJunitDemoImpl;







public class MdpJunitDemoTest {
	/**
	 * 
	 */
	private String lowerCase = "hello";
	private String upperCase = "HELLO";
	private String numberCase ="123ABC";
	private MdpJunitDemoImpl demo  = new MdpJunitDemoImpl();


	// NEW methods w/ the annotation Before are executed
	// are called before each @Test method (like
	// setUp() in older junit versions
	@Before
		public void init() {        
	  	}

	// NEW methods w/ the annotation After are executed
	// are called before each @Test method (like
	// tearDown() in older junit versions
    @After
	    public void clear() {        
	    }


    // NEW methods w/ the annotation BeforeClass are executed
    // before executing any tests
    // Note: this method must be static
    @BeforeClass
	    public static void beforeEverything() {    	
	    }


    // NEW methods w/ the annotation AfterClass are executed
    // after executing all tests
    // Note: this method must be static
    @AfterClass
	    public static void cleanUp() {
	    }


    // NEW test methods are found w/ the new annotation Test
    // instead of the signature void testMethod
	@Test
	    public void stringCapitalize() {
	        String strRet = demo.capitalize(lowerCase);
	        assertEquals(strRet, "Hello");
	        strRet = demo.capitalize(upperCase);
	        assertEquals(strRet, "Hello");
	        strRet = demo.capitalize(numberCase);
	        assertEquals(strRet, "123abc");
	    }
	    
	 // NEW test methods are found w/ the new annotation Test
	 // instead of the signature void testMethod
	@Test
	    public void stringEmpty() {
	        boolean bRet = demo.isEmpty("");
	        assertEquals(bRet, true);
	        bRet = demo.isEmpty(null);
	        assertEquals(bRet, true);
	        bRet = demo.isEmpty("bjaliajf");
	        assertEquals(bRet, false);        
	    }
	    
    @Test(expected=NullPointerException.class)
	    public void stringreverseNull() {
	        String strRet = demo.reverse(null);
	            
	    }
	    
    @Test
	    public void stringReverse(){
	    	 String strRet = demo.reverse("Hallo");
	    	assertEquals(strRet, "ollaH");          
	    }
	    
    @Test
	    public void stringJoin(){
     	 String[] strings = new String[]{ "Hallo", " wie ", "gehts?"};
    	 String strRet = demo.join(strings);
	   	assertEquals(strRet, "Hallo wie gehts?");          
	   }   


}



