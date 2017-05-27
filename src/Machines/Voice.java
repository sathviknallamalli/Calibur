package Machines;
import com.sun.speech.freetts.VoiceManager;

public class Voice {
private String name;
private com.sun.speech.freetts.Voice voice;
public Voice(String name) {
	this.name = name;
	this.voice = VoiceManager.getInstance().getVoice(name);
	this.voice.allocate();
	voice.setPitch(100);
	voice.setRate(200);
}
public void say(String saySomething) {
	this.voice.speak(saySomething);
}
}
