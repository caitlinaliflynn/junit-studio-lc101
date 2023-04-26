package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.BonusBinarySearch;

public class BonusBinarySearchTest {

    int[] positiveNumArray = {2, 5, 7, 18, 29, 44, 86};
    int[] negativeNumArray = {-47, -24, -1, 0, 14, 63, 99};
    int[] singleNumArray = {50};
    int[] emptyArray = new int[0];

    @Test
    public void aNumInFirstHalfOfArrayIsFound() {
        int testNum = 7;
        int expected = 2;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aNumInSecondHalfOfArrayIsFound() {
        int testNum = 44;
        int expected = 5;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aNumInExactMiddleIsFound() {
        int testNum = 18;
        int expected = 3;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(expected, actual);
    }
    @Test
    public void aNumAtTheFirstIndexOfTheArrayIsFound() {
        int testNum = 2;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aNumAtTheLastIndexOfArrayIsFound() {
        int testNum = 86;
        int expected = 6;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aNegativeNumberIsFound() {
        int testNum = -47;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(negativeNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aNumIsNotFoundInTheArray() {
        int testNum = 100;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aSingleNumberIsFound() {
        int testNum = 50;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void aSingleNumberIsNotFound() {
        int testNum = 100;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(expected, actual);
    }

    @Test
    public void anArrayIsEmpty() {
        int testNum = 100;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(emptyArray, testNum);
        assertEquals(expected, actual);
    }

}
