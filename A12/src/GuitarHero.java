
public class GuitarHero {
	
	public static void main(String[] args) {
		double freq = 440.0;
		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
		GuitarString[] strings = new GuitarString[37];
		for(int i = 0; i < 37; i++){
			double pitch = freq * Math.pow(1.05956, (i - 24));
			strings[i] = new GuitarString(pitch);
		}
		while (true) {
			if (StdDraw.hasNextKeyTyped()) {
				char key = StdDraw.nextKeyTyped();
				String keyString = Character.toString(key);
				int index = (keyboard.indexOf(key));
				if(keyboard.contains(keyString)) {
					strings[index].pluck(); 
				} else if(keyString.equals("`")){
					freq /= 2;
					for(int i = 0; i < 37; i++){
						double pitch = freq * Math.pow(1.05956, (i - 24));
						strings[i] = new GuitarString(pitch);
					} 
				} else if(keyString.equals("1")){
					freq *= 2;
					for(int i = 0; i < 37; i++){
						double pitch = freq * Math.pow(1.05956, (i - 24));
						strings[i] = new GuitarString(pitch);
					} 
				}
			}
			double sample = 0.0;
			for(int i = 0; i < 37; i++){
				sample += strings[i].sample();
			}
			StdAudio.play(sample);
			for(int i = 0; i < 37; i++){
				strings[i].tic();
			}
		}
	}
}
