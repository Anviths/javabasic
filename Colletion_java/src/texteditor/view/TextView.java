package texteditor.view;

import texteditor.controller.TextEditorController;

public class TextView {

	public static void main(String[] args) {

		TextEditorController controller = new TextEditorController();
		while (true) {
			System.out.println("\n1.save\n2.undo\n3.redo\n4.display\n5.add to dictonary\n6.exit");
			System.out.println("enter the choice");
			int choice = controller.read.nextInt();
			controller.read.nextLine();

			switch (choice) {
			case 1:
				controller.save();
				break;
			case 2:
				controller.undo();
				break;
			case 3:
				controller.redo();
				break;
			case 4:
				controller.display();
				break;
			case 5:
				controller.addToDictionary();
				break;
			case 6:
				return;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
}
