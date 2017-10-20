import java.lang.*;
class DatatypesOperatorsControlstatements
{
	public static void main(String args[])
	{
	System.out.println(13>10);    //true   
                                                                                    
	 System.out.println(13<=10);   // true
 
         System.out.println(13>=10);   // true
 
	 System.out.println(13==10);   // false
 
	 System.out.println(13!=10);   // true
 
         System.out.println(13>13);    // false
 
	 System.out.println(13>=13);  // true
 
	 System.out.println(13<=13);  // true
 
         System.out.println(13==13);  //true
 
	 System.out.println(13!=13);  //false
 
	 System.out.println('A'==65); // true    ascii value of'A'is  65
 
         System.out.println('0'==48); // true    ascii value of'0'is  48
 
         System.out.println('2'==2 );

           int a=1;
            
            System.out.println((a==1)?true:false);   //true
            
            System.out.println((a==0)?true:false);   //false
 
            System.out.println(true?1:2);            //1
   
            System.out.println(false?1:2);           //2
       
            System.out.println((1<2)?1:2);           //1
          
            System.out.println((1>2)?1:2);           //2



              int age=19;  
         if ( age >= 18 && age <=35 )  
            System.out.println( "between 18-35 " );  
        else if(age >35 && age <=60)  
            System.out.println("between 36-60");  
        else  
            System.out.println( "not matched" );

        switch ( age )  
        {  
            case 18:  
                System.out.println( "age 18" );  
                break;  
            case 19:  
                System.out.println( "age 19" );  
                break;  
            default:  
                System.out.println( "not matched" );  
                break;  
        }

        int[] i =  
        { 1, 2, 3, 4, 5 };  
        for ( int j : i )  
        {  
            System.out.println( "value :: " + j );  
        }

        Outer: for ( int var1 = 0; var1 < 5; var1++ )  
        {  
            for ( int var2 = 0; var2 < 5; var2++ )  
            {  
                if ( var2 == 2 )  
                    continue Outer;  
                System.out.println( "var1:" + var1 + ", var2:" + var2 );  
            }  
        }            
	}
}
