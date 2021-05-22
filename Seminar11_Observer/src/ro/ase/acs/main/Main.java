package ro.ase.acs.main;

import ro.ase.acs.obsever.ChannelSubscriber;
import ro.ase.acs.obsever.YouTubeChannel;

public class Main {

	public static void main(String[] args) {
		YouTubeChannel ytChannel = new YouTubeChannel("CaseyNeistat");
		ChannelSubscriber subscriber1 = new ChannelSubscriber();
		ChannelSubscriber subscriber2 = new ChannelSubscriber();
		
		ytChannel.subscribe(subscriber1);
		ytChannel.subscribe(subscriber2);
		
		ytChannel.addVideo("The Story of My Life");
	}

}
