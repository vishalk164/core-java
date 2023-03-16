package getterSetter;

public class Student {
	private int id;
	private String name;
	private String address;
	private long mbNo;
	private double fees;

 public void setId(int studentid)
 {
	 id = studentid;
 } 
 public void setName(String studentname)
 {
	 name = studentname;
 }
 public void setAddress(String studentaddress)
 {
	 address = studentaddress;
	
 }
 public void setMbNo(long studentmbNo)
 {
	 mbNo = studentmbNo;
 }
 public void setFees(double studentfees)
 {
	 fees = studentfees;
 }
 
 
 public int getId()
 {
	 return id;
 }
 public String getName()
 {
	 return name;
 }
 public String getAdress()
 {
	 return address;
 }  
 public long getMbNo()
 {
   return mbNo;
 }
 public double getFess()
 {
	 return fees;
 }
}
