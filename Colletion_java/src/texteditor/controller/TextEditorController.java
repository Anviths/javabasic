package texteditor.controller;

import java.util.LinkedList;
import java.util.Scanner;

public class TextEditorController {

	public LinkedList<String> textList = new LinkedList<String>();
	public LinkedList<String> dictionary = new LinkedList<String>();
	
	public Scanner read = new Scanner(System.in);
	int position = -1;

	public void save() {
		while(position<textList.size()-1) {
			textList.removeLast();
		}
		
		System.out.println("have a auto suggest press y");
		char ans=read.next().charAt(0);
		String text="";
		if(ans=='y') {
		 System.out.println("enter the  letter");
			String auto=autoSugesstion(read.next());
			if(auto!=null)
				text=auto;
			else {
				read.nextLine();
				System.out.println(" could not found  enter the full text");
				text=read.nextLine();
			}
		}
		else {
			read.nextLine();
			System.out.println("enter the text");
			text=read.nextLine();
		}

		textList.add(text);
		position++;


	}

	public void undo() {
		if (position > -1)
			position--;

	}

	public void redo() {
		if (position < textList.size() - 1)
			position++;

	}

	public void display() {
		if (position > -1) {
			for (int i = 0; i <= position; i++)
				System.out.print(textList.get(i) + " ");
		}
	}
	public void addToDictionary() {
		System.out.println("enter exit to quit");
		System.out.println("enter the word");
		String word="";
		while(true) {
			word=read.nextLine();
			if(word.equalsIgnoreCase("exit")) {
				break;
			}
			dictionary.add(word);
		}
		System.out.println(dictionary.size()+"word added sucessfully");
	}

	public String autoSugesstion(String word) {

		int i=0;
		for(String words:dictionary) {
			if(words.startsWith(word)) {
				i++;
				System.out.println(i+"."+words);
			}
		}
		
		System.out.println("enter the choice");
		int n=read.nextInt();
		n--;
		if(n<i && n>0)
		return dictionary.get(n);
		
		return null;
	}
}
