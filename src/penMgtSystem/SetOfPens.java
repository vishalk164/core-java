package penMgtSystem;

public class SetOfPens {
	public static void main(String[] args) {
		AllPenDetails  allPenDetails = new AllPenDetails();
		PenBox penBox = allPenDetails.allpenDetails();
		
		System.out.println("---------------------First Pouch----------------------------");
		System.out.println("First Pen in Box 1 of Pouch 1  has" + " " + penBox.pouch.p1.noOfRefiles + "  " + "and Color of pen  is " + penBox.pouch.p1.color );
		System.out.println("Secound Pen in Box 1 of Pouch 1  has" + " " + penBox.pouch.p2.noOfRefiles + "  " + "and Color of pen  is " + penBox.pouch.p2.color );
		System.out.println("Third Pen in Box 1 of Pouch 1  has" + " " + penBox.pouch.p3.noOfRefiles + "  " + "and Color of pen  is " + penBox.pouch.p3.color );
		
		System.out.println("---------------------Secound Pouch----------------------------");
		System.out.println("First Pen in Box 1 of Pouch 2  has" + " " + penBox.pouch2.p1.noOfRefiles + "  " + "and Color of pen  is " + penBox.pouch2.p1.color );
		System.out.println("Secound Pen in Box 1 of Pouch 2  has" + " " + penBox.pouch2.p2.noOfRefiles + "  " + "and Color of pen  is " + penBox.pouch2.p2.color );
		System.out.println("Third Pen in Box 1 of Pouch 2 has" + " " + penBox.pouch2.p3.noOfRefiles + "  " + "and Color of pen  is " + penBox.pouch2.p3.color );
		
		


		
	}

}
