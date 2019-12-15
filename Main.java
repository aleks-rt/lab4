import java.util.logging.Level;

public class Main {
	public static void main(String[] args) {
		People he = new People("Он");
		People pilyulkin = new People("Доктор Пилюлькин");
		People gunka = new People("Гунька");
		People neznaika = new People("Незнайка");
		People all = new People("Все");
		People noName = new People("");


		UseThing portraits = new UseThing("портреты");
		UseThing portraits2 = new UseThing("портрету");
		UseThing portraits3 = new UseThing("портретe");
		UnuseThing wall = new UnuseThing(" стене");
		UnuseThing writing = new UnuseThing(" надписи");
		UnuseThing exhibition = new UnuseThing(" выставка ");
		UseThing zero = new UseThing("");
		UseThing eyeglasses = new UseThing("пенсне");
		UseThing paint = new UseThing("краски");
		UseThing legs = new UseThing("тоненьких ножках");
		UseThing tail = new UseThing("собачий хвост");
		UseThing bulka = new UseThing("на Бульке");
		UseThing thermometer = new UseThing("градусник");
		UseThing ears = new UseThing("ослиные уши");

		gunka.work("", " обиделся и ушел домой,");
		neznaika.work("a ", " на самом деле не лег вечером спать.");
		all.work("Когда ", " уснули,");
		he.action("", " взял ", " и принялся всех рисовать.", paint, TypeAction.PASSIVE_ACTIVE);
		he.action("Пончика нарисовал таким толстым, что ", " даже не поместился на ", ".", portraits3, TypeAction.PASSIVE_ACTIVE);
		noName.action("Торопыжку ", " нарисовал на ", ",", legs, TypeAction.PASSIVE_ACTIVE);
		noName.action("а сзади пририсовал ему зачем-то ", "", ".", tail, TypeAction.PASSIVE_ACTIVE);
		noName.action("Охотника Пульку ", "изобразил верхом на ", ".", bulka, TypeAction.PASSIVE_ACTIVE);
		noName.action("Доктору Пилюлькину ", "вместо носа нарисовал ", ".", thermometer,TypeAction.PASSIVE_ACTIVE);
		he.action("Незнайке неизвестно для чего ", " нарисовал ", ".", ears, TypeAction.PASSIVE_ACTIVE);
		neznaika.work("Словом, ", " всех изобразил в смешном и нелепом виде.");
		he.action("К утру ", " развесил эти ", "", portraits, TypeAction.PASSIVE_ACTIVE);
		wall.action("на", " и ");
		writing.action("сделал под ними ", ",");
		exhibition.action("так что получилась целая ", ".");
		pilyulkin.action("Первый проснулся ","",".", zero ,TypeAction.PASSIVE_ACTIVE);
		he.action(""," увидел ", "", portraits , TypeAction.PASSIVE_ACTIVE);
		wall.action("на", " и стал смеяться.");
		portraits.action("", " ему так понравились", ",", zero, TypeAction.PASSIVE_ACTIVE);
		he.action("что ", " даже нацепил ", " на нос ", eyeglasses, TypeAction.PASSIVE_ACTIVE);
		portraits.action("и стал рассматривать ", " очень ", "внимательно.", zero, TypeAction.PASSIVE_ACTIVE);
		he.action("", " подходил к каждому ", " и долго смеялся.", portraits2, TypeAction.PASSIVE_ACTIVE);


		//Это что касается 4ой лабы
		class Promotion {
			public void advertise() {
				MyLogger.log.log(Level.INFO, "А спонсор сегодняшней лабораторной работы - Бессонная ночь." +
								   "Бессонная ночь - нет сил, зато была куча времени!");
			}
		}
		Promotion kibitzer = new Promotion();

		kibitzer.advertise();

		People.AboutPeople.printInfo();

		People.Organ pilyulkinHands = pilyulkin.new Organ("правой рукой");
		try {
			pilyulkinHands.process("", " помахал ", " когда увидел, что Мартин проверяет эту лабораторную работу.");
		} catch (OrganException e) {
			MyLogger.log.log(Level.WARNING,"Проблемы с органом", e);
		}

		NonExistent nonItem = new NonExistent() {
			@Override
			public void action() {
				MyLogger.log.log(Level.INFO, "Меня не существует вообще-то");
			}
		};
		nonItem.action();

	}


}