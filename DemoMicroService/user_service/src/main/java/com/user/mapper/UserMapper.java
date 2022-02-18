package com.user.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.dto.UserDto;
import com.user.entity.User;

@Component
public class UserMapper {
	
	@Autowired
	ModelMapper modelMapper;
	
	public UserDto convertEntityToDto(User user) {
		return modelMapper.map(user, UserDto.class);
		
	}

	public User convertDtoToEntity(UserDto userDto) {
		return modelMapper.map(userDto, User.class);
	}
}
