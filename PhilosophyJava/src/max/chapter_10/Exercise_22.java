package max.chapter_10;

import java.util.ArrayList;
import java.util.List;

public class Exercise_22 {

	public Exercise_22() {
		
		GreenhouseControls gc = new GreenhouseControls();
		// Вместо жесткой фиксации параметров в коде
		// можно было бы считать информацию
		// из текстового файла:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
		gc.new ThermostatNight(0),
		gc.new LightOn(200),
		gc.new LightOff(400),
		gc.new WaterOn(600),
		gc.new WaterOff(800),
		gc.new GreenhouseOn(300),
		gc.new GreenhouseOff(400),
		gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		gc.addEvent(gc.new Terminate(0));
		gc.run();
	}

	public abstract class Event {
		private long eventTime;
		protected final long delayTime;
		public Event(long delayTime) {
			this.delayTime = delayTime;
			start();
			}
		public void start() { // С возможностью перезапуска
			eventTime = System.nanoTime() + delayTime;
		}
		public boolean ready() {
			return System.nanoTime() >= eventTime;
		}
			public abstract void action();
	}
	
	public class Controller {
// 		Класс из пакета java.util для хранения объектов Event:
		private List<Event> eventList = new ArrayList<Event>();
		public void addEvent(Event c) { eventList.add(c); }
		public void run() {
			while(eventList.size() > 0)
// 				Создать копию, чтобы избежать модификации списка
// 				во время выборки элементов:
				for(Event e : new ArrayList<Event>(eventList)) {
					if(e.ready()) {
						System.out.println(e);
						e.action();
						eventList.remove(e);
					}
				}
		}
	}
	
	public class GreenhouseControls extends Controller {
		
		private boolean airing = false;
		public class GreenhouseOn extends Event {
			public GreenhouseOn(long delayTime) {
				super(delayTime);
			}
			@Override
			public void action() {
				// TODO Auto-generated method stub
				airing = true;
			}
			public String toString() {
				return "Проветривание On";
			}
		}
		public class GreenhouseOff extends Event {
			public GreenhouseOff(long delayTime) {
				super(delayTime);
			}
			@Override
			public void action() {
				// TODO Auto-generated method stub
				airing = false;
			}
			public String toString() {
				return "Проветривание Off";
			}
		}
		
		private boolean light = false;
		public class LightOn extends Event {
			public LightOn(long delayTime) { super(delayTime); }
			public void action() {
//		 Поместите сюда код управления оборудованием,
// 		выполняющий непосредственное включение света,
				light = true;
				}
			public String toString() { return "Свет включен"; }
		}
		public class LightOff extends Event {
			public LightOff(long delayTime) { super(delayTime); }
			public void action() {
//		 Поместите сюда код управления оборудованием,
//		 выполняющий выключение света,
				light = false;
			}
			public String toString() { return "Свет выключен"; }
		}
		private boolean water = false;
		public class WaterOn extends Event {
			public WaterOn(long delayTime) { super(delayTime); }
			public void action() {
//		 Здесь размещается код управления оборудованием,
				water = true;
			}
			public String toString() {
				return "Полив включен";
			}
		}
		public class WaterOff extends Event {
			public WaterOff(long delayTime) { super(delayTime); }
			public void action() {
// 		Здесь размещается код управления оборудованием,
				water = false;
			}
			public String toString() {
				return "Полив выключен";
			}
		}	
		
		private String thermostat = "День";
		public class ThermostatNight extends Event {
			public ThermostatNight(long delayTime) {
				super(delayTime);
			}
			public void action() {
//		 Здесь размещается код управления оборудованием,
				thermostat = "Ночь";
			}
			public String toString() {
				return "Термостат использует ночной режим";
			}
		}
		public class ThermostatDay extends Event {
			public ThermostatDay(long delayTime) {
				super(delayTime);
			}
			public void action() {
//				 Здесь размещается код управления оборудованием,
				thermostat = "День";
			}
			public String toString() {
				return "Термостат использует дневной режим";
			}
		}
//		 Пример метода action(), вставляющего новый экземпляр
// 		самого себя в список событий:
		public class Bell extends Event {
			public Bell(long delayTime) { super(delayTime); }
			public void action() {
				addEvent(new Bell(delayTime));
			}
			public String toString() { return "Бам!"; }
		}
		public class Restart extends Event {
			private Event[] eventList;
			public Restart(long delayTime, Event[] eventList) {
				super(delayTime);
				this.eventList = eventList;
				for(Event e : eventList)
					addEvent(e);
			}
			public void action() {
				for(Event e : eventList) {
					e.start(); // Перезапуск каждого события
					addEvent(e);
				}
				start(); // Перезапуск текущего события
				addEvent(this);
			}
			public String toString() {
				return "Перезапуск системы";
			}
		}
		public class Terminate extends Event {
			public Terminate(long delayTime) { super(delayTime); }
			public void action() { System.exit(0); }
			public String toString() { return "Отключение"; }
		}
	}
	
	
	
	
}
