package com.ebelemgnegre.UserService.repository;

import com.ebelemgnegre.UserService.model.Movie;
import com.ebelemgnegre.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByReferenceId(Long referenceId);
}
