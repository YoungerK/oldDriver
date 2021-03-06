package com.drive.service.interfaces;

import com.drive.service.domain.request.UserAuthRequest;
import com.drive.service.domain.request.UserRegistRequest;
import com.drive.service.domain.response.UserAuthResponse;
import com.drive.service.domain.response.UserRegistResponse;

public interface IUserManagerService {

	public UserRegistResponse registe(UserRegistRequest userRegistRequest);
	
	public UserAuthResponse authenticate(UserAuthRequest userAuthResquest);
	
}
