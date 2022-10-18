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
		final int salaryLimit = 1000;
		final double taxe = 0.03;
		if (this.salary > salaryLimit)
		{
			return this.salary*taxe;		
		}
		return 0.0;
	}
			
	private double bonus() {
		double bonus = 0;
		final int weeklyWorkingHours = 40;
		final int extraMoney = 30;
		final int monthly = 4;
		if (this.workHours > weeklyWorkingHours)
		{
			bonus = ((this.workHours-weeklyWorkingHours)*extraMoney)*monthly;
		}
		return bonus;
	}
	
	private double raiseSalary() {
		int thisYear = 2021;
		double raiseSalary = 0;
		final double raiseAmount1 = 0.05;
		final double raiseAmount2 = 0.10; 
		final double raiseAmount3 = 0.15; 
		if (thisYear - this.hireYear < 10 )
		{
			raiseSalary = bonus() + this.salary*raiseAmount1 - tax();			
		}	
		else if (thisYear - this.hireYear > 9 && thisYear - this.hireYear < 20)
		{
			raiseSalary = bonus() + this.salary*raiseAmount2 - tax();
		}
		else if (thisYear - this.hireYear > 19)
		{
			raiseSalary = bonus() + this.salary*raiseAmount3 - tax();
		}	
		return raiseSalary;		
	}
	
	private double totalSalary() {
		double totalSalary = 0;
		totalSalary = this.salary + bonus();        
		return totalSalary;                         
	}
	
	
	private double netProfit() {
		double netProfit = 0;
		netProfit = this.salary + bonus() - tax();   
		return netProfit;
	}
	
	private double total_Salary() {
		double total_Salary = 0;
		total_Salary = this.salary + raiseSalary();  
		return total_Salary;
	}
	
	public String toString() {
		return this.name + "'s " + "Salary: " + this.salary + " Work Hours:" + this.workHours + " Hire Year:" + this.hireYear + " Tax:" + tax() + " Bonus:" + bonus() + " Raise Salary: " + raiseSalary() +
		" Total Salary: " + totalSalary() + " Salary with tax and bonus: " + netProfit() + " Total Salary with rise, bonus and tax: " + total_Salary();	
	}
		
}