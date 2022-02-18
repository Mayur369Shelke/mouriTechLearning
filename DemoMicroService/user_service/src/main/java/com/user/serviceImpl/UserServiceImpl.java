package com.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dto.UserDto;
import com.user.entity.User;
import com.user.mapper.UserMapper;
import com.user.repository.UserRepository;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserMapper userMapper;

	@Override
	public UserDto getuser(int userId) {
		User user = userRepository.getById(userId);
		UserDto userDto = userMapper.convertEntityToDto(user);
		return userDto;
	}

}
