package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: Begin!");
    }

    @After
    public void after() {
        System.out.println("Test Case: End! \n");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: Begin! \n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: End!");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            numbers.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing:");
        for (int i = 0; i < oddNumbersExterminator.getOddNumbersSize(); i++ ) {
               System.out.print(oddNumbersExterminator.getOddNumbers(i) + ", ");
        }
        System.out.println();
        //Then
       for (int i = 0; i < oddNumbersExterminator.getOddNumbersSize(); i++){
            Assert.assertEquals((oddNumbersExterminator.getOddNumbers(i) % 2 == 0), true);
        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing:");
        for (int i = 0; i < oddNumbersExterminator.getOddNumbersSize(); i++ ) {
            System.out.print(oddNumbersExterminator.getOddNumbers(i) + ", ");
        }
        System.out.println();
        //Then
        for (int i = 0; i < oddNumbersExterminator.getOddNumbersSize(); i++){
            Assert.assertEquals((oddNumbersExterminator.getOddNumbers(i)%2 == 0), true);
        }

    }
}
