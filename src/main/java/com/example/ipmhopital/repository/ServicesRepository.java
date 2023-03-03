package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ServicesRepository extends JpaRepository<Services, Long> {

}
