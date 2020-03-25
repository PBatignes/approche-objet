/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.IncorrectParameterException;
import utils.StringUtils;


/**
 *
 * @author Pierre
 *
 */
public class StringUtilsTest {
	
	@Test
	public void levenshteinDistance1() {
		
		try {
			int res = StringUtils.levenshteinDistance("java", "jva");
			assertEquals(1, res);
		} catch (IncorrectParameterException e) {
			fail();
		}
	}
	
	@Test
	public void levenshteinDistance2() {
		
		try {
			int res = StringUtils.levenshteinDistance("jva", "java");
			assertEquals(1, res);
		} catch (IncorrectParameterException e) {
			fail();
		}
	}
	
	@Test
	public void levenshteinDistance3() {
		
		try {
			int res = StringUtils.levenshteinDistance("java", "jeva");
			assertEquals(1, res);
		} catch (IncorrectParameterException e) {
			fail();
		}
	}
	
	@Test
	public void levenshteinDistance4() {
		
		try {
			int res = StringUtils.levenshteinDistance("", "java");
			assertEquals(4, res);
		} catch (IncorrectParameterException e) {
			fail();
		}
	}
	
	@Test(expected = IncorrectParameterException.class)
	public void levenshteinDistance5() throws IncorrectParameterException {
		
		try {
			int res = StringUtils.levenshteinDistance(null, "java");
			assertEquals(1, res);
		} catch (IncorrectParameterException e) {
			throw e;
		}
	}

}

