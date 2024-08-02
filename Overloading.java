package classroomprogram;

public class Overloading {
	public static void add(int a, int b) {
		System.out.println(a+b);//method overriding using different data types
	}
	public static void add(String a,String b) {
		System.out.print(a+b);
	}
    public static void main(String args[] ){
     add(10,20);
     add("shashank"," hegde");
    }
}
