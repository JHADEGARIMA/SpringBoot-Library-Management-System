package com.gj.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public void createBook(Book book) throws Exception{
        if(bookRepository.findById(book.getId()).get()!= null){
            throw new Exception("Book is already Present");
        }
        bookRepository.save(book);
    }
    public Book getBookById(int id) throws Exception{

        Book book = bookRepository.findById(id).get();
        return book;
    }

    public void updateBookPages(UpdatePageDto updatePageDto){
        Book book = bookRepository.findById(updatePageDto.getId()).get();
        book.setPage(updatePageDto.getPage());
        bookRepository.save(book);

    }

    public List<ResponseObj> getBookAndAuthor() throws Exception{
        //getting all books and all authors in a book object
        List<Book> bookList = bookRepository.findAll();

        //creating an arraylist for responseObj
        List<ResponseObj> ansList = new ArrayList<>();

        //storing book data into ansList
        for (Book book:bookList){
            ResponseObj obj = new ResponseObj();
            obj.author= book.getAuthor();
            obj.name = book.getName();
            ansList.add(obj);
        }

        return ansList;
    }
}
