package javaLearningPackage;

	public class Constructors {
    	String Game;
    	int level;
			Constructors(){
			this.Game= "Bdminton";
			this.level= 2;
			System.out.println("Default Constructor");
			}
	
	public String getGame(){
		return Game;
	}
	
	public int getlevel(){
		return level;
	}


	public static void main(String[] args) {
		Constructors obj1 = new Constructors();
		//System.out.println(obj1.getGame());
	}

}
