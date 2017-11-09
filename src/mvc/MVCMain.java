package mvc;

public class MVCMain {
	
	public static void main(String[] args){
		
		// MVC decouples code making it less co-dependent, enhancing code reusability. 
		// Look at it this way each class has a role to play and yet none of the duties 
		// clutter the other, these classes are interconnected/linked.
		
		View view = new View();
		Model model = new Model();
		
		//Control control = new Control(model, view);
		view = new View(new Control(model, view));
		view.setVisible(true);
	}
}
