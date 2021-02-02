package Kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToNumberTest {

    @Test
    public void when1234ThenInt1234() {
        assertEquals("stringToNumber(1234)", 1234 , StringToNumber.stringToNumber("1234"));
    }
    @Test
    public void when605ThenInt605() {
        assertEquals("stringToNumber(605)", 605 , StringToNumber.stringToNumber("605"));
    }
    @Test
    public void when1405ThenInt1405() {
        assertEquals("stringToNumber(1405)", 1405 , StringToNumber.stringToNumber("1405"));
    }
    @Test
    public void whenMinus7ThenIntMinus7() {
        assertEquals("stringToNumber(-7)", -7 , StringToNumber.stringToNumber("-7"));
    }
}