package com.example.demo.dao;

import com.example.demo.model.HomeAddress;
import com.example.demo.repository.HomeAddressRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HomeAddressDAO {
    HomeAddressRepository homeAddressRepository;
    public HomeAddressDAO(HomeAddressRepository homeAddressRepository){
        this.homeAddressRepository = homeAddressRepository;
    }
    public HomeAddress addHomeAddress (HomeAddress homeAddress){
        return homeAddressRepository.save(homeAddress);
    }
}
