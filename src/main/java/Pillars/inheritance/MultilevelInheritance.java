package Pillars.inheritance;

class Animal1{  
void eat(){System.out.println("eating...");}  
}  
class Dog1 extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd=new BabyDog();  
		bd.bark();  
		bd.eat();
		bd.weep();
	}

}
