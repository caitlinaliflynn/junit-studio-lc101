package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void emptyStringReturnsTrue() {
        String condition = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void emptyBracketsReturnsTrue() {
        String condition = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(condition));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithInnerCharactersReturnsTrue() {
        String condition = "[LaunchCode]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void bracketsWithInnerAndOuterCharactersReturnsTrue() {
        String condition = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void bracketsWithOuterCharactersReturnsTrue() {
        String condition = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void openingBracketWithoutClosingBracketReturnsFalse() {
        String condition = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void closingBracketsWithoutOpeningBracketReturnsFalse() {
        String condition = "LaunchCode]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void openingBracketOnlyReturnsFalse() {
        String condition = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void closingBracketOnlyReturnsFalse() {
        String condition = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse() {
        String condition = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(condition));
    }

    @Test
    public void bracketsInWrongOrderWithCharactersReturnsFalse() {
        String condition = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(condition));
    }
}
