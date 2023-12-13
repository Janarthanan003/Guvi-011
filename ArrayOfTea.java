package oopsconcept;

class Tea {
    String name;
    public Tea(String name) {
        this.name = name;
    }
    public void prepareTea() {
        System.out.println("Default method to prepare " + name + " tea. Adjust brewing time accordingly.");
    }
}
	class GreenTea extends Tea {
    public GreenTea() {
        super("Green");
    }  
    public void prepareTea() {
        System.out.println("Preparing " + name + " tea. Brewing time: 2 minutes.");
    }
}
	class BlackTea extends Tea {
    public BlackTea() {
        super("Black");
    }   
    public void prepareTea() {
        System.out.println("Preparing " + name + " tea. Brewing time: 4 minutes.");
    }
}
	class HerbalTea extends Tea {
    public HerbalTea() {
        super("Herbal");
    }
    public void prepareTea() {
        System.out.println("Preparing " + name + " tea. Brewing time: 5 minutes.");
    }
}
		public class ArrayOfTea {
			public static void main(String[] args) {
        Tea[] teas = new Tea[4];
        teas[0] = new Tea("Generic");
        teas[1] = new GreenTea();
        teas[2] = new BlackTea();
        teas[3] = new HerbalTea();
        for (Tea tea : teas) {
            tea.prepareTea();
        }
    }
}