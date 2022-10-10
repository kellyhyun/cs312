import java.util.*;

public class GuitarString {
	private Queue <Double> ringBuffer;
	private int capacity;
	private int ticNum;
	private static final double FACTOR = 0.996;
	
	public GuitarString(double frequency) {
		capacity = (int) Math.round(StdAudio.SAMPLE_RATE / frequency);
		if (frequency <= 0 || capacity < 2){
			throw new IllegalArgumentException();
		}
		ringBuffer = new LinkedList <>();
		for(int i = 0; i < capacity; i++){
			ringBuffer.add(0.0);
		}
	}
	
	public GuitarString(double[] init) {
		if (init.length < 2){
			throw new IllegalArgumentException();
		}
		ringBuffer = new LinkedList <>();
		for (int i = 0; i < init.length; i++){
			ringBuffer.add(init[i]);
		}
	}
	
	public void pluck() {
		for (int i = 0; i < capacity; i++){
			ringBuffer.remove();
			ringBuffer.add(Math.random() - 0.5);
		}
	}
	
	public void tic() {
		double first = ringBuffer.remove();
		double second = ringBuffer.peek();
		ringBuffer.add(FACTOR * 0.5 * (first + second));
		ticNum++;
	}
	
	public double sample() {
		return ringBuffer.peek();
	}
	
	public int time() {
		return ticNum;
	}

}
