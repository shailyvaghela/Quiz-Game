import java.util.*;
 class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=0;
		System.out.println("-------------------------------WELCOME TO JAVA QUIZ GAME--------------------------------------");
		
        String q1= "1) Which of these packages contains all the collection classes?\n"
                +"(a)java.awt\n(b)java.net\n(c)java.util\n(d)java.lang";
        System.out.println(q1);
        String ans1=sc.nextLine();
        if(ans1.equals("c")){
            score++;
			System.out.println("CORRECTT!!");
        }
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
        String q2= "2) Which of the following cannot be friend?\n"
                +"(a)Function\n(b)Class\n(c)Operator\n(d)Object";
        System.out.println(q2);
        String ans2=sc.nextLine();
        if(ans2.equals("d")){
            score++;
			System.out.println("CORRECTT!!");
        }
		else
		{
			System.out.println("INCORRECT!!");
		}
		 System.out.println();
		 
		
		String q3="3) Which component is used to compile, debug and execute the java program?\n"
		          +"(a)JRE\n(b)JIT\n(c)JDK\n(d)JVM";
		System.out.println(q3);		  
        String ans3=sc.nextLine();
		if(ans3.equals("c"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q4="4) Which of the following is a non-primitive data type in java?\n"
		          +"(a)Boolean\n(b)Character\n(c)Array\n(d)Float";
		System.out.println(q4);		  
        String ans4=sc.nextLine();
		if(ans4.equals("c"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q5="5) What is the size of boolean variable in java?\n"
		          +"(a)1 byte\n(b)2 byte\n(c)4 byte\n(d)8 byte";
		System.out.println(q5);		  
        String ans5=sc.nextLine();
		if(ans5.equals("a"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q6="6) The feature in java that helps in managing multiple tasks simultaneously is called_____\n"
		          +"(a)Multi-tasking\n(b)Multithreading\n(c)Distributed\n(d)Dynamic";
		System.out.println(q6);		  
        String ans6=sc.nextLine();
		if(ans6.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q7="7) Which are the objects in object orienting programming language?\n"
		          +"(a)Logical entities\n(b)Physical entities\n(c)Logical and Physical entities\n(d)None of the above";
		System.out.println(q7);		  
        String ans7=sc.nextLine();
		if(ans7.equals("c"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q8="8) Which of these cannot be used for a variable name in Java?\n"
		          +"(a)Identifier & keyword\n(b)Keyword\n(c)Identifier\n(d)None of the mentioned";
		System.out.println(q8);		  
        String ans8=sc.nextLine();
		if(ans8.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q9="9) Which of these cannot be used for a variable name in Java\n"
		          +"(a)_a\n(b)1a\n(c)a1\n(d)_1a";
		System.out.println(q9);		  
        String ans9=sc.nextLine();
		if(ans9.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q10="10) Which of the following are not keyword/s or reserved word/s in Java\n"
		          +"(a)if\n(b)goto\n(c)then\n(d)while";
		System.out.println(q10);		  
        String ans10=sc.nextLine();
		if(ans10.equals("c"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q11="11) What is the other name for Relational Operators in Java?\n"
		          +"(a)Comparison Operator\n(b)Conditional Operator\n(c)Both a and b\n(d)None of the above";
		System.out.println(q11);		  
        String ans11=sc.nextLine();
		if(ans11.equals("c"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q12="12) How many minimum number of operands are required to use Comparison Operator in Java?\n"
		          +"(a)1\n(b)2\n(c)3\n(d)4";
		System.out.println(q12);		  
        String ans12=sc.nextLine();
		if(ans12.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q13="13) Which of the following automatic type conversion will be possible?\n"
		          +"(a)int to long\n(b)short to int\n(c)byte to int\n(d)long to int";
		System.out.println(q13);		  
        String ans13=sc.nextLine();
		if(ans13.equals("a"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q14="14) An if-else statement is also called______\n"
		          +"(a)Branching Statement\n(b)Control Ststement\n(c)Block Statement\n(d)All of the above";
		System.out.println(q14);		  
        String ans14=sc.nextLine();
		if(ans14.equals("d"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q15="15) An if statement in JAVA ia also a ___________ statement.\n"
		          +"(a)Boolean\n(b)Condidtional\n(c)Iterative\n(d)Optional";
		System.out.println(q15);		  
        String ans15=sc.nextLine();
		if(ans15.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q16="16) Which is the alternative to SWITCH in JAVA language?\n"
		          +"(a)break,continue\n(b)for,while\n(c)goto,exit\n(d)if,else-if,else";
		System.out.println(q16);		  
        String ans16=sc.nextLine();
		if(ans16.equals("d"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q17="17) The first expression in a for... loop is\n"
		          +"(a)Step value of loop\n(b)Value of counter variable\n(c)Condition Statement	\n(d)None of the above";
		System.out.println(q17);		  
        String ans17=sc.nextLine();
		if(ans17.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q18="18) To traverse two dimentional array you require _____ loops\n"
		          +"(a)2\n(b)1\n(c)3\n(d)4";
		System.out.println(q18);		  
        String ans18=sc.nextLine();
		if(ans18.equals("a"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q19="19) Which of these operators is used to allocate memory for an object?\n"
		          +"(a)malloc\n(b)alloc\n(c)new\n(d)give";
		System.out.println(q19);		  
        String ans19=sc.nextLine();
		if(ans19.equals("c"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		
		String q20="20) __________ represents an entity in the real world that can be distinctly identified\n"
		          +"(a)A class\n(b)An object\n(c)A method\n(d)A data field";
		System.out.println(q20);		  
        String ans20=sc.nextLine();
		if(ans20.equals("b"))
		{
			score++;
			System.out.println("CORRECTT!!");
		}
		else
		{
			System.out.println("INCORRECT!!");
		}
		System.out.println();
		
		System.out.println("------------------------------CONGRATULATIONS-------------------------------------");
		System.out.println("You have scored:"+score+"/20");

    }

}