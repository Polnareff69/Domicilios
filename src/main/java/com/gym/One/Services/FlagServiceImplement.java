package com.gym.One.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.One.Dao.FlagDao;
import com.gym.One.Entity.Flag;

import jakarta.transaction.Transactional;

@Service
public class FlagServiceImplement implements FlagService {
	@Autowired
	private FlagDao FlagDao;
	
	@Override
	@Transactional
	public Flag findById(Long id) {
		return FlagDao.findById(id).orElse(null);
	}

}
