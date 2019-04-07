package com.aldado;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void poes(){
        CanBeCAched c = new CanBeCAched();
        StringWrapper s = new StringWrapper("hallo");
        CacheManager cm = new CacheManager();

        cm.cache(c);
        cm.cache(s);

        assertTrue(true);
    }

}
