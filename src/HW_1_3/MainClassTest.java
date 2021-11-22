package HW_1_3;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass


{
    @Test
    public void testGetClassString(){
        //System.out.println(getClassString().substring(0,5));
        if (getClassString().substring(0,5).equals("Hello") || getClassString().substring(0,5).equals("hello")) {

        } else{
            Assert.fail("Test failed, message didn't have 'Hello' or 'hello'");
        }


    }

}
