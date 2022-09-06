package s22.Harjoitus2_FriendList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import s22.Harjoitus2_FriendList.domain.Friend;

@Controller
public class FriendController {
	
	ArrayList<Friend> friends = new ArrayList<>();
	
	@GetMapping("/index")
	public String showFriends(Model model) {
		model.addAttribute("friendsList", friends);
		model.addAttribute("friend", new Friend());
		return "index";
	}
	
	@PostMapping("/index")
	public String addFriends(Friend friend) {
		friends.add(friend);
		return "redirect:/index";
	}
	
}


   