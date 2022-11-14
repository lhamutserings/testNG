//maven repository: download tools that you need for your program
    /*TestNG is a testing framework inspired from JUnit and NUnit but
    introducing some new functionalities that make it more powerful and easier to use. It supports test configured by annotations, data-driven testing, parametric tests, etc.*/
// Download: testng version 7.4.0 > click on jar in files
// Add testng module to intellij: file > project structure > modules > +jar or directory > choose testsng > apply
//Repeat to add jcommander version 1.81 (NB: error will be shown if we run without jcommander)
// MULTIPLE ANNOTATIONS  TO CHECK ORDER
import org.testng.annotations.*;

public class newTest {

//ANNOTATION
@AfterSuite //runs after everything
    void myTest1(){ //creating three methods
    System.out.println("First test passed.");
    //use ASSERT.ASSERTEQUALS(
}
@BeforeSuite //runs before everything else
    void myTest2(){
    System.out.println("Second test passed.");
}
@Test
    void myTest3(){
    System.out.println("Third test passed.");
}
@BeforeTest
    void myTest4(){
    System.out.println("Fourth test passed");
}
@AfterTest
    void myTest5(){
    System.out.println("Fifth test passed.");}
    @BeforeClass
            void myTest6(){
        System.out.println("Sixth tes");
    }
    // This program runs in order of 2, 4, 6, 3, 5, 1

/* now to create a test report using testng:
    Step 1: right click test case, in this case newTest
     Step 2: modify run config
     Step3: Listener > +HTMLTestReporter > Apply > ok > Run the program AGAIN [run annotation]
     Step 4: Run the html file in any browser
 */

}
