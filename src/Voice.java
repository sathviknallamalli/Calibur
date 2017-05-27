
import com.sun.speech.freetts.VoiceManager;

public class Voice {
	private String name;
	private com.sun.speech.freetts.Voice voice;

	public Voice(String name) {
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(name);
		this.voice.allocate();
	}

	public void say(String saySomething) {
		this.voice.speak(saySomething);
		this.voice.setPitch(2500);
		this.voice.setRate(5);
	}
}
