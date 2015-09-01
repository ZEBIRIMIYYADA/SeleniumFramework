package amazon;

import CommonApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

/**
 * Created by djelloul on 8/31/2015.
 */
public class Retail extends Base {
    @Test
    public void test1(){
      typeByCssThenEnter  ("#twotabsearchtextbox","Books");
    }
}
