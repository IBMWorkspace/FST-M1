package Activites;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title; 
	}
	
}

class Newbook extends Book{
	public void setTitle(String s)
	{
		title=s;
	}
}
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create an abstract class Book that has:
//			title of type String
//			an abstract method setTitle() that takes one String argument.
//			a concrete method getTitle() that returns the value of title.
//			Create another class that extends the abstract class called MyBook.
//			MyBook defines the setTitle() method to assign the value of title as the argument.
		
		Newbook b1=new Newbook();
		b1.setTitle("It ends with us");
		System.out.println("The name of book title is: "+b1.getTitle());
	}

}
