package org.example;

import org.testng.annotations.DataProvider;

public class DataClass1 {
        @DataProvider(name="mylogindata")
        public Object[][] getloginData(){
            Object[][] data ={{112244,"Aniket","aniket@gmail.com"},
                    {123456,"Subho","subho@gmail.com"},
                    {122345,"kaustav","kaustav@gmail.com"}};
            return data;

        }
}
