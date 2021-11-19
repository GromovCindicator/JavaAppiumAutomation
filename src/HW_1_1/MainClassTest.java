package HW_1_1;

import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber(){
        if (getLocalNumber() == 14) {
            System.out.println("Number = 14");
        } else{
            System.out.println("Number != 14");
        }


    }

}
