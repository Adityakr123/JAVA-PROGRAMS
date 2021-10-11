import java.util.*;
class call{
    float normalrate;
    float interstaterate;
    float internationalrate;
}
class normal extends call{
    static void call( double normalrate){
        System.out.println("Rate of Normal call is :- "+normalrate);
    }
}
class interstate extends call{
    static void call(double  interstaterate,String state){
        System.out.println("Rate of Interstatecall to "+state+" is :- "+interstaterate);
    }
}
class international extends call{
    static void call(double  internationalrate ,String frmcountry ,String tocountry){
        System.out.println("Rate of International call From "+frmcountry+" to " +tocountry+" is :- "+internationalrate);
    }
}
public class exp4_4
{
    public static void main(String args[])
    {
    normal objnormal=new normal();
    interstate objinterstate=new interstate();
    international objinternational=new international();   
    objnormal.call(12.6);
    objinterstate.call(50.6,"Karela");
    objinternational.call(500,"India","Usa");

    }
}