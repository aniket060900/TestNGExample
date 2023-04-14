package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidesExample {
//    @DataProvider(name="mylogindata")
//    public Object[][] getloginData(){
//        Object[][] data ={{112244,"Aniket"},{123456,"Subho"},{122345,"kaustav"}};
//        return data;
//
//    }
    @Test(dataProvider = "mylogindata",dataProviderClass = DataClass1.class)
    public void loginFrom(int reg,String name,String email){
        System.out.println(reg+" -> "+name+" -> "+email);
    }

}
