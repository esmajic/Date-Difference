import java.util.ArrayList;

public class Datum {

	private String date1;
	private String date2;
	
	public Datum(String date1, String date2) {
		this.date1 = date1;
		this.date2 = date2;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	@Override
	public String toString() {
		return "Date [date1=" + date1 + ", date2=" + date2 + "]";
	}
	
	public void printList(ArrayList<Datum> date) {
		System.out.println("List of dates:  ");
		for(int i = 0; i < date.size(); i++) {
			System.out.println(date.get(i) + " ");
		}
	}
	
	
}
