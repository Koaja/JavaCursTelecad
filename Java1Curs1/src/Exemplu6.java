public class Exemplu6{
    public static void main (String [] args){
        int h1 = 10;
        int m1 = 14;
        int s1 = 53;
        int h2 , m2 , s2;
        h2 = 7;
        m2 = 50;
        s2 = 10;
        
        int h3 = 0;
        int m3 = 0;
        int s3 = 0;
        
        if(s1 + s2 >= 60){
            s3 = s1 + s2 - 60;
            m3 = 1;
        } else {
            s3 = s1 + s2;
        }
            
        if(m1 + m2 + m3 >= 60){
            m3 = m1 + m2 + m3 - 60;
            h3 = h1 + h2 + 1;
        } else {
            m3 = m1 + m2 + m3;
            h3 = h1 + h2;
        }
        
        System.out.println(h3 + " :" + m3 + " :" + s3);
        
        
        if (m3 >= 9) {
            if(s3 >= 9) {
             System.out.println(h3 + " :" + m3 + " :" + s3);
            }else {
             System.out.println(h3 + " :" + m3 + " :0" + s3);  
            }
        } else {
            if (s3 >= 9){
             System.out.println(h3 + " :0" + m3 + " :" + s3);
            } else {
             System.out.println(h3 + " :0" + m3 + " :0" + s3);
            }
        }
        
        if ((m3 >= 9) || (s3 >= 9)){
         System.out.println(h3 + " :0" + m3 + " :0" + s3);
        }else {
            System.out.println(h3 + " :" + m3 + " :" + s3);
        }
    }
}