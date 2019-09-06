package io.swagger.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.History;

@Repository
public interface HistoryRepository extends MongoRepository<History, String> 
{
	List<History> findByEmployeeId(String employeeId);
}
