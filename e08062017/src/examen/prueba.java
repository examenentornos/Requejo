package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class prueba {

	 @Test(expected=Exception.class)
	  public void test1()
	  {
	    programa.Usuario("000", "Jesus Garcia", "10", true);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test2()
	  {
		 programa.Usuario("1001", "Carmen Ruiz", "09", false);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test3()
	  {
		 programa.Usuario("abc", "Sandra Lopez", "02", true);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test4()
	  {
		  programa.Usuario("123", "Juan Gonzalez Fernandez", "03", true);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test5()
	  {
		  programa.Usuario("123", "Carmen Ruiz", "-1", true);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test6()
	  {
		  programa.Usuario("123", "Carmen Ruiz", "111", false);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test7()
	  {
		  programa.Usuario("123", "Carmen Ruiz", "ab", false);
	  }
	  

	  @Test(expected=Exception.class)
	  public void test8()
	  {
		  programa.Usuario("123", "Carmen Ruiz", "08", false);
	  }
	  
	  @Test(expected=Exception.class)
	  public void test9()
	  {
		  programa.Usuario("123", "Vanesa Lopez", "2", true);
	  }
	  
	}