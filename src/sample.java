
public class sample {

	public static void main(String[] args) {
		String original = "C:\\Users\\sathv\\Desktop\\WAV Audios\\AlarmNoise.wav";
		int val = original.indexOf('.');
		System.out.println(original.substring(34, val));
	}

}
