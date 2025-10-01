import javax.faces.bean.ManagedBean;

@ManagedBean
public class My_Date {
	
	int newDay;
	int newMonth;
	int newYear;
	
	//Constructors
	My_Date(){}
	
	//Overload Constructor
	public My_Date(int day1, int month1, int year1){
		newDay = day1;
		newMonth = month1;
		newYear = year1;
		System.out.println(newMonth+"/" +newDay+"/" + +newYear);
	}
	
	//Functions - setters
	public void setNewDay(){}
	public void setNewMonth(){}
	public void setNewYear() {}
	
	//Functions - getters
	public void getNewDay() {}
	public void getNewMonth() {}
	public void getNewYear() {}

}
