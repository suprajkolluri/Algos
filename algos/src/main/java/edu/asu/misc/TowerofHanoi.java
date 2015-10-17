package edu.asu.misc;

public class TowerofHanoi {

	public void move(int n, int from, int intermediate, int to){
		if(n>0){
			move(n-1, from, to, intermediate);
			System.out.println("Move disk from " + from + " to " + to);
			move(n-1, intermediate, from, to);
		}
	}
}
