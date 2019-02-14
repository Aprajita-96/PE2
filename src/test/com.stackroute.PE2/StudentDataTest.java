package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDataTest {



    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables


    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables

    }
    @Test
    public void studentDataSuccess() {
        StudentData object=new StudentData();
        double[] arrofstu={87,65,77,98};
      double [] actualOutput= object.student(4,arrofstu);
      double[] expectedOutput={81.75,0,98};

//      assertEquals(expectedOutput,actualOutput);
//      assertNull("please return null if array length is not according to no of students",expectedOutput2);
      assertArrayEquals(
              expectedOutput,actualOutput
      );


    }




}