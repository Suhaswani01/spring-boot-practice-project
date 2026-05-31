package com.example.LibraryManagmentSystem.Controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LibraryManagmentSystem.model.Book;


@Controller
@RequestMapping("/library")
public class LibraryController {
	
	    private static List<Book> books =   new ArrayList<>();
        private static int idCounter = 1;


 static {
books.add(new Book(1, 
"Java Basics", "James", 299.0));
books.add(new Book(2, 
"Spring Boot", "Rod Johnson", 499.0));
books.add(new Book(3, 
"Python Guide", "Guido", 399.0));
}
	 
	@GetMapping("/home")
	public String Home (){
		return "index";
	} 
	
	@GetMapping("/all")
	public String all(Model model) {
		model.addAttribute("books",books);
		return"Allbooks";
		
	}
	@GetMapping("/form")
    public String showForm() {
        return "form";
    }

	 @PostMapping("/save")
	    public String saveBook(
	        @RequestParam("title")  String title,
	        @RequestParam("author") String author,
	        @RequestParam("price")  double price,
	        Model model) {

	        
	        Book b = new Book( ++idCounter, title, author, price);

	        
	        books.add(b);

	        
	        model.addAttribute("book", b);

	        return "result";
	    }
	
	   @GetMapping("/search/{id}")
	    public String searchBook(
	        @PathVariable("id") int id,
	        Model model) {

	        Book found = null;

	        for(Book b : books) {
	            if(b.getId() == id) {
	                found = b;
	                break;
	            }
	        }

	        model.addAttribute("book", found);
	        return "result";
	    }
	
	
}
