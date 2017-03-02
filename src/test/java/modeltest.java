import com.sidgs.model.Member;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vens on 3/1/2017.
 */
public class modeltest {

       @Test

           public void getId(){
             Member m = new Member();
             int expResult= 10;
              m.setId(10);
             int result = m.getId();
             assertEquals(expResult,result);

       }
       @Test

       public void setId(){
           Member m = new Member();
           m.setId(10);
           Assert.assertEquals(m.getId(),10);

       }
       @Test

       public void getFirst_name(){
           Member m = new Member();
           String expResult = "Tagore";
           m.setFirst_name("Tagore");
           String result = m.getFirst_name();
           assertEquals(expResult,result);



       }
       @Test

       public void setFirst_name(){
           Member m = new Member();
           m.setFirst_name("Tagore");
           Assert.assertEquals(m.getFirst_name(),"Tagore");
       }
       @Test

       public void getLast_name(){
           Member m = new Member();
           String expResult  = "Vytla";
           m.setLast_name("Vytla");
           String result = m.getLast_name();
           assertEquals(expResult,result);

       }
       @Test

       public void setLast_name(){
           Member m = new Member();
           m.setLast_name("Vytla");
           Assert.assertEquals(m.getLast_name(),"Vytla");
       }
       @Test
       public void getEmail(){
           Member m = new Member();
           String expResult = "vytlasai@gmail.com";
           m.setEmail("vytlasai@gmail.com");
           String result = m.getEmail();
           assertEquals(expResult,result);

       }
       @Test
        public void setEmail(){
           Member m  = new Member();
           m.setEmail("vytlasai@gmail.com");
           Assert.assertEquals(m.getEmail(),"vytlasai@gmail.com");
       }
       @Test
       public void getGender(){
           Member m = new Member();
           String expResult = "Male";
           m.setGender("Male");
           String result = m.getGender();
           assertEquals(expResult,result);

       }
       @Test
       public void setGender(){
           Member m = new Member();
           m.setGender("Male");
           Assert.assertEquals(m.getGender(),"Male");
       }
       @Test
       public void getTele_phone(){
           Member m = new Member();
           String expResult = "203-296-0281";
           m.setTele_phone("203-296-0281");
           String result = m.getTele_phone();
           assertEquals(expResult,result);

       }
       @Test
       public void setTele_phone(){
           Member m = new Member();
           m.setTele_phone("203-296-0281");
           Assert.assertEquals(m.getTele_phone(),"203-296-0281");
       }
       @Test
       public void getUserid(){
           Member m = new Member();
           String expResult = "0301";
           m.setUserid("0301");
           String result = m.getUserid();
           assertEquals(expResult,result);
       }
       @Test
       public void setUserid(){
           Member m = new Member();
           m.setUserid("0301");
           Assert.assertEquals(m.getUserid(),"0301");
       }

}
