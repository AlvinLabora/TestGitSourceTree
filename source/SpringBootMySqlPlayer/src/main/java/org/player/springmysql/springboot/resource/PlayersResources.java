package org.player.springmysql.springboot.resource;

import java.util.List;

import org.player.springmysql.springboot.repository.Players;
import org.player.springmysql.springboot.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/rest/player")
public class PlayersResources {
	@Autowired
	PlayersRepository playersRepository;
	
	@GetMapping(value = "/getall")
	public List<Players> getAll(){
		return playersRepository.findAll();
	}
	@PostMapping(value ="/add")
	public List<Players> persist(@RequestBody final Players player){
		playersRepository.save(player);
		return playersRepository.findAll();	
	}

}
