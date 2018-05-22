package javaLearningPackage;

public class EnumExplore {
	//months obj;
	months obj = EnumExplore.months.jan;

	enum months{jan,feb,march}



	public static void main(String[] args){
		EnumExplore enumExploreObj= new EnumExplore();
		
		//enumExploreObj.obj= EnumExplore.months.jan;
		System.out.println(enumExploreObj.obj);
	}
}
