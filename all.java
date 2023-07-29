package first;

import java.util.Scanner;

class type1
{
	//without return type and without parameter
void type()	
{
 int id=1;
 String n="raj";
 String c="vellore";
 //operator
 int a=10;
 int b=20;
 int aa=30;
 int d=a+b;
 a+=5;
 int ab=(a<b)?a:b;
 
 System.out.println("ID :"+id+", NAME :"+n+", CITY :"+c);
 System.out.println("LEFT SHIFT :"+(10<<2));
 System.out.println("RIGHT SHIFT"+(10>>3));
 System.out.println("RELATIONAL :"+(a<b));
 System.out.println("ASSIGNMENT :"+a);
 System.out.println("LOGICAL :"+(a<b&&b<aa));
 System.out.println("BITWISE :"+(a>b&b<aa));
 System.out.println("PRE FIX :"+(++a));
 System.out.println("POST FIX :"+(a++));
 System.out.println("TERNARY :"+ab);
 System.out.println("ARITHMATIC :"+d);
}
}

//without return type and with parameter
class type2 extends type1 //single inheritance 
{
void typee(int s,String cc,long p)
{
	System.out.println("SNO :"+s+",COURSE :"+cc+", PHONE NUMBER :"+p);
}
void math(int aa,int bb)
{
	int res=aa*bb;
	System.out.println("RESULT :"+res);
}

}



//with return type and without parameter
class type3 extends type2 //multi-level inheritance
{
	int add()
{
int q=10;
int w=20;
int e=30;
int resu=q+w+e;
return resu;
}

boolean re()
{
	//if else
int mark=500;
if(mark>=300)
{
 return true;	
}
else
{
return false;	
}
}
String grad()
{
	//else if
int mar=500;
if(mar>300)
{
	if(mar>=100)
	{
	return "you are pass";
}
else
{
	return "you are fail";
}
}
	else
	{
		return "invalid";

}
}

String na()
{
	String fnn="PUSHPA";
	String lnn="RAJ";
	String nna=fnn+lnn;
	
	return nna;
}
}

//polymorphism method override
class hira
{
	void as1(int ad1,String ad3,long ad4)
	{
		System.out.println("Name :"+ad3+", Ph_number :"+ad4);		
	}
}
class hir extends hira
{	
	void as1(int ad1,String ad3,long ad4)
	{
		if(ad1<100)
		{
			System.out.println("fail :");
			System.out.println("Mark :"+ad1+"Name :"+ad3+", Ph_number :"+ad4);	
		}
		else if(ad1<250)
		{
			System.out.println("Grade :B");
			System.out.println("Mark :"+ad1+"Name :"+ad3+", Ph_number :"+ad4);
		}
		else if(ad1<500)
		{
			System.out.println("Grde :A");
			System.out.println("Mark :"+ad1+"Name :"+ad3+", Ph_number :"+ad4);
		}
		else
		{
			System.out.println("Invalid :");
		}
	}
}

//with return type and without parameter

class type4 extends hira //hirerachical inheritance
{
	int ss(int z,int x)
	{
	
	int v=z*x;
	
	return v;
}
	String nm(String fn,String ln)
	{
	String nnam=fn+ln;
	return nnam;
}

}
class arr
{
	//single dimensional array
	void aa21()
	{
		String[] aa22= {"raj","sri","yuva","sara"};
		
		for (int i=0;i<4;i++)
			System.out.println(aa22[i]);
	}
//multi demenaional array
 aa22()
	{
		int[][] a23= {{1,2,3,4},{101,102,103,104}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
		{
			System.out.println("Sno and Roll number :"+a23[i][j]);
		}
	}
		
	}
}

//polymorphism method overloading
class overload 
{
	void ao1(int ww,int rr)
	{
		int ss=ww+rr;
		System.out.println("Additional :"+ss);
	}
	void ao2(String qq,String dd)
	{
		String d=qq+dd;
		System.out.println("Name :"+d);
	}
	void ao3(float per,long ph)
	{
		System.out.println("Percentage :"+per+"Ph_number :"+ph);
	}
}

public class all{
	
	//constructor
	
	all(String name,char ds,long ph)
	{
		System.out.println("NAME :"+name+", GRADE :"+ds+", PHONE NUMBER :"+ph);	
	}
	all(String fn,String ln)
	{
		System.out.println("NAME :"+fn+ln);
	}
	all(int q,int q1)
	{
		int ress=q*q1;
		System.out.println("AREA :"+ress);
	}
	
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("METHOD TYPE 1 AND OPERATOR");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		type1 t=new type1();
		t.type();
		System.out.println("---------------------------");
		
		System.out.println("METHOD TYPE 2:");
		type2 s=new type2();
		s.typee(2, "java", 8674908849l);
		s.math(30, 40);
		System.out.println("---------------------------------");
		
