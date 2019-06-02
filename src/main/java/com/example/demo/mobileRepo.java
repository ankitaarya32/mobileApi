package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.mobileApi;

@RepositoryRestResource(collectionResourceRel="mobiles",path="mobiles")
public interface mobileRepo extends JpaRepository<mobileApi,Integer> {

}
