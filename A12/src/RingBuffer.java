import java.util.Arrays;

public class RingBuffer {
	private double [] items;
	private int start;
	private int end;
	private int count;
	 
	public RingBuffer(int capacity) {
		items = new double[capacity];
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if(count == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		return count == items.length;
	}
	
	public void enqueue(double x) throws Exception{
		if(!isFull()){
			items[end] = x;
			end = (end + 1) % this.items.length;
			count++;
		} else {
			throw new Exception("buffer is full.");
		}
	}
	
	public double dequeue() throws Exception {
		if(isEmpty()){
			throw new Exception("buffer is empty.");
		}
		double item = items[start];
		start = (start + 1) % items.length;
		count--;
		return item;
	}
	
	public double peek() throws Exception{
		if(isEmpty()){
			throw new Exception("Buffer is empty.");
		}
		return items[start];
	}
	
	public String toString() {
		double[] counts = new double [count];
		for (int i = 0; i < count; i++) {
			counts[i] = items[i];
		}
		String result = Arrays.toString(counts);
		return result;
	}
}
