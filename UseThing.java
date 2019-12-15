import java.util.logging.Level;

public class UseThing extends Thing implements Usable {
	public UseThing(String name) {
		super(name);
	}

	@Override
	public String getName() {
	    return name;
	}

	@Override
	public void action(String str1, String str2, String str3, Usable object, TypeAction type) {
		if (type == TypeAction.ACTIVE_PASSIVE) {
			MyLogger.log.log(Level.INFO, str1 + object.getName() + str2 + name + str3);
		}
		if (type == TypeAction.PASSIVE_ACTIVE) {
			MyLogger.log.log(Level.INFO, str1 + name + str2 + object.getName() + str3);
		}
	}
}