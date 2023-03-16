package studentMgtSystem;

public class University {
      public static void main(String[] args) {
		College college = new College();
		Student[] students = college.addStudentDetails();
		
		for(int i = 0; i<students.length;i++) {
//			System.out.println(students[i].getId()+students[i].getName()+students[i].getAddress());
			Student s = students[i];
			System.out.println(s.getId()+" "+s.id+s.getName()+s.name+s.address+s.address+"  \n");
		}
		
		
		for(Student s : students) {
			System.out.println("Id      :  "+s.id+"\nName    : "+s.name+"\nAddress : "+s.address+"\n");
		}
		
		
		
		
//		System.out.println(student.id+""+student.name+""+student.address);
//		
//		System.out.println("---------All Student details------------");
//		
//		ALLStudent all = college.addALLStudentDetails();
//		System.out.println(all.s.id+""+all.s.name+all.s.address);
//		System.out.println(all.s1.id+""+all.s1.name+all.s1.address);
//		System.out.println(all.s2.id+""+all.s2.name+all.s2.address);
	}

}
