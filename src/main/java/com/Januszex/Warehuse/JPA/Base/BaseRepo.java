package com.Januszex.Warehuse.JPA.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


@NoRepositoryBean
public interface BaseRepo<T> extends JpaRepository<T, Long> {
}
