import org.testng.annotations.*;

public class TestNgCases {

    @BeforeSuite //1
    void TestCase1() {
        System.out.println("First Test case passed.");
    }
    @AfterSuite //9
    void TestCase2(){
        System.out.println("Second Test case passed.");
    }
    @AfterTest //8
    void TestCase3(){
        System.out.println("Third Test Case passed.");
    }
    @Test   //5
    void TestCase4(){
        System.out.println("Fourth Test Case passed.");
    }
    @BeforeTest //2
    void TestCase5(){
        System.out.println("Fifth Test Case passed.");
    }
    @BeforeClass    //3
    void TestCase6(){
        System.out.println("Sixth Test Case passed. ");
    }

    @BeforeMethod //4
    void TestCase7(){
        System.out.println("Seventh test passed.");
    }

    @AfterMethod //6
    void TestCase8(){
        System.out.println("Eighth test passed.");
    }
    @AfterClass //7
    void TestCase9(){
        System.out.println("Ninth test passed.");
    }
}
// B4Suite > b4Test > b4Class > b4Method > Test method > AfterMethod > AfterClass > AfterTest > AfterSuite