package HW_1_2;

import org.junit.Test;

public class MainClassTest extends MainClass


{
    @Test
    public void testGetClassNumber(){
        if (getClassNumber() > 45) {
            System.out.println("Number > 45");
        } else{
            System.out.println("Number <= 45");
        }


    }

}
