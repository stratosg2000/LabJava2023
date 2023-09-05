package a;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee empl1 = new Employee();
Employee empl2 = new Employee();
Employee empl3 = new Employee();
Employee empl4 = new Employee();
Employee empl5 = new Employee(104, "Tasos", 15000);

	empl1.id= 100;
	empl1.name="lex";
	empl1.salary=12000;
	empl1.display();
	
	empl2.id= 101;
	empl2.name="steven";
	empl2.salary=13000;			
	empl2.display();
	
	empl3.setValue(102, "Stratos", 3000);
	empl4.setValue(103,"Nick", 5000);
	
	empl3.display();
	empl4.display();
	empl5.display();
	}

}

