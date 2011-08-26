package aurelienribon.tweenengine;

public interface Groupable {
	public int getDuration();
	public int getDelay();
	public Groupable delay(int millis);
	public Groupable addToManager(TweenManager manager);
}
