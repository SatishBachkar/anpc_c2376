package com.anudip.jpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.anudip.jpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
	//Fetching User Data By Using UserName From DataBase
	@Query("select u from User u where u.userName=?1")
	List<User> getUserByName(String name);
	
	//Fetching User Data By Using User Address From DataBase
	@Query("select u from User u where u.address=?1")
	List<User> getUserByAddress(String address);
	
	
}
