import java.util.Arrays;

public class ReversibleArray <T>{

	T[] array;
	int count;
	public ReversibleArray(T[]a) {
		array=a;
		count=array.length;
	}
	@Override
	public String toString() {
		return  Arrays.toString(array) ;
	}
	public void reverse () {
		int i=0;
		T temp;
		while(i<array.length/2) {
			temp=array[array.length-i-1];
			array[array.length-i-1]=array[i];
			array[i]=temp;
			i++;
		}
	}

}
