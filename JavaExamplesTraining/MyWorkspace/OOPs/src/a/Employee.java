package a;

public class Employee {
	int id;
	String name;
	float salary;
	
	Employee(){
		System.out.println("Object has been created ....");
		id=123;
		name="unknown";
		salary=5000;
		};
	
		Employee(int id1, String name1, float salary1){
			System.out.println("Object has been created ....");
			id=id1;
			name=name1;
			salary=salary1;
			};
			
		
		
		void setValue(int id1, String name1, float salary1) {  //local variable
			
			id=id1;
			name=name1;
			salary=salary1;
			
		};
		
		void display() {			// behaviour or function 
				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("salary is "+salary);
		}
	}


