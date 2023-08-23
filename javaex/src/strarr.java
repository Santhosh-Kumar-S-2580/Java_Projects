import javax.swing.JOptionPane;

public class strarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= JOptionPane.showInputDialog("Enter the MSG!");
		String [] arr=text.split("");
		for (int i=0;i<arr.length;i++) {
			String txt="(//*[@class='sdasdasd'])["+i+"]";
			System.out.println(txt+" ---- > "+arr[i]);
		}
	}

}
