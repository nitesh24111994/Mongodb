package com.example.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.document.Users;
import com.example.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
   
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
	//  return Strings -> {
	//	    userRepository.save(new Users(1,"Peter","Designer",300L));
	//	    userRepository.save(new Users(2,"Nitesh","Development",500L));
	//      };	
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				userRepository.save(new Users(1,"Peter","Designer",300L));
				userRepository.save(new Users(2,"Nitesh","Development",500L));
			}
		};
	}
}