		System.out.println("METHOD TYPE 3 AND LOOPING STATEMENT");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		type3 d=new type3();
		System.out.println("ADDITIONAL VALUE :"+d.add());
		System.out.println("GRADE :"+d.grad());
		System.out.println("NAME :"+d.na());
		System.out.println("RESULT :"+d.re());
		System.out.println("-----------------------------------");
		
		System.out.println("METHOD TYPE 4:");
		type4 c=new type4();
		System.out.println(c.nm("NAME :"+"sri", "dhar"));
		System.out.println("MULTIPLICATION:"+c.ss(54, 44));
		System.out.println("------------------------------------");
		
		//polymorphism
		hir gg=new hir();
		System.out.println("Polymorphism method override:");
		System.out.println("~~~~~~~~~~~~~~");
		gg.as1(400, "Raj", 38974754844l);
		System.out.println("--------------------------------");
		overload d1=new overload();
		System.out.println("Polymorphism Method overloading :");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		d1.ao1(22, 33);
		d1.ao2("Raj", "S");
		d1.ao3(98.9f, 743387438348l);
		System.out.println("---------------------------------");
		
		
		//interface and abstract
		System.out.println("Interface and abstract");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		adf dds1=new adf();
		dds1.aas1(632113, "Vellore");
		dds1.aas2(98.9f, 7584984874l);
		dds1.aas3(true);
		System.out.println("----------------------------------");
		
		
		
		
		
		
		System.out.println("CONDITIONAL STATEMENT:");
		for(int i=1;i<5;i++)
		{
			System.out.println("FOR :"+i);
		}
		
		int ab=20;
		while(ab<=23)
		{
			System.out.println("WHILE :"+ab);
			ab++;
		}
		
		int aa=30;
		do
		{
			System.out.println("DO WHILE :"+aa);
			aa++;
		}
	while(aa<34);
		System.out.println("--------------------------------------");
				
		System.out.println("CONSTRACTOR :");
		System.out.println("~~~~~~~~~~~~~~");
		
		all s1=new all("Raj",'a',8977465774l);
		
		System.out.println("ANOTHER METHOD :");
		System.out.println("~~~~~~~~~~~~~~~");
		
		all s2=new all("PUSHPA","RAJ");
		all s3=new all(76,65);
		
		System.out.println("--------------------------------------");
		
		//Static variable and static method		
		System.out.println("AUTO INCREMENT AND MANUAL VALUES");
		System.out.println("---------------------------------");
		
		anothe tt=new anothe();		
		tt.ssta("raj",'a');
		tt.ssta();
		tt.ssta("yuva",'b');
		tt.ssta();
		tt.ssta("sri",'c');
		tt.ssta();
		tt.ssta("mohan",'d');
		tt.ssta();
		
		System.out.println("---------------------------------");
		
		//Scanner it's get value for user
		
		Scanner ss1=new Scanner(System.in);
		System.out.println("Enter your sno :");
		int a1=ss1.nextInt();
		System.out.println("Enter your name :");
		String a2=ss1.next();
		System.out.println("Enter your grade :");
		char a3=ss1.next().charAt(0);
		System.out.println("Enter your phone number :");
		long a4=ss1.nextLong();
		System.out.println("Enter your percentage :");
		float a5=ss1.nextFloat();
		
		System.out.println("Roll_No :"+a1+", Name :"+a2+", Grade :"+a3+
				", Ph_Number :"+a4+", Percentage :"+a5);
		
		System.out.println("-------------------------------");
		
		//array single dimentional method and then it's type
		
		//datatype[] variablename=new datatype[size];
		System.out.println("ARRAY :");
		System.out.println("~~~~~~");
		//single dimensional array
		arr aa23=new arr();
		aa23.aa21();
		//multi dimensional array
		aa23.aa22();
		
		
		
	
		
		
			
	
		}

}


interface abc
{
	void aas2(float per,long ph);
	boolean aas3(boolean ms);
}

abstract class ab implements abc
{
	abstract void aas1(int a,String nn);	
}

class adf extends ab
{

	@Override
	public void aas2(float per, long ph) {
		// TODO Auto-generated method stub
		
		System.out.println("Percentage :"+per);
		System.out.println("Phone number :"+ph);
		
	}

	@Override
	public boolean aas3(boolean ms) {
		// TODO Auto-generated method stub
		return ms;
	}

	@Override
	void aas1(int a, String nn) {
		// TODO Auto-generated method stub
		
		System.out.println("Pincode :"+a+", City :"+nn);
		
	}
	
}


class anothe {
	
	//Static method and static variable
	//this type will be excecute any method 
	static int a=0;
	static String c="zoho";
	static String p="chennai";
	//manual values
	String nnc;
	char nnb;

	void ssta(String nn,char g)
	{
		
		a++;

		nnc=nn;
		nnb=g;
		
		
	}
	void ssta()
	{
		System.out.println("SNO :"+a+", COMPANY NAME :"+c+", PLACE :"+p+", NAME:"+nnc+", GRADE :"+nnb);
	}
}

