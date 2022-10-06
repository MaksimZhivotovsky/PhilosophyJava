package max.chapter_7;

public class Exercise_14 {

	public Exercise_14() {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.servise();
	}
}
class Engine {
	public void start() {} // запустить
	public void rev() {} // переключить
	public void stop() {} // остановить
	public void servise() {} //servise
}
//колесо
class Wheel {
	public void inflate(int psi) {} // накачать
}
//окно
class Window {
	public void rollup() {} // поднять
	public void rolldown() {} // опустить
}
//дверь
class Door {
	public Window window = new Window(); // окно двери
	public void open() {} // открыть
	public void close() {} // закрыть
}
//машина
class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door
	left = new Door(),
	right = new Door(); // двухдверная машина
public Car() {
	for(int i = 0; i < 4; i++)
		wheel[i] = new Wheel();
	}
}
