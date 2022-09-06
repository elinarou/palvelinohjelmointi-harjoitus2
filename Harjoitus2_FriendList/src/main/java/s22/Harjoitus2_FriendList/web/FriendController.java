package s22.Harjoitus2_FriendList.web;

//import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import s22.Harjoitus2_FriendList.domain.Friend;

@Controller
public class FriendController {
	
	@GetMapping("/index")
	public String showFriends(Model model) {

		model.addAttribute("friend", new Friend());
		
		// Alla oleva listaus ei ole valmis
		//ArrayList<Friend> friends = new ArrayList<>();
		//friends.add();
		//model.addAttribute("friendsList", friends);
		
		return "index";
	}
	
	@PostMapping("/index")
	public String addFriends(@ModelAttribute Friend friend, Model model) {
		model.addAttribute("friend", friend);
		return "index";
	}
	
}


   