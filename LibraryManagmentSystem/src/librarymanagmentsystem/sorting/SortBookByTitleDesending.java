package librarymanagmentsystem.sorting;

import java.util.Comparator;

import librarymanagmentsystem.model.Book;

public class SortBookByTitleDesending implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.getTitle().compareTo(o1.getTitle());
	}

}