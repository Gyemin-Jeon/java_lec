package pkg00_Bus;

public class BusEx {

  public static void main(String[] args) {

    Bus bus = new Bus(5);
    
    bus.on(new Man("톰"));
    bus.on(new Man("에릭"));
    bus.on(new Man("케인"));
    bus.on(new Man("야말"));
    bus.on(new Man("자카"));
    bus.on(new Man("찰놀"));   
    bus.info();
    
    bus.off(3);    
    bus.info();
    
    bus.on(new Woman("메시"));   
    bus.info();

  }

}
