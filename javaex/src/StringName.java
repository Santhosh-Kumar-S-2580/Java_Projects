import javax.swing.JOptionPane;

public class StringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr = new String [3];
		for (int i=0;i<arr.length;i++) {
			String text= JOptionPane.showInputDialog("Enter the MSG!");
			arr[i]=text;
			System.out.println((i+1)+" ---- > "+arr[i]);
		}
		
	}

}
