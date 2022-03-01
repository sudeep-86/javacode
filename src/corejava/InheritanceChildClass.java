package corejava;
public class InheritanceChildClass extends InheritanceParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceChildClass cd =new InheritanceChildClass();
		cd.colour();
		cd.Breaks();
		cd.AudioSystem();
		cd.Gear();
	}
	
	public void engine() {
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}

	public void AudioSystem()
	{
		System.out.println("audio child system");
	}

}
