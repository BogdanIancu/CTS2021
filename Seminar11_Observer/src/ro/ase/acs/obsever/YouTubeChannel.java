package ro.ase.acs.obsever;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel extends Observable {
	private String channelName;
	private List<String> videos = new ArrayList<>();
	
	public YouTubeChannel(String channelName) {
		this.channelName = channelName;
	}
	
	public String getChannelName() {
		return channelName;
	}
	
	public void addVideo(String name) {
		videos.add(name);
		notifyObservers(name);
	}
}
