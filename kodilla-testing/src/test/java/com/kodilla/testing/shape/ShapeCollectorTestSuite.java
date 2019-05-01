package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        //When
        shapeCollector.addFigure();
        //Then
        Assert.assertEquals(1, shapeCollector.getShapesSize());
    }

    @Test
    public void removeFigure() {
        //Given
        Shape shape = new Circle("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        shapeCollector.addFigure();
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesSize());
    }
    @Test
    public void getFigure() {
        //Given
        Shape shape = new Circle("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        shapeCollector.addFigure();
        //When
        Shape retrieved = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, retrieved);
    }

    @Test
    public void showFigures() {
        //Given
        Shape shape = new Circle("circle", 2);
        Shape shape1 = new Square("square", 4);
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        ShapeCollector shapeCollector1 = new ShapeCollector(shape1);
        shapeCollector.addFigure();
        shapeCollector1.addFigure();
        //When
        String retrieved = shapeCollector.showFigures(0);
        String retrieved1 = shapeCollector1.showFigures(0);

        //Then
        Assert.assertEquals("circle 2.0", retrieved);
        Assert.assertEquals("square 4.0", retrieved1);
    }



}
