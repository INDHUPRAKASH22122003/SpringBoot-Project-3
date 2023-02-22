package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
		@GetMapping("/Welcome")
		public String getMyFav()
		{
				String color="Blue" ;
				return "My favorite color is "+color;
		}
}
