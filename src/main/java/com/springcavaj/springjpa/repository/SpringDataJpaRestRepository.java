/**
 * 
 */
package com.springcavaj.springjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springcavaj.springjpa.model.User;


/**
 * @author springcavaj
 *
 */
@Repository
public interface SpringDataJpaRestRepository extends JpaRepository<User, Long> {
	
public List<User> findByFirstName(String firstName);
	
	public List<User> findByLastName(String lastName);
	
	public List<User> findByMobileNo(String mobileNo);
	
	public List<User> findByEmail(String email);
	
	public User findByPanNo(String panNo);
	
	@Query("FROM User where firstName = ?1 and lastName = ?2")
	public List<User> findByFirstAndLastName(String firstName, String lastName);

}
