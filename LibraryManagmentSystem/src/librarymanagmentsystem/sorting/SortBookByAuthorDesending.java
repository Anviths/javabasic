package librarymanagmentsystem.sorting;

import java.util.Comparator;

import librarymanagmentsystem.model.Book;

public class SortBookByAuthorDesending implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.getAuthor().compareTo(o1.getAuthor());
	}

}
