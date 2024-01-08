package com.ty.gamewingmanagementapp.dao;

import com.ty.gamewingmanagementapp.dto.Role;
import com.ty.gamewingmanagementapp.dto.Slots;
import com.ty.gamewingmanagementapp.dto.User;
import com.ty.gamewingmanagementapp.repository.SlotsRepository;
import com.ty.gamewingmanagementapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SlotsDao {
    @Autowired
    private SlotsRepository slotsRepository;
    @Autowired
    private UserRepository userRepository;

    public Slots saveSlots(Slots slot) {
        return slotsRepository.save(slot);
    }

}
