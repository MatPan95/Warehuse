package com.Januszex.Warehuse.JPA.Person;

import com.Januszex.Warehuse.JPA.Base.BaseRepo;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonRepo<T> extends BaseRepo<T> {

}
