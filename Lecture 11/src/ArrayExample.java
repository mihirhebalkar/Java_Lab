
public class ArrayExample {
	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = {1,2,3,4,5};
		
		String[] words = {"Hello","World"};
		
		for (int i=0; i<array3.length;i++) {
			System.out.println(array3[i]);
			
			array2[i] = array3[i];
		}
		
		
		System.out.println("\nUsing forEach loop");
		for(String a : words) { //forEach method
			System.out.println(a);
		}
		
		System.out.println("\nReverse : ");
//		for (int j=0; j<array3.length ; j++) {
//			System.out.println(array3[array3.length -j-1]);
//		}
		
		for (int j=array3.length-1; j>=0 ; j--) {
			System.out.println(array3[j]);
		}
		
		System.out.println("\nAlternate elements : ");
		for (int k=0;k<array3.length;k=k+2) {
			System.out.println(array3[k]);
		}
		
		System.out.println("\nEven numbers : ");
		for (int i= 0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		int largest= 0;
		for(int i =0;i < array3.length;i++) {
			largest = array3[i];
			
			if(array3[i]>largest) {
				int temp = array3[i];
				array3[i] = largest;
				largest = temp;
			}
		}
		System.out.println("\nLargest is : " + largest);
	}
}
