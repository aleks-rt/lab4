import java.util.logging.Level;

public class People implements Usable {
    private static String partsBody = "Ноги, руки, тело, голова."; 

    public static class AboutPeople {
        public static void printInfo() {
            MyLogger.log.log(Level.INFO, partsBody);
        }
    }

    public class Organ {
        private String name;

        public String getName() {
            return name;
        }

        public Organ(String name) {
            this.name = name;
        }

        public void process(String str1, String str2, String str3) throws OrganException{
            if(this.getName() == ""){
                throw new OrganException("Ты хочешь сделать что-то с органом, которого нет");
            }
            MyLogger.log.log(Level.INFO, str1 + People.this.getName() + str2 + this.getName() + str3);
        }
    }

    private String name;

    public People(String name) {
        this.name = name;
    }

    public void work(String str1, String str2) throws UncheckedWorkException {
        if (str1.length() == 0 && str2.length() == 0)
            throw new UncheckedWorkException("Коротышка должна что-то делать!");
        MyLogger.log.log(Level.INFO, str1 + getName() + str2);
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

        People person = (People) obj;
        return name != null && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        final int PRIME = 17;
        int hash = 37;
        hash = hash * PRIME + ((name == null) ? 0 : name.hashCode());
        ;
        return hash;
    }
}


