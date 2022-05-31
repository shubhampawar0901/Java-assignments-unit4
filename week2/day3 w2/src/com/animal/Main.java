package com.animal;

public class Main {
	
		public static void main(String[] args){
		//create an array of Animal class with size 3
			Animal[] a1 = new Animal[3];
		//initialize all 3 elements of this Animal classwith 
		//Dog, Cat and Tiger class object.
			a1[0] =  new Dog();
			a1[1] =  new Cat();
			a1[2] =  new Tiger();
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
			for(Animal animal:a1) {
				animal.makeNoise();
				animal.eat();
				animal.walk();
			}
		}
}

