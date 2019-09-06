package io.swagger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.UserLeaves;

@Repository
public interface LeaveRepository extends MongoRepository<UserLeaves, String>
{
	UserLeaves findByEmployeeId(String employeeId);
}
