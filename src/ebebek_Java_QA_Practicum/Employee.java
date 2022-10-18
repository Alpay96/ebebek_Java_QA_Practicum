package ebebek_Java_QA_Practicum;

public class Employee {
	private String name;
	private double salary ;
	private int workHours ;
	private int hireYear ;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
		
	public double tax() {
		if (this.salary > 1000)
		{
			return this.salary*0.03;		
		}
		return 0.0;
	}
			
	public double bonus() {
		double bonus = 0;
		if (this.workHours > 40)
		{
			bonus = ((this.workHours-40)*30)*4;
		}
		return bonus;
	}
	
	public double raiseSalary() {
		int thisYear = 2021;
		double raiseSalary = 0;
		if (thisYear - this.hireYear < 10 )
		{
			raiseSalary = bonus() + this.salary*0.05 - tax();			
		}	
		else if (thisYear - this.hireYear > 9 && thisYear - this.hireYear < 20)
		{
			raiseSalary = bonus() + this.salary*0.10 - tax();
		}
		else if (thisYear - this.hireYear > 19)
		{
			raiseSalary = bonus() + this.salary*0.15 - tax();
		}	
		return raiseSalary;		
	}
	
	public double totalSalary() {
		double totalSalary = 0;
		totalSalary = this.salary + bonus();         //  Expect rise.
		return totalSalary;                         
	}
	
	
	public double netProfit() {
		double netProfit = 0;
		netProfit = this.salary + bonus() - tax();   //  Expect rise.
		return netProfit;
	}
	
	public double totalSalaryy() {
		double totalSalaryy = 0;
		totalSalaryy = this.salary + raiseSalary();  // with rise.
		return totalSalaryy;
	}
	
	public String toString() {
		return this.name + "'s " + "Salary: " + this.salary + " Work Hours:" + this.workHours + " Hire Year:" + this.hireYear + " Tax:" + tax() + " Bonus:" + bonus() + " Raise Salary: " + raiseSalary() +
		" Total Salary: " + totalSalary() + " Salary with tax and bonus: " + netProfit() + " Total Salary with rise, bonus and tax: " + totalSalaryy();	
	}
		
}