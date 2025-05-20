
public class AdoptionMain {

	public AdoptionMain() {
		
	}

	public static void main(String[] args) {
	//this creates the objects with different attributes	
		Dog hippie = new Dog(13, "Hippie", false);
		PuppyDog yippee = new PuppyDog(6, "Yippee", false, true);
		
		System.out.println(hippie.getAdoptionStatus());
		System.out.println(yippee.getAdoptionStatus());
		
		hippie.stateAge();
		yippee.stateAge();
		
		hippie.getAdoptionStatus();
		yippee.getAdoptionStatus();
		
		System.out.println(hippie);
		System.out.println(yippee);
		
	//making a dog and a puppy dog with the same name
		Dog max = new Dog(3, "Max", true);
		PuppyDog max2 = new PuppyDog(36, "Max", true, false);

	//this compares the two objects	
		System.out.println(max.equals(max2));

		

	}

}



public class Dog {
	//protected means that it stays within this project and wont leak outside of here
	protected String name;
	protected int age;
	protected boolean isAdopted;
	
	
public Dog (int a, String n, boolean ad)
{
	age = a;
	name = n;
	isAdopted = ad;
	
	//this.name = name;
	//use 'this' dogs name  to change it to the name in the attribute
	//short for "this ___'s attribute

}

public Dog(int a, String n, boolean ad) {
	// TODO Auto-generated constructor stub
}

public boolean getAdoptionStatus()
{
	return isAdopted;
}

public void stateAge()
{
	System.out.println(name +"is" + age + "years old.");
}


public String toString()
{
	stateAge();
	
	if(isAdopted)
	{
		return "I have been chosen!";
	}
	return "I haven't found a home";
}

public boolean equals(Dog doggy)
{
	if(this age == doggy.age && this.name.equals(doggy.name) && this.isAdopted == doggy.isAdopted)
	{
		return true;
	}
	return false;
}



}



public class PuppyDog extends Dog {
	boolean isFed;
	
	public PuppyDog (int a, String n, boolean ad, boolean f)
	//we use a super class and put the attributes inside
	//and we create a new variable that only relates to PuppyDog
	{
		super (a, n, ad);
		isFed=f;
	
	}
	
	public void stateAge()
	/**
	 * this method states the age
	 */
	{
		System.out.println(name +"is" + age + "months old.");
	}
	
	public void increaseAge()
	{
		super.increaseAge();
		isFed=false;	
		
	}
	
	public String toString()
	{
		if(isFed)
		{
			return super.toString() + "I'm fed!";
		}
		return super.toString() + "I must be fed.";

	}
	
	public boolean equals (PuppyDog lilDoggy)
	{
		if(super.equals(lilDoggy) && this.isFed == lilDoggy.isFed)
		{
			return true;
		}
		return false;
	}
	
}
