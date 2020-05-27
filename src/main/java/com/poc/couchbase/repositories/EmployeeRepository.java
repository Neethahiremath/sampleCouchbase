package com.poc.couchbase.repositories;

import com.poc.couchbase.model.Employee;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import java.util.List;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "employee")
public interface EmployeeRepository extends CouchbasePagingAndSortingRepository<Employee, String> {

  List<Employee> findByCompanyName(String companyName);

  @Query("SELECT COUNT(*) AS count FROM #{#n1ql.bucket} WHERE #{#n1ql.filter} and companyName = $1")
  Long countEmployee(String companyName);
}
