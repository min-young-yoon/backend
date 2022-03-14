package com.example.myboot01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myboot01.Model.BoardDto;



@CrossOrigin("*")
@RestController
public class BackFrontConnectController {

	   @RequestMapping("/guestbook")
	   List<BoardDto> boardList(){
		   List<BoardDto> list = new ArrayList<BoardDto>();
		   list.add(new BoardDto("1","wrter1","title1"));
		   list.add(new BoardDto("2","wrter2","title2"));
		   list.add(new BoardDto("3", "writer3","title3"));
		   list.add(new BoardDto("4", "writer4","title4"));
		   list.add(new BoardDto("5", "writer5","title5"));
		   
		   return list; 
	   }
}
