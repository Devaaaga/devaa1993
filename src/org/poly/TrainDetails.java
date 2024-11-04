package org.poly;
//method overloading/static binding
//compile time polymorphism
public class TrainDetails {
	public void trainDetails() {
		System.out.println("train details:");
	}
	public void trainDetails(int trainspeed) {
		System.out.println("trainspeed:"+trainspeed);
	}
	public void trainDetails(int trainnumber,String name) {
		System.out.println("trainnumber:"+trainnumber);
		System.out.println("trainname:"+name);
	}
	public void trainDetails(String cityname,int ticketprice) {
		System.out.println("train cityname:"+cityname);
		System.out.println("train ticketprice"+ticketprice);
	}
	public static void main(String[] args) {
		TrainDetails t = new TrainDetails();
		t.trainDetails();
		t.trainDetails(600);
		t.trainDetails(12606,"pallavan");
		t.trainDetails("Trichy", 173);
	}
		
		
	}


	


