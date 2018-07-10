package cz.ivosahlik.repository;

import cz.ivosahlik.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/07/2018
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
