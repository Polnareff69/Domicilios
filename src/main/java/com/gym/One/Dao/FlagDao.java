package com.gym.One.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.One.Entity.Flag;


@Repository
public interface FlagDao extends JpaRepository<Flag, Long> {

}
