package classroomprogram;

class Static_variabes {
	

		static int a=10;
		int b=20;
		public void display() {
			int c=30;
			System.out.println("Class Variable:"+a);
			System.out.println("Instance variable:"+b);
			System.out.println("Local variable:"+c);

			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Class Variable:"+a);
			//System.out.println("Instance variable:"+b);
			//System.out.println("Local variable:"+c);
			Static_variabes obj1=new Static_variabes();
			obj1.display();
		}

}
