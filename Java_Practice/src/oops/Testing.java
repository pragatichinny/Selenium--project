package oops;
class SoftwareTesting{
	void Syllabus() {
		System.out.println("software testing course details");
		System.out.println("Manual testing,core java,selenium webdriver,jira,mysql");
		System.out.println(50000);
	}
}

class Manual extends SoftwareTesting{
	void manual_testing() {
		super.Syllabus();
			System.out.println("If it is a manual testing only \nthen it includes manual testing concepts,jira,mysql,postman");

	}
}

class Automation extends SoftwareTesting{
	void automation_testing() {
		System.out.println("If it is a Automation testing it includes Automation testing concepts like Core java,selenium web driver");
	}
}
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****Manual Testing***");
		Manual mn=new Manual();
		mn.manual_testing();
		
		System.out.println("****Automation Testing***");
		Automation an=new Automation();
		an.automation_testing();


	}

}
