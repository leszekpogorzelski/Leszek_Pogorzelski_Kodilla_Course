package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

public class ForumTestSuite {
    @Before
            public void before() {
        System.out.println("Test Case: Begin!");
    }

    @After
            public void after() {
        System.out.println("Test Case: End!");
    }

    @BeforeClass
            public static void beforeClass() {
        System.out.println("Test suite: Begin!");
    }

    @AfterClass
            public static void afterClass() {
        System.out.println("Test suite: End!");
    }
    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }

        @Test
                public void testCaseRealnName() {
            //Given
        SimpleUser simpleUser1 = new SimpleUser("theForumUser", "John Smith");
            //When
        String result1 = simpleUser1.getRealName();
            System.out.println("Testing " + result1);
            //Then
        Assert.assertEquals("John Smith", result1);
        }


}
