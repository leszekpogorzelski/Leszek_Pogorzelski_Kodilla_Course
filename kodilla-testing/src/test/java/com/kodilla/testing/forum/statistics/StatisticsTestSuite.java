package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculateStatistics;
import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
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
    public void postCountZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> users = new LinkedList<String>();
            for (int i = 0; i < 100; i++){
                users.add("Jan Nowak" + i);
            }

        int postCounter = 0;
        int commentCounter = 100;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(postCounter);
        when(statisticsMock.commentCount()).thenReturn(commentCounter);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double postCountZeroTest = calculateStatistics.getAveragePostPerUser();

        //Then
        Assert.assertEquals(0.0, postCountZeroTest, 0.1 );
    }

    @Test
    public void postCountThousandTest(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> users = new LinkedList<String>();
        for (int i = 0; i < 100; i++){
            users.add("Jan Nowak" + i);
        }

        int postCounter = 1000;
        int commentCounter = 100;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(postCounter);
        when(statisticsMock.commentCount()).thenReturn(commentCounter);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double postCountThousandTest = calculateStatistics.getAveragePostPerUser();

        //Then
        Assert.assertEquals(10.0, postCountThousandTest, 0.1 );
    }
    @Test
    public void commentCountZeroTest(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> users = new LinkedList<String>();
        for (int i = 0; i < 100; i++){
            users.add("Jan Nowak" + i);
        }

        int postCounter = 1000;
        int commentCounter = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(postCounter);
        when(statisticsMock.commentCount()).thenReturn(commentCounter);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double commentCountZeroTest = calculateStatistics.getAverageCommentPerUser();

        //Then
        Assert.assertEquals(0.0, commentCountZeroTest, 0.1 );
    }

    @Test
    public void commentCountGreaterTest(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> users = new LinkedList<String>();
        for (int i = 0; i < 100; i++){
            users.add("Jan Nowak" + i);
        }

        int postCounter = 100;
        int commentCounter = 1000;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(postCounter);
        when(statisticsMock.commentCount()).thenReturn(commentCounter);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double commentCountGreaterTest = calculateStatistics.getAverageCommentPerPost();

        //Then
        Assert.assertEquals(10.0, commentCountGreaterTest, 0.1 );
    }
    @Test
    public void userCountZeroTest(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> users = new LinkedList<String>();


        int postCounter = 0;
        int commentCounter = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(postCounter);
        when(statisticsMock.commentCount()).thenReturn(commentCounter);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double userCounterZeroTest = calculateStatistics.getAverageCommentPerUser();

        //Then
        Assert.assertEquals(0.0, userCounterZeroTest, 0.1 );
    }


    @Test
    public void commentCountLessTest(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> users = new LinkedList<String>();
        for (int i = 0; i < 100; i++){
            users.add("Jan Nowak" + i);
        }

        int postCounter = 1000;
        int commentCounter = 500;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(postCounter);
        when(statisticsMock.commentCount()).thenReturn(commentCounter);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        double commentCountLessTest = calculateStatistics.getAverageCommentPerPost();

        //Then
        Assert.assertEquals(0.5, commentCountLessTest, 0.1 );
    }


}
