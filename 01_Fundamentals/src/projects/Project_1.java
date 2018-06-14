package projects;

class Employee{
	int empNo;
	String empName;
	String joinDate;
	char designationCode;
	String designation;
	String department;
	int basic;
	int hra;
	int it;
	int da;
	int salary;
	void setValue(int eNo, String eName, String jDate, char dCode, String dept, int b, int h, int i) {
		empNo = eNo;
		empName = eName;
		joinDate = jDate;
		designationCode = dCode;
		department = dept;
		basic = b;
		hra = h;
		it = i;
		switch(dCode) {
		case 'e' : designation = "Engineer";
					da = 20000;
					break;
		case 'c' : designation = "Consultant";
					da = 32000;
					break;
		case 'k' : designation = "Clerk";
					da = 12000;
					break;
		case 'r' : designation = "Receptionist";
					da = 15000;
					break;
		case 'm' : designation = "Manager";
					da = 40000;
					break;
		}
		salary = basic + hra + da - it;
	}
}
public class Project_1 {

	public static void main(String[] args) {
		int flag =0;
		int findEmp = 0;
		Employee employee[] = new Employee[7];
		for(int i = 0; i<7; i++) {
			employee[i] = new Employee();
		}
		
		employee[0].setValue(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
		employee[1].setValue(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
		employee[2].setValue(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
		employee[3].setValue(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000,2000);
		employee[4].setValue(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
		employee[5].setValue(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400);
		employee[6].setValue(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);
		if(args.length>0) {
		int empNoTemp = Integer.parseInt(args[0]);
		for(int i=0; i<7; i++) {
			if(empNoTemp == employee[i].empNo) {
				findEmp = i;
				flag++;
			}
		}
		}
		if(flag==0) {
			System.out.println("Enter a valid Employee No.");
		}
		else {
		System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
		System.out.println(employee[findEmp].empNo+"\t"+employee[findEmp].empName+"\t\t"+employee[findEmp].department+"\t\t"+employee[findEmp].designation+"\t"+employee[findEmp].salary);
	
		}
	}
	
}
