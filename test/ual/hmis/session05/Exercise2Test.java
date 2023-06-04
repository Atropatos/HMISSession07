package ual.hmis.session05;
import ual.hmis.session05.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Exercise2Test {
	 Exercise2 exercise2 = new Exercise2();
	@Test
	public void testLoginEmptyUsername() {
		String username="";
		String password="ValidPassword";
		
		assertEquals(false, exercise2.login(username, password));
	}
	@Test
	public void testLoginEmptyPassword() {
		String username="ValidUsername";
		String password="";
		assertEquals(false,exercise2.login(username, password));
	}
	@Test
    public void testLoginLongUsername() {
        String username = "abcdefghijklmnopqrstuvwxyz23232332323abcdef";  // Username too long
        String password = "Password1";  // Valid password
        assertEquals(false, exercise2.login(username, password));
    }

    @Test
    public void testLoginLongPassword() {
        String username = "user";  // Valid username
        String password = "abcdefghijklmnopqrstuvwx232332yzabcd2333ef";  // Password too long
        assertEquals(false, exercise2.login(username, password));
    }
    
    @Test
    public void testLoginInvalidPassword() {
        String username = "user";  // Valid username
        String password = "password";  // Password without uppercase letters or digits
        assertEquals(false, exercise2.login(username, password));
    }

    @Test
    public void testLoginValidCredentials() {
        String username = "user";  // Valid username
        String password = "Pass1";  // Valid password
        assertEquals(true, exercise2.login(username, password));
    }
    @Test
    public void testLoginInValidCredentials() {
        String username = "user";  // Valid username
        String password = "Pass2";  // Valid password
        assertEquals(false, exercise2.login(username, password));
    }
    @Test
    public void testLoginInValidCredentials2() {
        String username = "user";  // Valid username
        String password = "Pass";  // Valid password
        assertEquals(false, exercise2.login(username, password));
    }
    @Test
    public void testLoginInValidCredentials3() {
        String username = "user";  // Valid username
        String password = "123";  // Valid password
        assertEquals(false, exercise2.login(username, password));
    }
    @Test
    public void testLoginInValidCredentials4() {
        String username = "user";  // Valid username
        String password = "aaa";  // Valid password
        assertEquals(false, exercise2.login(username, password));
    }
    
    @Test
    public void testLoginInvalidPassword2() {
        String username = "user2";  // Valid username
        String password = "Pass1";  // Password without uppercase letters or digits
        assertEquals(false, exercise2.login(username, password));
    }
}
