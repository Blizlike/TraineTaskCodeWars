package Kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class YesOrNoTest {

    @Test
    public void boolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}