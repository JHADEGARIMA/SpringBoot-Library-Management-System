package com.gj.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping ("/add_book")
    public void addBook(@RequestBody() Book book){
        try{
            bookService.createBook(book);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

    }

    @GetMapping ("/get_book")
    public Book getBookById(@RequestParam int id) {
        try {
            Book book = bookService.getBookById(id);
            return book;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }
    @PutMapping (value = "/update_page")
    public void updateBookPage(@RequestBody() UpdatePageDto updatePageDto){
        bookService.updateBookPages(updatePageDto);
    }

    @GetMapping("/get_all_book_name_and_author")
    public List<ResponseObj> getBookNameAndAuthor(){
        try{
            List<ResponseObj> response = bookService.getBookAndAuthor();
            return response;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

    }


}
