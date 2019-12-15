import java.util.logging.Level;

public class UnuseThing extends Thing implements UnUsable {
	public UnuseThing(String name) {
		super(name);
	}

	@Override
	public void action(String str1, String str2) {
		MyLogger.log.log(Level.INFO, str1 + name + str2);
	}
}