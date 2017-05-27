package BasicsChemistry;

import sun.audio.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

import com.sun.speech.freetts.audio.AudioPlayer;

public class Audio {
	public static void main(String[] args) {
		File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MachinesL1SM.wav");
		PlaySound(Clap);
	}

	static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	static void EndSound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.stop();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}