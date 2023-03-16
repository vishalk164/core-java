package studentMgtSystem;

public class College {
	
	
		public Student[] addStudentDetails()
		{
			Student s = new Student();
			s.id = 01 ;
			s.name = " Vishal";
			s.address = " Nagar";
			
			Student s1 = new Student();
			s1.id = 02;
			s1.name = " Sumit";
			s1.address = " Newasa";
			
			Student s3 = new Student();
			s3.id = 03;
			s3.name = " Sumit12";
			s3.address = " Newasa12";
			
			Student[] arraystudent = {s,s1,s3};
			return arraystudent;
			
		}
		
		public ALLStudent addALLStudentDetails()
		{
			ALLStudent all = new ALLStudent();//object creations 
			
			all.s.id = 21;
			all.s.name="neha";
			all.s.address = "pune";
			
			all.s1.id = 33;
			all.s1.name = "Amar";
			all.s1.address ="pcmc";
			
			all.s2.id = 24;
			all.s2.name = "komal";
			all.s2.address = "Nigdi";
			
			return all;
			
			
		}


}
