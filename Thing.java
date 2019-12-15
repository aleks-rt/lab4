public abstract class Thing {
	public String name;

	public Thing(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
            return false;
		}

		Thing thing = (Thing) obj;
		return name != null && name.equals(thing.name);
    }

    @Override
    public int hashCode() {
    	final int PRIME = 17;
    	int hash = 37;
    	hash = hash * PRIME + ((name == null) ? 0 : name.hashCode());
    	return hash;
    }
}