package thuchanh.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import thuchanh.domain.product;

public interface productRepository extends CrudRepository<product, String>{
	
}
